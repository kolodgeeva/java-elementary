package com.mariana.lesson12;

import java.io.*;

public class Main {

    private final static String FILE_CAT = "cat.dat";
    private final static String FILE_DOG = "dog.dat";

    public static void main(String[] args) {

        final Cat cat = new Cat("Cat1", 10, 20, new Passport("123"));
        writeObject(cat, FILE_CAT);

        final Cat cat2 = readObject(FILE_CAT);
        System.out.println(cat2);

        final Dog dog = new Dog("Dog2", 10, 20, new Passport("123"));
        writeObject(dog, FILE_DOG);

        final Dog dog2 = readObject(FILE_DOG);
        System.out.println(dog2);

    }

    private static <T extends Serializable> void writeObject(final T object, final String filename) {
        try (FileOutputStream outputStream = new FileOutputStream(filename);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> T readObject(final String filename) {
        try (FileInputStream inputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            Object object = objectInputStream.readObject();
            return (T) object;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
