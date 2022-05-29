package com.javacore.chuong2;

import java.util.Scanner;

/**
 * if - else if - else
 * @author Bryan Lee
 *
 */
public class IfElse {
  public static void main(String[] args) {

    int a;
    Scanner sc = new Scanner(System.in);

    System.out.println("Please input a");

    a = sc.nextInt();

    if (a > 0 ) {
      System.out.println("a >0");
    } else if (a < 0) {
      System.out.println("a < 0");
    } else {
      System.out.println("a = 0");
    }

    //close
    sc.close();
  }
}
