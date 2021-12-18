package com.chamrong;

public class Main {

  public static void main(String[] args) {
    displayHello5Time("Hello");
  }

  private static void displayHello5Time(String hello) {
    for (int i = 0; i < 5; i++) System.out.println(hello);
  }
}
