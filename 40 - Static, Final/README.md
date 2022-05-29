### Sử dụng static trong Java
- Từ khóa **static** giúp bạn tạo ra các thuộc tính và phương thức tĩnh trong Java. 
- Khi bạn khai báo một biến, một phương thức với static thì khi **hoạt động nó thuộc về lớp chứ không phải thuộc về đối tượng** tạo ra từ lớp.
- Thành viên **static** được chia sẻ chung cho các đối tượng.
- Ví dụ:
```java
public class Counter {
  //Thuộc tính tĩnh
  public static int COUNT = 0;
  
  Counter() {
    COUNT++;
  }
  
  //Phương thức tĩnh
  public static void sayHi() {
    System.out.println("Hello static method!");
  } 
}
```
```java
public class MyClass {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    
    //Đếm số đối tượng được tạo ra từ class Counter
    System.out.println("Count:" + Counter.COUNT);
    
    // call static method
    Counter.sayHi();
  }
}
```

### Sử dụng final trong Java
- Từ khóa **final** là để tạo ra các hằng số, không cho phép thay đổi nội dung.
- Các trường hợp sử dụng:
  + **Biến final**: để định nghĩa hằng số trong Java.
  + **Phương thức final**: khi một phương thức được khai báo với từ khóa final, các class con kế thừa sẽ không thể ghi đè (override) phương thức này.
  + **Lớp final**: khi từ khóa final sử dụng cho một lớp, lớp này sẽ không thể được kế thừa.
- Ví dụ:
```
// Khai báo biến final (hằng số)
public static final int HOUR_OF_DAY = 24;
```
#### Ví dụ phương thức final
Ví dụ về không thể ghi đè phương thức final.
```java
public class Parent {
  
  public final void print() {
    System.out.println("This is parent");
  }
}
```
```java
public class Child extends Parent {

  @Override
  public final void print() {
    
  }
  
}
```
#### Ví dụ lớp final trong Java
```java
public final class Parent {
  
  public final void print() {
    System.out.println("This is parent");
  }
}
```
```java
public class Child extends Parent {
  
}
```
