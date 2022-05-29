### Đóng gói (Encapsulation)
**Tính đóng gói trong Java** là che dấu chi tiết dữ liệu tới người sử dụng. Các biến của một lớp sẽ là ẩn với các lớp khác, truy cập dữ liệu của một lớp chỉ thực hiện thông qua phương thức chứ không truy cập thẳng tới biến. Để truy cập các biến Java cung cấp các hàm public là hàm setter và getter.
### Ví dụ về tính đóng gói
- Ví dụ:
```java
class BankAccount {
  private double balance=0;
  public void deposit(double x) {
    if(x > 0) {
      this.balance += x;
    }
  }
}
```
Lớp trên có biến balance là ẩn với bên ngoài, nó chỉ được truy cập bằng phương thức của lớp là deposit để kiểm tra tính hợp lệ của dữ liệu trước khi thay đổi biến
#### Một số lợi ích sử dụng tính đóng gói như trên:
- Điều khiển cách lấy và thiết lập dữ liệu của lớp
- Mềm dẻo hơn và dễ dàng thay đổi code
- Có khả năng thay đổi một phần code mà không ảnh hưởng đến phần khác