package com.chamrong;

public class Main {

  public static void main(String[] args) {
    printLove5Times("Love");
    printLove5TimesWithDoWhile("Love");
  }

  private static void printLove5TimesWithDoWhile(String love) {
    int i = 0;
    do {
      System.out.println(love);
      i++;
    } while (i > 5);
  }

  private static void printLove5Times(String love) {
    int i = 0;
    while (true) {
      i++;
      if (i > 5)
        break;
      System.out.println(love);
    }
  }
}
