package com.chamrong;

public class Main {

    public static void main(String[] args) {
      byte byteNumber = 100;
      short shortNumber = 200;
      int intNumber = 10;
      long longNumber = 300L;
      float floatNumber = 10.0F;
      char characture = 'A';
      double doubleNumber = 10.0;

      String string = "Chamrong";

      print();
    }

    public static void print() {
        int age = 24;
        System.out.println("age (before): " + age);

        age = 18;
        System.out.println("age (after): " + age);
    }
}
