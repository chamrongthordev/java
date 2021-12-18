package com.chamrong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      String name = inputName("Lam");
      displayName(name);
    }

  private static void displayName(String name) {
    System.out.println("Name: " + name);
  }

  private static String inputName(String name) {
    Scanner input = new Scanner(System.in);
    return input.nextLine();
  }
}
