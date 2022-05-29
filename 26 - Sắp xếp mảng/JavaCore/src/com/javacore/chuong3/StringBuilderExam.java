package com.javacore.chuong3;

public class StringBuilderExam {

  public static void main(String[] args) {

    //Tạo đối tượng StringBuilder
    StringBuilder sb = new StringBuilder("Hello ");

    // add thêm nội dung vào
    sb.append("Java");// đến đây chuỗi ban đầu đã bị thay đổi

    //In ra màn hình
    System.out.println(sb);// in Hello Java
  }

}
