package com.javacore.collection;

import java.util.*;

public class CollectionExample1 {

  public static void main(String[] args) {

    //Khai báo một ArrayList
    List<String> arrayList = new ArrayList<String>();
    arrayList.add("PHP");
    arrayList.add("Python");
    arrayList.add("Java");
    arrayList.add("C++");
    System.out.println("Các phần tử của ArrayList");
    System.out.print("\t" + arrayList + "\n");

    //Khai báo một LinkedList
    List<String> linkedList = new LinkedList<String>();
    linkedList.add("PHP");
    linkedList.add("Python");
    linkedList.add("Java");
    linkedList.add("C++");
    System.out.println("Các phần tử của LinkedList");
    System.out.print("\t" + linkedList + "\n");

    //Khai báo một HashMap
    Map<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("Windows", "2000");
    hashMap.put("Windows", "XP");
    hashMap.put("Language2", "Java");
    hashMap.put("Language1", ".Net");
    System.out.println("Các phần tử của Map");
    System.out.print("\t" + hashMap + "\n");

    //Khai báo một HashSet
    Set<String> hashSet = new HashSet<String>();
    hashSet.add("PHP");
    hashSet.add("Python");
    hashSet.add("Java");
    hashSet.add("Java");
    hashSet.add("C++");
    System.out.println("Các phần tử của Set");
    System.out.print("\t" + hashSet + "\n");

  }
}
