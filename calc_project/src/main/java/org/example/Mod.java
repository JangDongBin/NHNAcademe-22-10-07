package org.example;

public class Mod {
    public int getMod(int first, int second) {
        if(first != 0) {
            return first % second;
        } else {
            return 0;
        }
    }
}
