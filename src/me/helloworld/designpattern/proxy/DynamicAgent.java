package me.helloworld.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * @author Jacob
 * @date 2019/9/25
 */
public class DynamicAgent {

    public static Object agent(Class interfaze, Object proxy) {

        return Proxy.newProxyInstance(interfaze.getClassLoader(), new Class[] {interfaze}, new ProxyHandler(proxy));
    }
}
