### Biến local trong Java
- Phạm vi trong phương thức, constructor, khối.
- Cần có giá trị khởi tạo trước khi sử dụng.
- Các biến local được lưu trên vùng nhớ stack của bộ nhớ.
### Biên instance trong Java
- Phạm vi đối tượng.
- Tồn tại cùng đối tượng.
- Access Modifier (public, protected, default, private).
- Sẽ có giá trị mặc định được gán sau khi đối tượng được tạo.
- Lưu trong bộ nhớ Heap.
### Biến static trong java
- Phạm vi lớp.
- Tồn tại cùng chương trình.
- Access Modifier (public, protected, default, private).
- Lưu trong bộ nhớ static.
- Giá trị mặc định: kiểu số là 0, kiểu boolean là false...
- Cách đặt tên: public static final thì tên viết HOA và có giá trị khởi tạo (vì là final) còn không thì như biến local và instance. Ví dụ:
```
Ví dụ:
  public static final int TOTAL = 10;
  public static int count;
```