package com.javacore.toantu;

/**
 *
 * @author Bryan Lee
 *
 */
public class MathOperators {

  public static void main(String[] args) {
    int a = 10;
    int b = 3;

    //Tính tổng
    int tong = a + b;
    System.out.println("Tổng của a và b là : " + tong);

    // Tính hiệu
    int hieu = a - b;
    System.out.println("Hiệu của a và b là : " + hieu);

    //Tính tích
    int tich = a * b;
    System.out.println("Tích của a và b là : " + tich);

    //Lấy nguyên
    int phanNguyen = a/b;
    System.out.println("Phần nguyên của phép chia của a và b là : " + phanNguyen);

    //Lấy dư
    int phanDu = a % b;
    System.out.println("Phần dư của phép chia của a và b là : " + phanDu);

    //Toán tử một ngôi
    a++;
    System.out.println("Giá trị của a sau khi ++: " + a);

    b--;
    System.out.println("Giá trị của b sau khi --: " + b);

  }
}
