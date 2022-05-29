### Exeption - Exception handling là gì?
- Một ngoại lệ (**Exception**) là lỗi xảy ra khi chương trình thi hành. Ngoại lệ dẫn tới chương trình kết thúc. **Exception handling** trong Java là cơ chế giúp bạn nhận được lỗi xảy ra và đưa ra cách xử lý theo tình huống mong muốn.
- Một ngoại lệ có thể xảy ra do nhiều nguyên nhân khác nhau, ví dụ:
  - Người dùng nhập sai dữ liệu quy định
  - Một file nào đó cần mở mà lại không có
  - Kết nối mạng bị mất khi cần truyền dữ liệu
  - Bộ nhớ bị thiếu
- Như bạn thấy, ngoại lệ có thể là do lỗi từ người dùng, lỗi từ lập trình viên, lỗi do hệ thống vật lý... Rất nhiều ngoại lệ và nó là một phần của chương trình mà chúng ta cần phải xử lý (**Exception handling**).
### Java Exception Hierarchy
```
                              Object
                            java.lang
                                |
                            Throwable
          /                                   \
    Error                                       Exception
  (Unchecked)                                   (Checked)
- OutOfMemoryError                            /           \
- StackOverFlowError        RunTimeException            Other Exception
                              (Unchecked)                  (Checked)
                          - NullPointerException        - ClassNotFoundException    
                          - IllegalArgumentException    - IOException
                          - ArithmeticException         - FileNotFoundException
                          - IndexOutOfBoundsException   - SQLException
                                                        - NoSuchMethodException
```
### Ví dụ về Exception
Một vài ví dụ về **Exception**:
1. Phép chia cho 0 => Ném ra exception java.lang.ArithmeticException: / by zero
2. Thao tác trên đối tượng NULL => Ném ra exception NullPoiterException
3. Thao tác với mảng / chuỗi với index không tồn tại => Ném ra ArrayIndexOutOfBoundsException
4. Ép kiểu ký tự sang số nguyên => NumberFormatException  
...