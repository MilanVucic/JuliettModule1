package module_2.lesson_17;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        Class<Example> clazz = Example.class;
        try {
            Example e = new Example(55, 22);
            Field f = clazz.getDeclaredField("a");
            f.setAccessible(true);
            f.set(e, 33);
            f.setAccessible(false);
            System.out.println(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void constructors(Class<Example> clazz) {
        try {
            Constructor<Example> constructor = clazz.getDeclaredConstructor(int.class);
            constructor.setAccessible(true);
            Example e = constructor.newInstance(123);
            constructor.setAccessible(false);
            System.out.println(e.getA());
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void methods(Class<Example> clazz) {
        try {
            Method m1 = clazz.getDeclaredMethod("privateMethod");
            Method m2 = clazz.getDeclaredMethod("privateMethod", int.class);
            System.out.println(m1.getReturnType());
            System.out.println(m2.getReturnType());
            m1.setAccessible(true);
            m2.setAccessible(true);
            Example instance = new Example(2, 3);
            Example instance2 = new Example(43, 3);
            m2.invoke(instance, 5);
            m2.invoke(instance2, 5);
            m1.setAccessible(false);
            m2.setAccessible(false);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fields(Class<Example> clazz) {
        Field[] fields = clazz.getFields();
        Field[] declaredFields = clazz.getDeclaredFields();
        try {
            Field f = clazz.getDeclaredField("a");
            // 001000001001 -- ALL MODIFIERS
            // AND
            // 0000000001000
            // 000000000?000
            System.out.println(f.getModifiers());
            boolean isPublic = (Modifier.PUBLIC & f.getModifiers()) > 0;
            boolean isStatic = (Modifier.STATIC & f.getModifiers()) > 0;
            System.out.println(isPublic);
            System.out.println(isStatic);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
