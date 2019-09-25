package me.helloworld.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jacob
 * @date 2019/9/25
 */
public class ProxyHandler implements InvocationHandler {

    private Object proxy;

    public ProxyHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object res = method.invoke(this.proxy, args);
        System.out.println("after");
        return res;
    }
}
