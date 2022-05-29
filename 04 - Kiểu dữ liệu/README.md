### Java có 2 loại kiểu dữ liệu:
- Các kiểu dữ liệu nguyên thủy (Primitive Data Types)
- Các kiểu dữ liệu tham chiếu (Reference Types)
### Kiểu dữ liệu nguyên thủy:
```
                    Kiểu nguyên thủy
                   /               \
Kiểu boolean (logic)              Kiểu số
   |                             /       \         
   |              Kiểu nguyên                 Kiểu số thực
   |               /        \                     /    \
   |        Kiểu ký tự   Kiểu số nguyên          /      \
   |          |         /    /     \   \        /        \
boolean     char     byte  short  int  long   float  double
```
- Kiểu logic: **boolean**.
- Các kiểu số nguyên (integer): **byte, short, char, int, long**.
- Các kiểu số thực (real number) (Cũng được gọi là kiểu dấu chấm động (floating point)): **float, double**.

|Kiểu dữ liệu|Mô tả|
|---|---|
|**byte**|Dùng để lưu dữ liệu kiểu số nguyên có kích thước một byte (8 bit). Phạm vi biểu diễn giá trị từ -128 đến 127. Giá trị mặc định là 0.|
|**char**|Dùng để lưu dữ liệu kiểu kí tự hoặc số nguyên không âm có kích thước 2 byte (16 bit). Phạm vi biểu diễn giá trị từ 0 đến u\ffff. Giá trị mặc định là 0.|
|**boolean**|Dùng để lưu dữ liệu chỉ có hai trạng thái đúng hoặc sai (độ lớn chỉ có 1 bit). Phạm vi biểu diễn giá trị là {"True","False"}. Giá trị mặc định là False.|
|**short**|Dùng để lưu dữ liệu có kiểu số nguyên, kích cỡ 2 byte (16 bit). Phạm vi biểu diễn giá trị từ -32768 đến 32767. Giá trị mặc định là 0.|
|**int**|Dùng để lưu dữ liệu có kiểu số nguyên, kích cỡ 4 byte (32 bit). Phạm vi biểu diễn giá trị từ -2,147,483,648 đến 2,147,483,647. Giá trị mặc định là 0.|
|**long**|Dùng để lưu dữ liệu có kiểu số nguyên có kích thước lên đến 8 byte. Giá trị mặc định là 0L.|
|**float**|Dùng để lưu dữ liệu có kiểu số thực, kích cỡ 4 byte (32 bit). Giá trị mặc định là 0.0F.|
|**double**|Dùng để lưu dữ liệu có kiểu số thực, có kích thước lên đến 8 byte. Giá trị mặc định là 0.00D.|
### Kiểu tham chiếu (Reference Type)
```
    Reference Data
        Types
    /     |      \  
   /      |       \     
Array   class   Interface
```
Kiểu dữ liệu tham chiếu trong Java được hiểu là tham chiếu đến địa chỉ bộ nhớ của một đối tượng hay một mảng đã được tạo trước đó trong bộ nhớ.
```
Ví dụ kiểu tham chiếu
Ví dụ: Kiểu tham chiếu thường được sử dụng nhất đó là String
String str = new String("Hello");
str --->  H  e l l o
          0  1 2 3 4
          String object
```