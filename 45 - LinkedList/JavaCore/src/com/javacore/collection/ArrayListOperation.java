package com.javacore.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperation {
  public static void main(String[] args) {

    List<String> colors = new ArrayList<String>();

    // add
    colors.add("Red");
    colors.add("Blue");
    colors.add("Green");
    colors.add("Orange");

    //remove
    colors.remove("Green");

    //add again
    colors.add("Pink");
    colors.add("Yellow");

    //get
    System.out.println(colors.get(1));

    //search
    System.out.println(colors.contains("Orange"));

    //size
    System.out.println(colors.size());

    //print
    System.out.println(colors);

    //convert to array
    Object[] arr = colors.toArray();
    // sử dụng vòng lặp for để hiển thị các phần tử có trong mảng arr
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Phần tử tại vị trí " + i + " trong arr là " + arr[i]);
    }

    //clear
    colors.clear();
    System.out.println(colors);

  }
}
