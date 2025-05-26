package module_2.lesson_18;

import java.lang.reflect.Field;

public class RangeLimitProcessor {
    public static void validate(Object object) {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            RangeLimit annotation = field.getDeclaredAnnotation(RangeLimit.class);
            if (annotation != null) {
                double min = annotation.min();
                double max = annotation.max();

                try {
                    field.setAccessible(true);
                    Number value = (Number) field.get(object);
                    field.setAccessible(false);
                    if (value.doubleValue() > max || value.doubleValue() < min) {
                        throw new IllegalArgumentException("Field " + field.getName() + "=" + value +
                                " out of valid range " + min + " - " + max);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException("Cannot use @RangeLimit on non numerical types.", e);
                }
            }
        }

    }
}
