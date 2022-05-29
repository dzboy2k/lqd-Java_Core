### Chuỗi trong JAVA
**Định nghĩa** : Trong Java, String là một đối tượng mà biểu diễn một dãy ký tự liên tục. Lớp **String** được sử dụng để tạo đối tượng String
- Lớp String cung cấp khá nhiều các method dùng để thao tác với chuỗi : Tìm kiếm chuỗi , cắt chuỗi , nối chuỗi , ...
- String trong java là không thể thay đổi (immutable)

Tuy nhiên, nếu bạn muốn sử dụng các lớp mà có thể thay đổi, bạn có thể lựa chọn sử dụng các lớp **StringBuffer** và **StringBuilder**
### Cách tạo đối tượng String trong Java
Có hai cách để tạo đối tượng String: string literal và từ khóa new.
#### Cách 1 : Sử dụng String Literal
String Literal trong Java được tạo bởi sử dụng dấu trích dẫn kép
```
String tenChuoi = "giá_trị_khởi_tạo";
Ví dụ : String s1="Hello";
        String s2="Hello"; //se khong tao instance moi
        String s3 = s1;
```
Khi tạo chuỗi bằng cách String Literal thì mặc định các đổi tượng String được tạo ra sẽ được lưu vào trong vùng bộ nhớ **Pool**. \
Mỗi khi bạn tạo một hằng chuỗi, đầu tiên JVM kiểm tra Pool chứa các hằng chuỗi. Nếu chuỗi đã tồn tại trong Pool, một tham chiếu tới Pool được trả về. Nếu chuỗi không tồn tại trong Pool, một instance của chuỗi mới được tạo và được đặt trong trong Pool.
### Cách 2 : Sử dụng từ khóa New
```
String s4 = new String("Hello"); // String object
String s5 = new String("Hello"); // String object
```
JVM sẽ tạo một đối tượng mới như bình thường trong bộ nhớ Heap (không phải Pool). Biến sẽ tham chiếu tới đối tượng trong Heap (chứ không là Pool).