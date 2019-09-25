package me.helloworld.designpattern.proxy;

/**
 * @author Jacob
 * @date 2019/9/25
 */
public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("I am a cat");
    }
}