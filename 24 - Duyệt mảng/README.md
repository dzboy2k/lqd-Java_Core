### Duyệt mảng trong Java
- Đối với mảng thì chúng ta có thể truy xuất các phần tử của mảng thông qua các chỉ số index của phần tử đó.
- Cú pháp: Tên_mảng[index]; \
  **Chú ý**: Index trong mảng bắt đầu từ 0
- Ví dụ:
```java
public class ReadArray {

  public static void main(String[] args) {
    // Khai báo và khởi tạo giá trị ban đầu cho mảng
    char[] kyTu = new char[] {'a', 'b', 'c', 'd', 'e'};
    
    // hiển thị ký tự tại vị trí thứ 2 trong mảng : 'c'
    System.out.println("Ký tự tại vị trí thứ 2 trong mảng là :" + kyTu[2]);
  }
}
```
