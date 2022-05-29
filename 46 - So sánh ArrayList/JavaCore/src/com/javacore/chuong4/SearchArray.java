package com.javacore.chuong4;

import java.util.Scanner;

public class SearchArray {

  public static void main(String[] args) {

    // Khai báo mảng
    int n, max = 100, i;
    int[] A = new int[max];

    //Khai báo biến nhập từ bàn phím
    Scanner scanner = new Scanner(System.in);

    //Step 1: nhập số phần tử của mảng
    // kiểm tra nếu n <= 0 hoặc n > max - 1
    // thì phải nhập lại
    do {
      System.out.println("Nhập số phần tử của mảng: ");
      n = scanner.nextInt();
    } while (n <= 0 || n > max - 1);

    //Step 2: Nhập các phần tử của mảng
    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
    for (i = 0; i < n; i++) {
      System.out.print("A[" + i + "] = ");
      A[i] = scanner.nextInt();
    }

    //Step 3 : Nhập số nguyên k
    System.out.println("Nhập số nguyên k cần tìm: ");
    int k = scanner.nextInt();

    //Step 4 : tiến hành tìm kiếm phần tử
    // nếu tìm thấy thì gán giá trị của i cho index và thoát khỏi vòng lặp for bằng câu lệnh break
    int index = n;
    for (i = 0; i < n; i++) {
      if (A[i] == k) {
        index = i;
        break;
      }
    }

    // Step 5 : in ra nội dung thông báo
    // Nếu index = n có nghĩa là không tìm thấy phần tử nào có giá trị bằng k
    if (index == n) {
      System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
    } else {
      System.out.println("Phần tử đầu tiên có giá trị bằng " + k + " tại vị trí = " + index);
    }

    //close
    scanner.close();
  }
}
