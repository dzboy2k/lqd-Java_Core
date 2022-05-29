### So sánh chuỗi sử dụng equals
- Phương thức equals() được sử dụng để so sánh nội dung của 2 chuỗi 
- Các phương thức:
```
public boolean equals(Object another): so sánh 2 chuỗi có phân biệt chữ hoa, chữ thường.
public boolean equalsIgnoreCase(String another): so sánh 2 chuỗi không phân biệt chữ hoa, chữ thường.
```
- Ví dụ:
```java
public class StringEqualsComparison {

  public static void main(String[] args) {
    // khởi tạo các đối tượng string
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    String s4 = "HELLO";
    
    // So sánh 2 chuỗi có phân biệt chữ hoa, chữ thường.
    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3));//true
    System.out.println(s1.equals(s4));//false

    //so sánh 2 chuỗi không phân biệt chữ hoa, chữ thường.
    System.out.println(s1.equalsIgnoreCase(s4));//true
  }
}
```
### So sánh chuỗi bằng toán tử ==
- Toán tử == được sử dụng để so sánh tham chiếu (không phải giá trị) của 2 chuỗi.
- Ví dụ:
```java
public class StringReferenceComparison {

  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");
    System.out.println(s1 == s2);//true (vì cả 2 cùng tham chiếu instance giống nhau)
    System.out.println(s1 == s3);//false(vì s3 tham chiếu instance mà không ở trong Pool)
  }
}
```
### So sánh chuỗi bằng compareTo()
- Phương thức compareTo() so sánh các giá trị theo thứ tự từ điển và trả về một giá trị số nguyên mô tả nếu chuỗi đầu tiên nhỏ hơn, bằng hoặc lớn hơn chuỗi thứ hai. \
  **Giả sử s1 và s2 là hai biến chuỗi. Nếu:** \
  s1 == s2: 0 \
  s1 > s2: giá trị > 0 \
  s1 < s2: giá trị < 0
- Ví dụ:
```java
public class StringComparisonTo {

  public static void main(String[] args) {
    
    // Tạo các đối tượng
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = "Java";
    
    // so sánh
    System.out.println(s1.compareTo(s2)); // 0 : bằng nhau
    System.out.println(s1.compareTo(s3)); // -2 : s1 < s3
    System.out.println(s3.compareTo(s1)); // 2 : s3 > s1
  }
} 
```
  