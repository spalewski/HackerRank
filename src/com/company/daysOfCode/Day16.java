package com.company.daysOfCode;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Day16 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();

    try {
      int i = Integer.parseInt(S);
      System.out.println(S);
    } catch (NumberFormatException e) {
      System.out.println("Bad String");
    }
  }
}