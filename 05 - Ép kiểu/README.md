### Ép kiểu (Type Casting) trong Java
- Ép kiểu trong java là quá trình chuyển đổi kiểu dữ liệu này sang kiểu dữ liệu khác.
- Sử dụng ép kiểu trong trường hợp nào : Chúng ta cần sử dụng đến thao tác ép kiểu khi chúng ta cần chuyển đổi kiểu dữ liệu của biến này sang kiểu dữ liệu khác để phục vụ cho mục đích nào đó.
- **Ví dụ:** Chúng ta thực hiện phép chia số nguyên 1 cho 2, nếu chúng ta không sử dụng đến ép kiểu thì kết quả của phép toán này sẽ trả về 0, như vậy thì yêu cầu của bài toán đã không còn đúng nữa.
- Có 2 loại ép kiểu trong Java:
  * Ép kiểu không tường minh (Implicit Casting)
  * Ép kiểu tường minh (Explicit Casting )
#### Ép kiểu không tương minh 
- Chuyển từ kiểu có vùng lưu trữ nhỏ lên kiểu có vùng lưu trữ lớn hoặc về kiểu có cùng kiểu dữ liệu
- Loại này không làm mất mát dữ liệu
- Sơ đồ chuyển đổi như sau:\
  byte => short => int => long => float => double
#### Ép kiểu tường minh
- Chuyển từ kiểu có vùng lưu trữ lớn về kiểu có vùng lưu trữ nhỏ. Loại này có thể làm mất mát dữ liệu. Sơ đồ chuyển đổi như sau:\
    double => float => long => int => short => byte
- Lưu ý: Khi ép kiểu dữ liệu chúng ta phải thật sự cẩn thận nếu không sẽ làm ảnh hưởng đến kết quả của toàn bộ bài toán.