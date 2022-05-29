### Mảng Array trong JAVA
- **Định nghĩa:** Trong Java, mảng (array) là một tập hợp các phần tử có cùng kiểu dữ liệu, có địa chỉ tiếp nhau trên bộ nhớ (memory). Mảng có số phần tử cố định và bạn không thể thay đổi kích thước của nó. 
- Các phần tử của mảng được đánh chỉ số (index), bắt đầu từ chỉ số 0.
### Cách khai báo Array
- Có hai kiểu mảng trong Java: Mảng 1 chiều và mảng 2 chiều
- Cách khai báo mảng 1 chiều:
  + dataType[] arr;
  + dataType arr[];
- Khởi tạo mảng 1 chiều:
  + arr = new dataType[size];
- Ví dụ:
```java
public class TestArray {
  public static void main(String[] args) {
    
    // khai báo và khởi tạo mảng
    int a[] = new int[3];
    a[0] = 10; // gán giá trị
    a[1] = 20;
    a[2] = 50;
    
    // in mảng ra màn hình : 10 20 50
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
```