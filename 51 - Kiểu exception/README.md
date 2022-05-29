## Các kiểu của Exception
Có hai loại ngoại lệ chính là: **checked** và **unchecked** và **Error**
### 1. Checked Exception
- Các lớp extends từ lớp Throwable ngoại trừ RuntimeException và Error được gọi là checked exception, ví dụ như Exception, SQLException...
- Các checked exception được **kiểm tra tại compile-time**.
- **Kế thừa từ Exception class** nếu bạn muốn định nghĩa riêng lớp checked exception.
```java
public class MyCheckedException extends Exception {
  public MyCheckedException(String msg) {
    super(msg);
  }
}

public class CheckedExceptionDemo {

  public static void main(String[] args) {
     CheckedExceptionDemo.testCheckedException();
  }

  public static void testCheckedException() throws MyCheckedException {
    System.out.println("checked exception demo");
  }

}
```
### 2. unchecked Exception
- Các lớp **extends từ RuntimeException** được gọi là unchecked exception, ví dụ: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException,... Các ngoại lệ **unchecked không được kiểm tra tại compile-time** mà chúng kiểm tra tại runtime.
```java
public class UncheckedExceptionDemo {

  public static void main(String[] args) {
    UncheckedExceptionDemo.testUncheckedException();
  }

  public static void testUncheckedException() throws MyUncheckedException {
    System.out.println("unchecked exception demo!");
    throw new MyUncheckedException("unchecked exception");
  }

}
```
### Error là gì ?
- Error là lỗi sẽ làm cho chương trình không hoạt động được, dừng ngay lập tức.
- Ví dụ: **OutOfMemoryError, VirtualMachineError, AssertionError,...**
- Trong khi đó với **Exception xảy ra vẫn có thể khôi phục** và tiếp tục xử lý để cho chương trình chạy được.
