/*Objective
        Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

        Task
        Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

        Input Format

        A single integer, .

        Constraints

        Output Format

        Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .

        Sample Input 1

        5
        Sample Output 1

        1
        Sample Input 2

        13
        Sample Output 2

        2
        Explanation

        Sample Case 1:
        The binary representation of  is , so the maximum number of consecutive 's is .

        Sample Case 2:
        The binary representation of  is , so the maximum number of consecutive 's is .
        */


package com.company.daysOfCode;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Day10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0, max = 0;
        while (n > 0) {
            int rem = n % 2;
            if (rem == 1) counter++;
            else counter = 0;
            max = Math.max(counter, max);
            n /= 2;
        }
        System.out.println(max);
    }
}