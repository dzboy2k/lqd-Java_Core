package com.javacore.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsStaticMethod {

  public static void main(String[] args) {

    List<String> animals = new ArrayList<String>();
    animals.add("tiger");
    animals.add("cat");
    animals.add("snake");
    animals.add("dog");

    //sort string
    Collections.sort(animals);
    System.out.println("animals sort:" + animals);

    // number
    List<Integer> nums = new ArrayList<Integer>();
    nums.add(3);
    nums.add(36);
    nums.add(73);
    nums.add(40);
    nums.add(1);
    //sort
    Collections.sort(nums);
    System.out.println("Number sort:" + nums);
    //find max/min
    System.out.println("Max = " + Collections.max(nums));
    System.out.println("Min = " + Collections.min(nums));

    //reverse
    List<String> mylist = new ArrayList<String>();
    mylist.add("Java");
    mylist.add("PHP");
    mylist.add("Python");
    mylist.add("COBOL");
    System.out.println("Original List: " + mylist);
    Collections.reverse(mylist);
    System.out.println("Modified List: " + mylist);

  }

}
