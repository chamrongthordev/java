package com.chamrong;

public class Main {

  public static void main(String[] args) {
    sayHelloWorld();
    sayHelloWorld("Hello, World");
    System.out.println(one());
  }

  private static int one() {
    return 1;
  }

  private static void sayHelloWorld() {
    System.out.println("Hello, World!");
  }

  private static void sayHelloWorld(String word) {
    System.out.println(word);
  }
}
