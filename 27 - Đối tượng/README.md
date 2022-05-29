### Lập trình hướng thủ tục là gì?
- Lập trình hướng thủ tục (**Procedure Oriented Programming - POP**) hay còn gọi là hướng cấu trúc là cách lập trình truyền thống, chương trình sẽ chia thành các hàm nhỏ để gọi qua các hàm main.
- Vì vậy POP tập trung vào xử lý thuật toán hơn là dữ liệu, điều này khiến cho dữ liệu khó kiểm soát.
- Các ngôn ngữ lập trình hướng thủ tục: Pascal, C...
```
function main() 
{
  a();
  b();
}

function a() 
{
  // Your code here
}

function b() 
{
  // Your code here
}
```
### Khái niệm OOP
- Lập trình hướng đối tượng (**Object Oriented Programming - OOP**) là một phương pháp thiết kế phần mềm mà trong đó, chúng ta tạo ra các đổi tượng trong code để trừu tượng hóa các đối tượng thực tế trong cuộc sống và lấy các đối tượng đó làm trung tâm.
  + Đối tượng = dữ liệu (thể hiện thông qua các thuộc tính) + chức năng (thể hiện thông qua phương thức)
  + Hệ thống = tập hợp các đối tượng + tương tác giữa các đối tượng.
- Từ đó OOP giúp tăng tính hiệu quả, đơn giản hóa việc bảo trì, dễ dàng mở rộng hệ thống.
- Ví dụ: Bạn mô tả trong code một lớp **Animal** để mô tả về các loài động vật mà bạn quan sát được trong thực tế.
- Các ngôn ngữ lập trình hướng đối tượng: Java, C++, Python,...
### Mốt số khái niệm cơ bản về OOP
Một vài khái niệm cơ bản trong OOP:
- Đối tượng (Object)
- Lớp (Class)
- Kế thừa (Inheritance)
- Đa hình (Polymorphism)
- Trừu tượng (Abstraction)
- Đóng gói (Encapsulation)

### Đối tượng (Object) - Lớp (Class)
1. Đối tượng (Object): Bất kỳ một thực thể nào có trạng thái (state) và hành vi (behavior) thì được xem như là một đối tượng. Ví dụ: xe đạp, ô tô...
2. Lớp (Class): là một khuôn mẫu để tạo ra đối tượng bao gồm các thuộc tính (field/propety) và phương thức (method).
### Cú pháp khai báo một Class
Cú pháp để khai báo một lớp (class) trong Java:
```
<Access Modifier> class className {
  
}
```
- Access Modifier: được dùng để xác định phạm vi có thể truy cập (public,...)
- className : tên lớp bạn cần định nghĩa
- class : là từ khóa để khai báo lớp 

Ví dụ
```
public class Car {
  //Code here
}
```
### Phương thức của lớp
- Một **phương thức (Method)** là một tập hợp các khối lệnh (code) để thi hành một chức năng nào đó.
- **Cú pháp**
```
modifier returnType nameOfMethod (Parameter List) {
  // method body
}
```
- **Trong đó**:
  + Modifier : Phạm vi truy cập method (public, private, ...)
  + returnType : Kiểu trả về của method (String, Integer, void, ...)
  + nameOfMethod : Tên của method bạn định nghĩa 
  + Parameter List : tham số của method cần truyền vào (Có thể không có )
  + method body : Khối code trong method đó
### Thuộc tính của lớp
- Thuộc tính để lưu trữ dữ liệu cho đối tượng của lớp đó
- Cú pháp 
```
Modifier datatype propertyName [=value];
```
- Trong đó
  + Modifier : Phạm vi truy cập method (public, private, ...)
  + DataType : Kiểu dữ liệu của thuộc tính (String, Integer, Array, ...)
  + PropertyName : Tên thuộc tính bạn đặt
  + Value : Giá trị khởi tạo cho thuộc tính
- Ví dụ
```
private String name = "Nguyen Van A";
```
