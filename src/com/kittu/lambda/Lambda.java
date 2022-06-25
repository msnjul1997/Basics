package com.kittu.lambda;

import java.util.function.Predicate;

public interface Lambda {
	boolean check(int a);
}

class Examples {
    public static boolean checker(Lambda p, int num) {
        return p.check(num);
    }

    public Lambda isOdd() {
        return (num) -> (num % 2 != 0);
    }

    public Lambda isPalindrome() {
    	Predicate<Integer> num = (x) -> {
            int sum = 0;
            int temp = x;
            while (x > 0) {
                sum = sum*10 + (x % 10);
                x /= 10;
            }
                if (temp == sum) {
                    System.out.println("The number " + temp + " is a palindrom");
                    return true;
                } else {
                    System.out.println("The number " + temp + " is not a palindrom");
                    return false;
                }
        };
		return null;
       
  
    }

}
