package com.company.daysOfCode;

import java.util.Scanner;

public class Day20 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for (int a_i = 0; a_i < n; a_i++) {
      a[a_i] = in.nextInt();

    }

    int count = 0;

    for (int i = 0; i <= a.length; ++i) {
      for (int j = 1; j < a.length; j++) {
        if (a[j - 1] > a[j]) {
          int moveNumber = a[j - 1];
          a[j - 1] = a[j];
          a[j] = moveNumber;
          count++;
        }
      }
    }
    System.out.println("Array is sorted in " + count + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);
  }
}