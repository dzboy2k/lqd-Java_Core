package com.javacore.toantu;

public class ConditionalOperators {

  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    //Toán tử và (AND) thể hiện bằng ký tự "&&"
    boolean kiemTra = ( a == b ) && (a > b );
    System.out.println(kiemTra);

    //Toán tử OR Được thể hiện bằng ký tự "||"
    kiemTra = ( a == b ) || (a > b );
    System.out.println(kiemTra);

    // Toán tử điều kiện
    String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b";
    System.out.println(s);

  }
}
