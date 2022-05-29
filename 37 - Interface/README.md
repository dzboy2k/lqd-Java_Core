### Interface trong Java
- Một **Interface** trong Java là một tập hợp các phương thức trừu tượng (abstract). Một class triển khai một interface, do đó kế thừa các phương thức abstract của interface.
- Các trường của Interface là public, static và final theo mặc định và các phương thức là public và abstract.
- Một **Interface** trong Java như là một bản thiết kế của một lớp, hoàn toàn không có cài đặt gì trong nó.
- **Interface giúp bạn thực hiện đa kế thừa trong Java :** Tức là một class có thể cài đặt được nhiều Interface cùng lúc nhưng 1 class thì không thể extend từ nhiều class một lúc được.
- **Một interface có thể kế thừa từ một interface khác**, tương tự cách một lớp có thể kế thừa lớp khác.
### So sánh abstract class và Interface
|Abstract class|Interface|
|---|---|
|1) Abstract class có phương thức **abstract** (không có thân hàm) và phương thức **non-abstract** (có thân hàm).|Interface chỉ có phương thức **abstract**. Từ java 8, nó có thêm **các phương thức default và static**.|
|2) Abstract class **không hỗ trợ đa kế thừa**.|Interface **có hỗ trợ đa kế thừa**.|
|3) Abstract class có các biến **final, non-final, static and non-static**.|Interface chỉ có các biến **static và final**.|
|4) Abstract class **có thể cung cấp nội dung cài đặt cho phương thức của interface**.|Interface **không thể cung cấp nội dung cài đặt cho phương thức của abstract class**.|
|5) Từ khóa **abstract** được sử dụng để khai báo abstract class.|Từ khóa **interface** được sử dụng để khai báo interface.|
|6) Ví dụ. <br/> public abstract class Shape { <br/> public abstract void draw(); <br/> }|Ví dụ. <br/> public interface Drawable { <br/> void draw(); <br/> }|
