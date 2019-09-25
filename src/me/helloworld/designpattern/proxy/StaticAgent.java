package me.helloworld.designpattern.proxy;

/**
 * @author Jacob
 * @date 2019/9/25
 */
public class StaticAgent implements Animal {

    private Cat cat;

    public StaticAgent(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void say() {
        System.out.println("before");
        cat.say();
        System.out.println("after");
    }
}