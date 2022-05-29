package com.javacore.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2Array {

  public static void main(String[] args) {
    // create arraylist
    List<String> arrayList = new ArrayList<>();
    // adding String object to arraylist
    arrayList.add("Java");
    arrayList.add("C");
    arrayList.add("C++");
    arrayList.add("PHP");
    arrayList.add("Python");

    // convert ArrayList to Array
    System.out.println("Convert ArrayList to Array:");
    String[] item = arrayList.toArray(new String[arrayList.size()]);
    // show item
    for (String s : item) {
      System.out.println(s);
    }

    // convert Array to ArrayList
    System.out.println("Convert Array to ArrayList:");
    List<String> list2 = new ArrayList<>();
    list2 = Arrays.asList(item);
    // show list2
    System.out.println(list2);
  }

}
