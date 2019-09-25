package me.helloworld.designpattern.proxy;

/**
 * @author Jacob
 * @date 2019/9/25
 */
public class Main {

    public static void main(String[] args) {
        //static proxy
        Cat cat = new Cat();
        StaticAgent agent = new StaticAgent(cat);
        agent.say();

        //dynamic proxy
        Animal instance = (Animal) DynamicAgent.agent(Animal.class, cat);
        instance.say();
    }
}






