package com.javacore.chuong4;

import java.util.Scanner;

/**
 *
 * @author Bryan Lee
 *
 */
public class ArraySort {

  public static void main(String[] args) {

    int n, temp, max = 100;

    // Nhập dữ liệu từ bàn phím
    Scanner scanner = new Scanner(System.in);

    // khai báo và cấp phát bộ nhớ cho mảng A
    int A[] = new int[max];

    //Step 1 : nhập sô phần tử của mảng
    // kiểm tra nếu n <= 2 hoặc n > max - 1
    // thì phải nhập lại
    do {
      System.out.println("Nhập số phần tử của mảng: ");
      n = scanner.nextInt();
    } while (n <= 2 || n > max - 1);

    //Step 2 : Nhập giá trị cho các phần tử mảng
    System.out.println("Nhập giá trị cho các phần phần tử của mảng: ");
    for (int i = 0; i < n; i++) {
      System.out.print("A[" + i + "] = ");
      A[i] = scanner.nextInt();
    }

    //Step 3 : in ra màn hình mảng số ban đầu
    System.out.println("Mảng ban đầu: ");
    for (int i = 0; i < n; i++) {
      // in các phần tử trên cùng 1 dòng
      System.out.print(A[i] + "\t");
    }

    //Step 4 : sắp xếp các phần tử trong mảng
    // vòng lặp for sẽ duyệt i và j
    // i chạy từ 0 đến n - 2, j chạy từ i + 1 đến n - 1
    // nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
    // thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j <= n - 1; j++) {
        if (A[j] < A[i]) {
          temp = A[i];
          A[i] = A[j];
          A[j] = temp;
        }
      }
    }

    //Step 5 : in ra màn hình mảng số sau khi sắp xếp
    System.out.println("\nMảng sau khi sắp xếp: ");
    for (int i = 0; i < n; i++) {
      System.out.print(A[i] + "\t");
    }

    // close
    scanner.close();
  }
}
