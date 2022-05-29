### Tìm ký tự trong chuỗi
- Phương thức charAt() trả về giá trị Char của chuỗi tại vị trí có chỉ số index được chỉ định. Index bắt đầu từ 0.
- Cú pháp : `char c = chuoi.charAt(int index);`
- Ví dụ
```java
public class CharAtExample {
  public static void main(String[] args) {
    String name = "Hello java";
    
    // Tìm kỹ tự tại index = 3
    char ch = name.charAt(3);
    System.out.println(ch);
    //Kết quả : l 
  }
}
```
### Tìm vị trí trong chuỗi
- Phương thức indexOf() sẽ trả về vị trị index của ký tự hoặc chuỗi con trong một chuỗi cần tìm kiếm
- Sẽ trả về **-1** nếu không tìm thấy
- Các hàm

|||
|---|---|
|int indexOf(int ch)|Trả về vị trí của ký tự ch cụ thể.|
|int indexOf(int ch, int fromIndex)|Trả về vị trí của ký tự ch tính từ vị trí fromIndex.|
|int indexOf(String substring)|Trả về vị trí của chuỗi con substring.|
|int indexOf(String substring, int fromIndex)|Trả về chuỗi con bắt đầu từ vị trí substring đến vị trí fromIndex.|