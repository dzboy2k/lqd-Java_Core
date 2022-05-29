package com.javacore.chuong2;

import java.util.Scanner;

/**
 * Input & Output
 * @author Bryan Lee
 *
 */
public class InputValueFromKeyboard {
  public static void main(String[] args) {

    // Khởi tạo đối tượng nhập dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);

    // Khai báo biến nhận thông tin từ bàn phím
    String name;
    int age;

    System.out.println("Your name: ");
    name = sc.nextLine();

    System.out.println("Your age : ");
    age = sc.nextInt();

    // In thông tin đã nhập ra màn hình
    System.out.println("Thông tin bạn vừa nhập là : ");
    System.out.println("Name: " + name);
    System.out.println("Age : " + age);

    //close
    sc.close();

  }
}
