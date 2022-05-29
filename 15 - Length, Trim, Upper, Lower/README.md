### Xác định độ dài của chuỗi
- Khi chúng ta muốn tính chiều dài của một chuỗi , các bạn dùng hàm length 
- Cú pháp : `int length = tên_chuỗi.length();`
- Ví dụ
```java
public class StringLength {

  public static void main(String[] args) {
    
    //Tạo một đối tượng String
    String str = "Hello";
    
    // Tính chiều dài của chuỗi
    int length = str.length();
    System.out.println("Length = " + length);
    // Kết quả : Length = 5
  }
}
```
### Xóa khoảng trắng trong chuỗi
- Phương thức trim() được sử dụng để xóa khoảng trắng ở đầu và cuối chuỗi
- Cú pháp : `public String trim()`
- Ví dụ
```java
public class StringTrimExample {
  public static void main(String[] args) {
    String s1 = "  hello string   ";
    
    // In nội dung trước khi xóa khoảng trắng
    System.out.println(s1 + "java");//Kết quả : "  hello string   java"
    
    // In nội dung sau khi xóa khoảng trắng
    System.out.println(s1.trim() + "java");// Kết quả : "hello stringjava"
  }
}
```
### Hàm chuyển đổi chữ hoa/ chữ thường 
Trong Java, nếu bạn muốn chuyển chuỗi ký tự thành chữ hoa hay chữ thường thì sử dụng các function toUpperCase/ toLowerCase

|||
|---|---|
|String toLowerCase()|Trả về chuỗi chữ thường.|
|String toLowerCase(Locale l)|Trả về chuỗi chữ thường bằng việc sử dụng locale cụ thể.|
|String toUpperCase()|Trả về chuỗi chữ hoa.|
|String toUpperCase(Locale l)|Trả về chuỗi chữ hoa bằng việc sử dụng locale cụ thể.|
