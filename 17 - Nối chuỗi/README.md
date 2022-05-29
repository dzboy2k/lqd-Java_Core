### Hàm nối chuỗi
- Trong java, để nối 2 chuỗi ký tự lại với nhau thì chúng ta có 2 cách. Cách thứ nhất là chúng ta dùng dấu + để nối chuỗi và cách thứ 2 là dùng phương thức concat()
- Cú pháp : `String string3 = string1.concat(String string2);`
- Ví dụ
```java
public class StringConcat {

  public static void main(String[] args) {
    
    //Tạo một đối tượng String
    String string1 = "Hello";
    String string2 = "Java";
    
    // Nối chuỗi
    String string3 = string1.concat(string2);
    System.out.println(string3); // Kết quả : Hello Java
  }
}
```