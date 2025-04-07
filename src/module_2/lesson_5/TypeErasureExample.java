package module_2.lesson_5;

public class TypeErasureExample<T> {
    private Class<T> aClass;

    public TypeErasureExample(Class<T> aClass) {
        this.aClass = aClass;
    }

    public void createInstance() {
        try {
            // new T()
            T instance = aClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
