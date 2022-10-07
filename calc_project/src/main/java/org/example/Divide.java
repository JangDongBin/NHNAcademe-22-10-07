package org.example;

public class Divide {
    public static void divide(int num1, int num2) throws Exception {
        // 나눗셈 검증
        if (num1 == 0) {
            System.out.println("0");
        } else if (num2 == 0) {
            throw new Exception("나누는 숫자가 0입니다.");
        } else {
            System.out.println((double) num1 / num2);
        }
    }
}
