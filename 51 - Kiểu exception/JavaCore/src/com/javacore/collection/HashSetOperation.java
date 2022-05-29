package com.javacore.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {

  public static void main(String[] args) {

    // khai báo một hashSet có tên là hashSet
    // có kiểu là Integer
    HashSet<Integer> hashSet = new HashSet<>();

    // thêm các phần tử vào hashSet sử dụng phương thức add()
    hashSet.add(1);
    hashSet.add(2);
    hashSet.add(1);
    hashSet.add(6);

    //Duyệt bằng cách sử dụng Iterator
    System.out.println("Các phần tử có trong hashSet là: ");
    Iterator<Integer> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + "\t");
    }

    System.out.println("\n "); //new line

    //Kiểm tra phần tử
    if (hashSet.contains(new Integer(6))){
      System.out.println("Tồn tại phần tử! ");
    } else {
      System.out.println("Không tồn tại!");
    }

    //xóa phần tử khỏi tập hợp
    hashSet.remove(1);
    System.out.println("Các phần tử trong hashSet sau khi remove: " + hashSet);

    //clear all
    hashSet.clear();
    System.out.println("Các phần tử trong hashSet sau khi clear: " + hashSet);

  }

}
