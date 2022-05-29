package com.javacore.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperation {

  public static void main(String[] args) {

    // Khai báo HashMap
    Map<String, String> hashMap = new HashMap<>();

    //Thêm phần tử vào HashMap
    hashMap.put("Apple", "Táo");
    hashMap.put("Banana", "Chuối");
    hashMap.put("Orange", "Cam");

    // sử dụng Iterator để lấy toàn bộ key của hashMap
    // thông qua phương thức keySet()
    // vì các key có kiểu là String
    // nên iterator cũng có kiểu là String
    Iterator<String> iteratorkey = hashMap.keySet().iterator();

    System.out.println("Key có trong hashMap là: ");
    while (iteratorkey.hasNext()) {
      System.out.println(iteratorkey.next());
    }

    // sử dụng Iterator để lấy toàn bộ value của hashMap
    // thông qua phương thức values()
    // vì các value có kiểu là String
    // nên iterator cũng có kiểu là String
    Iterator<String> iteratorValue = hashMap.values().iterator();

    System.out.println("Value có trong hashMap là: ");
    while (iteratorValue.hasNext()) {
      System.out.println(iteratorValue.next());
    }

    // sử dụng Iterator để lấy toàn bộ entry của hashMap
    // vì 1 entry bao gồm cả key và value
    // nên kiểu dữ liệu của Iterator sẽ bao gồm
    // kiểu dữ liệu của cả key và value
    Iterator<Map.Entry<String, String>> iterator = hashMap.entrySet().iterator();
    System.out.println("Các entry có trong hashMap là: ");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    //kiểm tra phần tử có key tồn tại
    if (hashMap.containsKey("Apple")) {
      System.out.println("Có Apple key trong hashMap");
    }

    // lấy giá trị phần tử theo key
    System.out.println("lấy giá trị phần tử theo key : " + hashMap.get("Apple"));

    // clear() xóa toàn bộ phần tử

  }
}
