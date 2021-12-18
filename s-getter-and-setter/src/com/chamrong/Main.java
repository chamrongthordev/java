package com.chamrong;

public class Main {

    public static void main(String[] args) {
        var obj = new Student();
        obj.setFirstName("Chamrong");
        obj.setLastName("Thor");
        System.out.println("First name: " + obj.getFirstName());
        System.out.println("Last name: " + obj.getLastName());
    }
}
