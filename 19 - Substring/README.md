### Hàm trả về chuỗi con
- Phương thức subString() trả về chuỗi con của một chuỗi từ một vị trí index muốn cắt chuỗi.
- Cú pháp 
```
public String substring(int startIndex)
public String substring(int startIndex, int endIndex)
```
- Ví dụ
```java
public class SubstringExample {
  public static void main(String[] args) {
    String s1 = "hellojava";
    
    // Cắt từ vị trí index = 3
    System.out.println(s1.substring(3));// "lojava"
    
    // Cắt từ vị trí index = 3 tới index = 7
    System.out.println(s1.substring(3, 7));// "loja"
    
  }
}
```