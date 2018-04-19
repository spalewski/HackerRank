package com.company.daysOfCode.Day19;

public class Calculator implements AdvancedArithmetic {

  @Override
  public int divisorSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        int partSum = sum + i;
        sum = partSum;
      }
    }
    return sum;
  }
}
