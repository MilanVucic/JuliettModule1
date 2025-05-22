package module_2.lesson_17.dynamic_proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        SomeInterface proxyExample = new SomeImpl();
        SomeInterface proxy = (SomeInterface) Proxy.newProxyInstance(proxyExample.getClass().getClassLoader(),
                proxyExample.getClass().getInterfaces(), new CustomInvocationHandler(proxyExample));

        proxy.doStuff();
        int res = proxy.doMoreStuff();
        System.out.println(res);
    }
}
