package com.chamrong;

public class Dog extends Animal {
  public Dog() {}

  public Dog(String name) {
    super(name);
  }

  @Override
  protected void makeSound() {
    System.out.println("Woof Woof!");
  }
}
