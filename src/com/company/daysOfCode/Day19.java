package com.company.daysOfCode;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

public class Day19 {


    public static class Calculator implements AdvancedArithmetic {
        public int divisorSum(int n) {
            int sum = 0;
            for (int i = 1; i < n + 1; i++) {
                if (n % i == 0) {
                    int newSum = n / i;
                    sum = sum + newSum;
                }
            }

            return sum;
        }
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Day19.Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}