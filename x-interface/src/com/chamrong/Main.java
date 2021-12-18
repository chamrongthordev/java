package com.chamrong;

public class Main {

    public static void main(String[] args) {
        var crud = new UserController();
        System.out.println(crud.create());
        System.out.println(crud.get());
        System.out.println(crud.update());
        System.out.println(crud.delete());
    }
}
