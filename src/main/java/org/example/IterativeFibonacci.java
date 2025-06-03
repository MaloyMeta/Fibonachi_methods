package org.example;

public class IterativeFibonacci {
    public static int calculate(int num){
        int prev = 0;
        int curr = 1;
        switch (num){
            case 0:
                return prev;
            case 1:
                return curr;
        }

        for(int i = 2; i <= num; i++){
            int next = curr + prev;
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
