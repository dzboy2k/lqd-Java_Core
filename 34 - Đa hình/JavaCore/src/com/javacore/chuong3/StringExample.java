package com.javacore.chuong3;

public class StringExample {

  public static void main(String[] args) {

    // Tạo đối tượng String literal
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = s1;

    // So sánh các đổi tượng với nhau
    System.out.println(s1==s2);//true
    System.out.println(s1==s3);//true

    //Tạo đối tượng String bằng từ khóa new
    String s4 = new String("Hello");
    String s5 = new String("Hello");
    // So sánh đổi tượng s4 và s5
    System.out.println(s4==s5);//false

  }
}
