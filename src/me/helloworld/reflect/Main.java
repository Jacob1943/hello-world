package me.helloworld.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Jacob
 * @date 2019/8/28
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        Class clazz = Class.forName("me.helloworld.reflect.Student");
        Student stu = (Student)clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        //对于私有方法和私有字段需要设置为true才能调用和赋值
        name.setAccessible(true);
        name.set(stu, "王小明");
        Method study = clazz.getDeclaredMethod("study", String.class);
        study.setAccessible(true);
        Object res = study.invoke(stu, "English");
        System.out.println(res);

        Method speakName = clazz.getMethod("speakName");
        res = speakName.invoke(stu);
        System.out.println(res);

    }
}
