package com.javacore.chuong2;

/**
 * Class này mô tả quy tắc đặt tên trong JAVA
 * @author Bryan Lee
 *
 */
public class QuyTacDatTen {

  // Khai báo hằng số
  public static final int HOUR_OF_DAY = 24;

  /**
   * method này để in ra dòng chữ "Have a nice day!"
   */
  public static void sayHello() {

    // Khai báo biến local helloString
    String helloString = "Have a nice day!";

    // in nội dung ra màn hình
    System.out.println(helloString);
  }

  public static void main(String[] args) {
    System.out.println("Một ngày có " + HOUR_OF_DAY + " giờ");

    // gọi method sayHello
    sayHello();
  }

}
