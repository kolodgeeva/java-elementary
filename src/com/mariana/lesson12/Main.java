package com.mariana.lesson12;

import java.io.*;

public class Main {

    final static String FILE_NAME = "cat.dat";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat();
        cat.name = "Cat1";

        writeCat(cat);
        System.out.println(readCat());
    }

    private static void writeCat(Cat cat) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(cat);
        outputStream.close();
        objectOutputStream.close();
    }

    private static Cat readCat() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Object object = objectInputStream.readObject();
        inputStream.close();
        objectInputStream.close();
        return (Cat) object;
    }
}
