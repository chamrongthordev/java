package com.chamrong;

public class Main {

  public static void main(String[] args) {
    var student = new Student();
    student.setFirstName("Chamrong");
    student.setLastName("Thor");
    student.setAge(21);

    System.out.println("First name: " + student.getFirstName());
    System.out.println("Last name: " + student.getLastName());
    System.out.println("Age: " + student.getAge());
  }
}
