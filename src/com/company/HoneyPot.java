package com.company;

import java.lang.reflect.Array;

public class HoneyPot {


  static int[] getOneBits(int n) {

    String binary = Integer.toBinaryString(n);
    String[] integerStrings = binary.split("");
    int[] integers = new int[integerStrings.length];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = Integer.parseInt(integerStrings[i]);
    }
    int resultLenght = 0;
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] == 1) {
        resultLenght++;
      }
    }

    StringBuilder sb = new StringBuilder();
    sb.append(resultLenght);
    for (int j = 0; j < integers.length; j++) {
      if (integers[j] == 1) {
        sb.append(j);
      }
    }

    String[] bitsStrings = sb.toString().split("");
    int[] bits = new int[bitsStrings.length];
    for (int i = 0; i < bitsStrings.length; i++) {
      if (i == 0) {
        bits[i] = Integer.parseInt(bitsStrings[i]);
      } else {
        bits[i] = Integer.parseInt(bitsStrings[i]) + 1;
      }
    }
    return bits;
  }

  public static void main(String[] args) {

    int bits [] = getOneBits(345334);

    for (int i = 0; i <bits.length ; i++) {
      System.out.println(bits[i]);
    }


  }

}
