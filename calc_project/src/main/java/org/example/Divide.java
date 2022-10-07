package org.example;

public class Divide {
    public int divide(int num1, int num2){
        // 나눗셈 검증
        if (num1 == 0) {
            return -1;
        } else if (num2 == 0) {
            return -1;
        } else {
            return num1 / num2;
        }
    }
}
