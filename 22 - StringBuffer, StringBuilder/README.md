### Lớp StringBuffer
- Trong java, lớp **StringBuffer** được sử dụng để tạo chuỗi có thể thay đổi (mutable). Lớp StringBuffer trong java tương tự như lớp String ngoại trừ nó có thể thay đổi.
- StringBuffer là đồng bộ (synchronized) tức là luồng an toàn. Điều này có nghĩa là không thể có 2 luồng cùng truy cập phương thức của lớp StringBuffer đồng thời.
- Ví dụ
```java
public class StringBufferExam {
  public static void main(String[] args) {
    
    //Khởi tạo một đối tượng StringBuffer
    StringBuffer sb = new StringBuffer("Hello ");
    
    // add thêm vào chuỗi ban đầu.
    sb.append("Java");// đến đây chuỗi ban đầu đã bị thay đổi

    System.out.println(sb);// in Hello Java
  }
  
}
```
### Lớp StringBuilder
- Trong Java, lớp StringBuilder được sử dụng để tạo chuỗi có thể thay đổi (mutable). Lớp StringBuilder trong java tương tư như lớp StringBuffer ngoại trừ nó không đồng bộ (non-synchronized).
- Ví dụ
```java
public class StringBuilderExam {

  public static void main(String[] args) {
    
    //Tạo đối tượng StringBuilder
    StringBuilder sb = new StringBuilder("Hello ");

    // add thêm nội dung vào
    sb.append("Java");// đến đây chuỗi ban đầu đã bị thay đổi

    //In ra màn hình
    System.out.println(sb);// in Hello Java
  }
  
}
```