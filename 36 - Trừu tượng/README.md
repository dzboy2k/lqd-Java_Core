### Tính trừu tượng (Abstraction)
- Tính trừu tượng trong Java: Tính trừu tượng là ẩn đi các cài đặt chi tiết và chỉ hiển thị tính năng tới người dùng.
- Nói cách khác, nó chỉ hiển thị các thứ quan trọng tới người dùng và ẩn các chi tiết nội tại, ví dụ: để gửi tin nhắn, người dùng chỉ cần soạn text và gửi tin. Bạn không biết tiến trình xử lý nội tại về phân phối tin nhắn.
- Có 2 cách để đạt được sự trừu tượng hóa trong Java:
  + Sử dụng lớp **abstract**
  + Sử dụng **interface**
### Lớp abstract trong Java 
- Một lớp được khai báo với từ khóa abstract là lớp abstract trong Java. Nó có thể có các phương thức abstract hoặc non-abstract.
- Bạn không thể tạo đối tượng trực tiếp từ một lớp abstract.
- Bạn phải cần có lớp con để kế thừa lớp abstract thì mới sử dụng được các method hay thuộc tính được khai báo trong lớp abstract đó.
- Phương thức abstract trong Java: Đó là một phương thức được khai báo với từ khóa abstract và không cài đặt nội dung trong nó.
- Ví dụ:
```java
abstract class Animal {
  abstract void makeSound();
}
```