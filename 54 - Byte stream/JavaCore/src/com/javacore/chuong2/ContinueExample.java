package com.javacore.chuong2;

/**
 * Cách sử dụng continue trong vòng lặp
 * @author Bryan Lee
 *
 */
public class ContinueExample {

  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        continue;
      }
      // Khi i == 5 thì không in i = 5 ra màn hình
      System.out.println(i);
    }
  }
}
