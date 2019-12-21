package com.mariana.lesson10.cat;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println(cat);

        Settable<Cat> settable = (entity, name, age) -> {
            entity.setName(name);
            entity.setAge(age);
        };

        changeEntity(cat, settable, "CatName", 20);
        System.out.println(cat);

    }

    public static <T extends WithNameAndAge> void changeEntity(T entity, Settable<T> settable,
                                                               String name, Integer age) {
        settable.set(entity, name, age);
    }

}
