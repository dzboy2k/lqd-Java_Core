### Tính kế thừa trong OOP
- Tính kế thừa thể hiện một lớp con có thể kế thừa các thuộc tính và phương thức của lớp cha.
- Tuy nhiên lớp con chỉ được truy cập các thành viên public và protected của class cha. Nó không được phép truy cập đến thành viên private của class cha.
- Cú pháp của kế thừa trong Java:
```
Sử dụng từ khóa extends để kế thừa.
class Subclass-name extends Superclass-name {
  //methods and fields
}
```