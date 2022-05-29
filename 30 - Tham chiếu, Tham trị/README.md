### Kiểu tham chiếu và tham trị trong Java
- Truyền tham số trong Java có 2 kiểu: Kiểu tham chiếu (reference type) và kiểu tham trị (value type).
- **Tham số kiểu giá trị**: Đó là kiểu dữ liệu _nguyên thủy gồm: byte, short, int, long, float, double, boolean, char,_ đây là cách truyền giá trị chứ không phải truyền địa chỉ ô nhớ, do vậy những thay đổi bên trong nội dung phương thức không ảnh hưởng đến giá trị của biến bên ngoài.
```
static void addOneTo(int num) {
  num = num + 1;
}

public static void main(String[] args) {
  int x = 5;
  addOneTo(x);
  System.out.println(x);
}
```
### Kiểu tham chiếu (reference type)
- **Tham số kiểu tham trị**: Đó là cách truyền vào phương thức biến tham chiếu đến các đối tượng, mảng hay interface.
- Do đó những thay đổi bên trong phương thức sẽ ảnh hưởng đến bên ngoài phương thức.
- Ví dụ:
```java
public class ReferenceTypeTest {
  public static void main(String[] args) {
    Person p;
    p = new Person("John");
    p.setAge(20);
    celebrateBirthday(p);
    System.out.println(p.getAge());
  }
  
  static void celebrateBirthday(Person p) {
    p.setAge(p.getAge() + 1);
  }
}
//Result : 21
```