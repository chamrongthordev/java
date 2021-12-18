package com.chamrong;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>();
    // add element
    words.add("love");
    words.add("life");

    // get element
    String v = words.get(1);
    // set element
    words.set(1, "rong");
    System.out.println("Words: " + words);
    for (String word : words) {
      System.out.println("Word: " + word);
    }
    System.out.println("--- " + v);
    System.out.println("---: " + words.get(1));
    // sort
    System.out.println(words.size());
    // remove element
    words.remove(1);
    System.out.println("Words: " + words);
    // get size()
  }
}
