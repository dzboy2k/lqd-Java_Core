package com.javacore.chuong2;

/**
 * cách sử dụng vòng lặp
 * @author Bryan Lee
 *
 */
public class LoopExample {

  public static void main(String[] args) {

    // In nội dung các số ra màn hình sử dụng vòng lặp for
    System.out.println("Sử dụng vòng lặp for");
    for (int i = 1;i <= 10;i++) {
      System.out.println(i);
    }

    // In nội dung các số ra màn hình sử dụng vòng lặp while
    System.out.println("Sử dụng vòng lặp while");
    int i = 1;
    while (i <= 10) {
      System.out.println(i);
      i++;
    }


    //gán lại giá trị của biến đếm là 1
    i = 1;
    //In nội dung các số ra màn hình sử dụng vòng lặp do - while
    System.out.println("Sử dụng vòng lặp do - while");
    do {
      System.out.println(i);
      i++;
    } while (i <=10);
  }

}
