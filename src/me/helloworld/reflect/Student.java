package me.helloworld.reflect;

/**
 * @author Jacob
 * @date 2019/8/28
 */
public class Student {

    private String name;

    private String study(String session) {
        return name + " study " + session;
    }

    public String speakName() {
        return "The student's name is " + name;
    }
}
