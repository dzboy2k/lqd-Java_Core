### Overriding là gì
- Nếu lớp con có cùng phương thức như đã được khai báo trong lớp cha, thì đó gọi là ghi đè phương thức (Method Overriding) trong Java.
- Ghi đè phương thức được sử dụng để thu được tính đa hình tại runtime.
- **Quy tắc cho ghi đè phương thức trong Java**:
  + Phương thức phải có cùng tên như trong lớp cha.
  + Phương thức phải có cùng tham số như trong lớp cha.
```java
class Animal {
  public void makeSound() {
    System.out.println("default ...");
  }
}

class Cat extends Animal {
  
  @Override
  public void makeSound() {
    System.out.println("Meo meo");
  }
}
```
### Overloading là gì 
- Nếu một lớp có nhiều phương thức cùng tên nhưng có số tham số khác nhau, thì đó là nạp chồng phương thức (Method Overloading).
- **Có hai cách để nạp chồng phương thức trong Java, đó là**: 
  + Bằng việc thay đổi số tham số
  + Bằng việc thay đổi kiểu dữ liệu \
  **Ghi chú**: Trong Java, nạp chồng phương thức là không thể bằng việc thay đổi kiểu trả về của phương thức.
