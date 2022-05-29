package com.javacore.chuong3;

public class StringBufferExam {
  public static void main(String[] args) {

    //Khởi tạo một đối tượng StringBuffer
    StringBuffer sb = new StringBuffer("Hello ");

    // add thêm vào chuỗi ban đầu.
    sb.append("Java");// đến đây chuỗi ban đầu đã bị thay đổi

    System.out.println(sb);// in Hello Java
  }

}
