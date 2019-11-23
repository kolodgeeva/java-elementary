package com.mariana.lesson1;

public class NewClass {

    public static void main(String[] args) {
        Long factorial = recursionFactorial(25L);
        System.out.println(factorial);
    }

    public static Integer factorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException();
        }

        int result = 1;

        if (number == 0) {
            return result;
        }

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static Long recursionFactorial(Long number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }

        if (number == 0) {
            return 1L;
        }

        return number * recursionFactorial(number - 1);

    }

}
