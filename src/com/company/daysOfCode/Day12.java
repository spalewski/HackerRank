package com.company.daysOfCode;

import java.util.Scanner;

public class Day12 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int A[][] = new int[6][6];
    int sum = 0, overAll = -10000;
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        A[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        sum = A[i][j] + A[i][j + 1] + A[i][j + 2] + A[i + 1][j + 1] + A[i + 2][j] + A[i + 2][j + 1]
            + A[i + 2][j + 2];
        if (sum > overAll) {
          overAll = sum;
        }
      }
    }
    System.out.println(overAll);
  }
}