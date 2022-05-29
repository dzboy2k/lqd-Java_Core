package com.javacore.chuong3;

public class StringTrimExample {
  public static void main(String[] args) {
    String s1 = "  hello string   ";

    // In nội dung trước khi xóa khoảng trắng
    System.out.println(s1 + "java");//Kết quả : "  hello string   java"

    // In nội dung sau khi xóa khoảng trắng
    System.out.println(s1.trim() + "java");// Kết quả : "hello stringjava"
  }
}
