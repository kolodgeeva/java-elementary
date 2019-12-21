package com.mariana.lesson10.cat;

public interface Settable<T extends WithNameAndAge> {
    void set(T entity, String name, Integer age);
}
