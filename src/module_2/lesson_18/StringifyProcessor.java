package module_2.lesson_18;

import java.lang.reflect.Field;

public class StringifyProcessor {
    public static String process(Object object) {
        Class<?> clazz = object.getClass();
        Stringify annotation = clazz.getDeclaredAnnotation(Stringify.class);
        if (annotation == null) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " needs to have @Stringify annotation to" +
                    " be processed.");
        }

        StringBuilder sb = new StringBuilder();
        if (annotation.includeClassName()) {
            sb.append(clazz.getSimpleName());
            sb.append("\n");
        }
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            StringifyIgnore stringifyIgnore = field.getDeclaredAnnotation(StringifyIgnore.class);
            if (stringifyIgnore != null) {
                continue;
            }
            StringifyFieldName stringifyFieldName = field.getDeclaredAnnotation(StringifyFieldName.class);
            try {
                field.setAccessible(true);
                String name = stringifyFieldName == null ? field.getName() : stringifyFieldName.value();
                sb.append(name).append(annotation.equalSign()).append(field.get(object));
                if (i != fields.length - 1) {
                    sb.append(annotation.fieldSeparator());
                }
                field.setAccessible(false);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return sb.toString();
    }
}
