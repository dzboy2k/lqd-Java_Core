package com.javacore.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
  public static void main(String[] args) {

    // Creating arraylist
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("C++");
    list.add("PHP");

    // Show list through Iterator
    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next() + ", ");
    }

    // Show list through for-each
    System.out.println();
    for (String obj : list) {
      System.out.print(obj + ", ");
    }
  }
}
