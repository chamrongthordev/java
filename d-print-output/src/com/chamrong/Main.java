package com.chamrong;

public class Main {

  public static void main(String[] args) {
    printNumber();
    printText();
    printVariable();
    printConcatenatedString();
    printNewLine();
    printSentences();
  }

  private static void printSentences() {
    double pie = 3.1415;
    System.out.println("I am " + pie);
    System.out.println("\nMy value is: " + pie);
  }

  private static void printNewLine() {
    System.out.println("Hello! \n\n");
    System.out.println("Hi");
  }

  private static void printConcatenatedString() {
    int age = 24;
    System.out.println("Age: " + age);
  }

  private static void printVariable() {
    int age = 24;
    double salary = 6000.5;

    System.out.println(age);
    System.out.println(salary);
    System.out.println("age");
  }

  private static void printText() {
    System.out.println("Learn Java");
    System.out.println("I love Java");
  }

  private static void printNumber() {
    System.out.println(5);
    System.out.println(5.6);
    System.out.println(-15.6);
  }
}
