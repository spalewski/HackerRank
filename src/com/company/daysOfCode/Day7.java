/*
Objective
        Today, we're learning about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video!

        Task
        Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

        Input Format

        The first line contains an integer,  (the size of our array).
        The second line contains  space-separated integers describing array 's elements.

        Constraints

        , where  is the  integer in the array.
        Output Format

        Print the elements of array  in reverse order as a single line of space-separated numbers.

        Sample Input

        4
        1 4 3 2
        Sample Output

        2 3 4 1


*/
package com.company.daysOfCode;

import java.util.Scanner;

public class Day7 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    in.close();

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = n - 1; i >= 0; i--) {
      stringBuilder.append(arr[i]);
      stringBuilder.append(" ");
    }
    System.out.println(stringBuilder);
  }
}