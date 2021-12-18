package com.chamrong;

public class Main {

    public static void main(String[] args) {
	      arithmeticOperator();
        joinString();

    }

    private static void joinString() {
        System.out.println("Hello, " + "World!");
    }

    private static void arithmeticOperator() {
        float number1 = 10;
        float number2 = 20;

        System.out.println("number1 + number2: " + (number1 + number2));
        System.out.println("number1 - number2: " + (number1 - number2));
        System.out.println("number1 * number2: " + (number1 * number2));
        System.out.println("number1 / number2: " + (number1 / number2));
        System.out.println("number1 % number2: " + (number1 % number2));
    }
}
