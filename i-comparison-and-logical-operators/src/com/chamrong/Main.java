package com.chamrong;

public class Main {

    public static void main(String[] args) {
        printComparationOperator(10, 20);
        printLogicalOperator(true, false);
    }

    private static void printLogicalOperator(boolean number1, boolean number2) {
        System.out.println("number1 && number2: " + (number1 && number2));
        System.out.println("number1 || number2: " + (number1 || number2));
        System.out.println("number1 != number2: " + (number1 != number2));
    }

    private static void printComparationOperator(int number1, int number2) {
        System.out.println("number1 > number2: " + (number1 > number2));
        System.out.println("number1 < number2: " + (number1 < number2));
        System.out.println("number1 == number2: " + (number1 == number2));
        System.out.println("number1 != number2: " + (number1 != number2));
        System.out.println("number1 >= number2: " + (number1 >= number2));
        System.out.println("number1 <= number2: " + (number1 <= number2));
    }
}
