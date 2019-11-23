package com.mariana.lesson5.io;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedInputStream inputStream = new BufferedInputStream(
                new FileInputStream("D:\\test.txt"));

        while (inputStream.available() > 0) {
            char ch = (char) inputStream.read();
            System.out.print(ch);
        }

        inputStream.close();


        BufferedOutputStream outputStream = new BufferedOutputStream(
                new FileOutputStream("D:\\test2.txt"));

        byte[] arr = "Test".getBytes();
        outputStream.write(arr);
        outputStream.close();
    }

}
