### Toán tử instanceof trong Java
- Toán tử **instanceof** trong Java được sử dụng để kiểm tra xem đối tượng có là instance của kiểu cụ thể: lớp hoặc lớp con hoặc interface hay không.
- Nó trả về giá trị boolean là true hoặc false.
- Ví dụ:
```java
class Animal {
  
}
public class Dog extends Animal {
  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println(dog instanceof Dog); // true
    System.out.println(dog instanceof Animal); // true
  }
}
```