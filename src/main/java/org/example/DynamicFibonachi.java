package org.example;

public class DynamicFibonachi {
    public static int calculate(int num){
        int[] fibo = new int[num + 1];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= num; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[num];
    }
}
