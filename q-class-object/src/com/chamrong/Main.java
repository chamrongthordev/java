package com.chamrong;

public class Main {

  public static void main(String[] args) {
    var obj = new Person("chamrong", "thor", 21);
    System.out.println("first name: " + obj.getFirstName());
    System.out.println("last name: " + obj.getLastName());
    System.out.println("age: " + obj.getAge());
  }
}
