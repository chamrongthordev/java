package com.chamrong;

public class Main {

  public static void main(String[] args) {
    checkIsDay("Monday");
  }

  private static void checkIsDay(String day) {
    switch (day) {
      case "Monday":
        System.out.println("It's a first day of a week.");
        break;
      case "Tuesday":
        System.out.println("It's a second day of a week.");
        break;
      case "Weneseday":
        System.out.println("It's a third day of a week.");
        break;
      case "Thursday":
        System.out.println("It's a fourth day of a week.");
        break;
      case "Friday":
        System.out.println("It's a fifth day of a week.");
        break;
      case "Saturday":
        System.out.println("It's a sixth day of a week.");
        break;
      case "Sunday":
        System.out.println("It's a seventh day of a week.");
        break;
      default:
        System.out.println("It's not a day.");
    }
  }
}
