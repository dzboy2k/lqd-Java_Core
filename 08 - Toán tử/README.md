### Toán tử trong java
Toán tử trong java sử dụng để thực hiện một phép tính/chức năng nào đó. Java cung cấp các dạng toán tử sau:
  - Toán tử số học
  - Toán tử thao tác bit
  - Toán tử quan hệ
  - Toán tử logic
  - Toán tử điều kiện
  - Toán tử gán
### Toán tử số học
Toán tử số học được sử dụng để tính toán các phép toán số học\
Giả sử biến A giữ giá trị 10, biến B giữ giá trị 20, thì:
**Ví dụ:**

|Toán tử|Miêu tả|Ví dụ|
|---|---|---|
|+|Phép cộng|A + B sẽ cho kết quả 30|
|-|Phép trừ: trừ toán hạng trái cho toán hạng phải|A - B sẽ cho kết quả -10|
|*|Phép nhân|A * B sẽ cho kết quả 200|
|/|Phép chia: chia toán hạng trái cho toán hạng phải|B / A sẽ cho kết quả 2|
|%|Phép chia lấy dư: Lấy phần dư của phép chia toán hạng trái cho toán hạng phải|B % A sẽ cho kết quả 0|
|++|Phép lượng gia: lượng gia giá trị toán hạng thêm 1|B++ sẽ cho kết quả 21|
|--|Phép lượng giảm: lượng giảm giá trị toán hạng đi 1|B-- sẽ cho kết quả 19|
### Toán tử thao tác bit
- 1 byte là 8 bit nằm kề nhau trên vùng bộ nhớ của máy tính. Mỗi bit là một số nhị phân 0 hoặc 1
- Java định nghĩa một số toán tử thao tác bit có thể được áp dụng cho các kiểu giá trị integer, long, int, short, char và byte.
- Ví dụ: Giả sử nếu a = 60 và b = 13, thì trong định dạng nhị phân chúng sẽ như sau:\
  a = 0011 1100\
  b = 0000 1101
- Các phép toán trên BIT như AND và OR như sau :\
  a&b = 0000 1100 -> có giá trị 12\
  a|b = 0011 1101 -> có giá trị 61
- Ngoài ra các bạn có thể tìm hiểu thêm các phép toán dịch chuyển BIT : <<,>>,>>>
### Các toán tử quan hệ
Các toán tử quan hệ được sử dụng trong các cấu trúc điều khiển để thực hiện so sánh

|Toán tử|Mô tả|
|---|---|
|==|So sánh bằng <br/> Toán tử này kiểm tra sự tương đương của hai toán hạng|
|!=|So sánh khác <br/> Toán tử này kiểm tra sự khác nhau của hai toán hạng|
|\>|Lớn hơn <br/> Kiểm tra giá trị của toán hạng bên phải lớn hơn toán hạng bên trái hay không|
|<|Nhỏ hơn <br/> Kiểm tra giá trị của toán hạng bên phải có nhỏ hơn toán hạng bên trái hay không|
|\>=|Lớn hơn hoặc bằng <br/> Kiểm tra giá trị của toán hạng bên phải có lớn hơn hoặc bằng toán hạng bên trái hay không|
|<=|Nhỏ hơn hoặc bằng <br/> Kiểm tra giá trị của toán hạng bên phải có nhỏ hơn hoặc bằng toán hạng bên trái hay không|
### Các toán tử logic
Các toán tử logic làm việc với các toán hạng Boolean. Các toán tử quan hệ được sử dụng trong các cấu trúc điều khiển.

|Toán tử|Mô tả|
---|---
|&&|Toán tử và (AND) <br/> Trả về một giá trị "Đúng" (True) nếu chỉ khi cả hai toán tử có giá trị "True" |
|[]|Toán tử hoặc (OR) <br/> Trả về giá trị "True" nếu ít nhất một giá trị là True |
|^|Toán tử XOR <br/> Trả về giá trị True nếu và chỉ nếu chỉ một trong các giá trị là True, các trường còn lại cho giá trị False (sai) |
|!|Toán tử phủ định (NOT) <br/> Toán hạng đơn tử NOT. Chuyển giá trị từ True sang False và ngược lại |

[] = ||
### Các toán tử điều kiện
**Toán tử điều kiện là một loại toán tử đặc biệt vì nó bao gồm ba thành phần cấu thành biểu thức điều kiện.**\
Cú pháp : <biểu thức 1> ? <biểu thức 2> : <biểu thức 3>;\
  biểu thức 1: Biểu thức logic. Trả về giá trị True hoặc False\
  biểu thức 2: Là giá trị trả về nếu <biểu thức 1> trả về là True\
  biểu thức 3: Là giá trị trả về nếu <biểu thức 1> trả về là False
### Toán tử gán
Toán tử gán (=) dùng để gán một giá trị vào một biến
Các ví dụ :
- Phép gán "="\
  int a = 20;
- Phép gán "+="\
  a += 1 (tương đương với a = a + 1).
- Phép gán "-="\
  a -= 1 (tương đương với a = a - 1).
- Phép gán "*="\
  a *= 2 (tương đương với a = a * 2)\
Ngoài ra còn có các phép gán chia: "/=","%="