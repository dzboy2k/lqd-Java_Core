package com.javacore.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOperation {
  public static void main(String[] args) {

    // Create linkedList
    LinkedList<String> linkedList = new LinkedList<String>();
    // Add objects to linkedList
    linkedList.add("Java");
    linkedList.add("C++");
    linkedList.add("PHP");

    // Show list through Iterator
    System.out.println("Show list through Iterator");
    Iterator<String> itr = linkedList.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next() + ", ");
    }

    // add first
    linkedList.addFirst("Python");
    // add last
    linkedList.addLast("Ruby");

    // Show list through for-each
    System.out.println("\n"); // new line
    System.out.println("Show list through for-each");
    for (String obj : linkedList) {
      System.out.print(obj + ", ");
    }

    //firstNode & lastNode
    String firstNode = linkedList.getFirst();
    String lastNode = linkedList.getLast();

    System.out.println("\n"); // new line
    System.out.println("firstNode:" + firstNode); //Python
    System.out.println("lastNode" + lastNode); //Ruby

    //update element
    linkedList.set(2, "PHP-update"); // PHP => PHP update

    System.out.println("\n"); // new line
    System.out.println("Danh sách các phần tử sau khi thay đổi: ");
    System.out.print(linkedList + "\t");

  }
}
