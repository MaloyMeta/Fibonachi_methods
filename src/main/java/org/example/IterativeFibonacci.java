package org.example;

public class IterativeFibonacci {
    public static int calculate(int num){
        if (num == 0 || num == 1){
            return num;
        }

        int prev = 0;
        int curr = 1;

        for(int i = 2; i <= num; i++){
            int next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
