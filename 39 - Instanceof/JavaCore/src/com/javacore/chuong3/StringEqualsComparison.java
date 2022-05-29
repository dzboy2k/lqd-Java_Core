package com.javacore.chuong3;

public class StringEqualsComparison {

  public static void main(String[] args) {
    // khởi tạo các đối tượng string
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    String s4 = "HELLO";

    // So sánh 2 chuỗi có phân biệt chữ hoa, chữ thường.
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3));//true
    System.out.println(s1.equals(s4));//false

    //so sánh 2 chuỗi không phân biệt chữ hoa, chữ thường.
    System.out.println(s1.equalsIgnoreCase(s4));//true
  }
}
