package org.example;

public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.add(1, 1));    

        Minus minus = new Minus();
        System.out.println(minus.minus(1, 1));

        Multiplication mul = new Multiplication();
        System.out.println(mul.multi(1, 1));

        Divide div = new Divide();
        System.out.println(div.divide(1, 1));

        Mod mod = new Mod();
        System.out.println(mod.getMod(1, 1));
    }
}