package com.chamrong;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        printIf("a");
        printIfElse("b");
        printElseIfElse("c");
    }

    private static void printElseIfElse(String term) {
    if (Objects.equals(term, "c")) System.out.println("a == " + term);
    else if (Objects.equals(term, "a")) System.out.println("b == " + term);
    else System.out.println("nothing!");
    }

    private static void printIfElse(String term) {
    if (Objects.equals(term, "a")) System.out.println("a == " + term);
    else System.out.println("a == " + term);
    }

    private static void printIf(String term) {
    if (Objects.equals(term, "a")) System.out.println("a = " + term);
    }
}
