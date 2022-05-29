### Constructor là gì ?
- Constructor trong Java là một dạng đặc biệt của phương thức được sử dụng để khởi tạo các đối tượng.
- Có 2 quy tắc cơ bản cho việc tạo constructor:
  + Tên constructor phải giống tên lớp chứa nó.
  + Constructor không có kiểu trả về tường minh.
- Có 2 kiểu của constructor:
  + Constructor mặc định (không có tham số truyền vào)
  + Constructor tham số
- Cú pháp:
```
<class_name>() {
  // code
}
```
### Method là gì ?
Một phương thức trong Java là một tập hợp các lệnh mà được nhóm cùng với nhau để thực hiện một hành động nào đó.

Cú pháp:
```
modifier DataType methodName(params) {
  // Code here
}
```
- Modifier: phạm vi truy cập phương thức (public, private, ...)
- DataType: kiểu dữ liệu trả về (String,Int, void, ...)
- methodName: Tên method
- Params: danh sách các tham số truyền vào method
### So sánh Constructor và Method
|Constructor|Phương thức|
---|---
|Constructor được sử dụng để khởi tạo trạng thái của một đối tượng.|Phương thức được sử dụng để thể hiện hành động của một đối tượng.|
|Constructor không có kiểu trả về.|Phương thức có kiểu trả về.|
|Trình biên dịch Java tạo ra constructor mặc định nếu bạn không có constructor nào.|Phương thức không được tạo ra bởi trình biên dịch Java.|
|Tên của constructor phải giống tên lớp.|Tên phương thức có thể giống hoặc khác tên lớp.|
### Access Modifier là gì ?
**Access Modifier** trong Java xác định phạm vi có thể truy cập của biến, phương thức, constructor hoặc lớp.

Trong Java, có 4 phạm vi truy cập của Access Modifier như sau:
1. private
2. default
3. protected
4. public

|Modifier|Class|Package|Subclass|Global|
|---|---|---|---|---|
|Public|Yes|Yes|Yes|Yes|
|Protected|Yes|Yes|Yes|No|
|Default|Yes|Yes|No|No|
|Private|Yes|No|No|No|