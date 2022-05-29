package com.javacore.chuong3;

public class SplitExample {
  public static void main(String[] args) {
    String s1 = "Hello java";

    String[] words = s1.split("\\s");// tach chuoi dua tren khoang trang
    // su dung vong lap foreach de in cac element cua mang chuoi thu duoc
    for (String w : words) {
      System.out.println(w);
    }
  }

}
