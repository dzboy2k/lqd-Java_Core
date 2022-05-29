## Exception handling
- Khi một method có ngoại lệ xảy ra thì có 2 cách xử lý:
  - Ném exception ra bên ngoài, tức là đẩy việc xử lý ngoại lệ cho class phía bên ngoài gọi nó (nếu có) xử lý.
  - Hoặc xử lý ngay bên trong method đó.
### Bắt ngoại lệ để xử lý với **try...catch**
  - Các ngoại lệ có thể bắt bằng cách kết hợp cặp từ khóa try và catch, try/catch bao bọc lấy khối lệnh cần bắt ngoại lệ.
  - Trong khối catch có khai báo kiểu ngoại lệ cần bắt (Exception e). Nếu ngoại lệ có xảy ra ở khối try thì ngoại lệ sẽ chuyển đến khối catch. Kiểu có ngoại lệ có tên Exception có thể dùng cho tất cả các ngoại lệ.
- Ví dụ:
```
try {
  //code cần bắt lỗi ở đây
} catch (Exception e) {
  //code xử lý khi bắt được lỗi e
}
```
### Cách ném ngoại lệ bằng từ khóa throw
Từ khóa throw cho phép bạn tự phát sinh ra ngoại lệ để try/catch bắt được. \
Ngoài kiểu ngoại lệ Exception còn có các kiểu ngoại lệ khác như: IndexOutOfBoundsException, NullPointerException, ArithmeticException ... \
Ví dụ bạn phát sinh ngoại lệ ArithmeticException xảy ra trong phương thức của bạn khi tham số bằng 0.
```
int div(int a, int b) throws ArithmeticException {
  if (b == 0) {
    throw new ArithmeticException("Lỗi chia cho không");
  } else {
    return a / b;
  }
}
```
### Bắt nhiều ngoại lệ
Bạn có thể bắt nhiều ngoại lệ cụ thể khác nhau bằng cách viết nhiều khối catch
```
try {
  //some code
} catch (ExceptionType1 e1) {
  //Catch block
} catch (ExceptionType1 e2) {
  //Catch block
} catch (ExceptionType1 e3) {
  //Catch block
}
```
### Các tình huống exception phổ biến
- Kịch bản ArithmeticException xảy ra \
Nếu chúng ta chia bất kỳ số nào cho 0, xảy ra ngoại lệ ArithmeticException
```
int a=50/0;//ArithmeticException
```
- Kịch bản NullPointerException xảy ra \
Nếu chúng ta có bất kỳ biến nào có giá trị null, thực hiện bất kỳ hoạt động nào bởi biến đó sẽ xảy ra ngoại lệ NullPointerException
```
String s=null;
System.out.println(s.length());//NullPointerException
```
- Kịch bản ArrayIndexOutOfBoundsException xảy ra \
Nếu bạn chèn bất kỳ giá trị nào vào index sai, sẽ xảy ra ngoại lệ ArrayIndexOutOfBoundsException
```
int a[]=new int[5];
a[10]=50; //ArrayIndexOutOfBoundsException
```

