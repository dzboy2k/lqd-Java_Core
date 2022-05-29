package com.javacore.chuong2;

/**
 * Cách sử dụng câu lệnh Break
 * @author Bryan Lee
 *
 */
public class BreakExample {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break;
      }
      // Không in ra giá trị 5
      System.out.println(i);
    }
  }
}
