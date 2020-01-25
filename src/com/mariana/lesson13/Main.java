package com.mariana.lesson13;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Class<?> clazz = main.getClass();
        try {
            Method method = clazz.getDeclaredMethod("newMethod", String.class);
            if((!method.isAnnotationPresent(MyAnnotation.class))) {
                return;
            }
            final MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            method.invoke(null, annotation.value());

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @MyAnnotation("test")
    public static void newMethod(String str) {
        System.out.println(str);
    }
}
