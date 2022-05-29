## Staff Managerment System
### I. Tổng quan dự án
Bạn được yêu cầu viết các chức năng quản lý giảng viên và cán bộ của Trường đại học trực tuyến X.
### II. Các chức năng gồm
1. Nhập dữ liệu giảng viên/cán bộ
2. Tìm kiếm giảng viên/cán bộ theo tên hoặc theo đơn vị làm việc (phòng/khoa) 
3. In ra danh sách giảng viên/cán bộ được sắp xếp theo tên
### III. Tại sao cần làm dự án này?
- Sản phẩm này đủ phức tạp để bạn áp dụng 4 kỹ thuật của OOP là trừu tượng hóa dữ liệu (data abstraction), thừa kế (inheritance), đa hình (polymorphism) và đóng gói (encapsulation).
- Ngoài ra bạn cần sử dụng các thư viện Java collection như ArrayList và biết cách sắp xếp các đối tượng theo thuộc tính (attributes) sử dụng phương thức Collections.sort(...)
### IV. Tôi sẽ học được gì khi làm dự án này?
- Bạn sẽ học được cách xác định các đối tượng từ mô tả bài toán (requirements). Đặc trưng hóa (generalize) các đối tượng để xác định lớp cơ sở (base class), lớp thừa kế (derived class). Học cách xác định lớp trừu tượng (abstract), phương thức trừu tượng (abstract method).
- Thực hành cài đặt override ở lớp thừa kế (derived class), hiểu và áp dụng đặc tính đa hình (polymorphism) của OOP và cách cài đặt nó trong Java.
- Học cách thiết kế kiến trúc (architecture design), thiết kế component/package, cách thiết kế lớp, phương thức.
- Học cách chia nhỏ hệ thống cần làm thành các thành phần nhỏ hơn và triển khai nó một cách song song với thành phần khác.
- Học cách tích hợp các thành phần khác nhau thành ứng dụng.
### V. Yêu cầu chức năng
- Xây dựng phần mềm quản lý thông tin cán bộ (gồm giảng viên và nhân viên hành chính) trong trường đại học X.
- Với giảng viên cần quản lý các thông tin: Họ tên, khoa, trình độ (cử nhân, thạc sĩ, tiến sĩ), phụ cấp, số tiết dạy trong tháng, hệ số lương.
- Với nhân viên hành chính cần quản lý: Họ tên, phòng ban, số ngày công, hệ số lương, phụ cấp, chức vụ (trưởng phòng, phó phòng, nhân viên).
- Phụ cấp cán bộ được tính theo bảng:

  Cán bộ|Phụ cấp
  ---|---
  Cử nhân|300
  Thạc sĩ|500
  Tiến sĩ|1000
  Trưởng phòng|2000
  Phó phòng|1000
  Nhân viên|500

- Lương giảng viên được tính như sau: Hệ số lương\*730+phụ cấp+số tiết dạy\*45
- Lương nhân viên được tính như sau: Hệ số lương\*730+phụ cấp+số ngày công\*30
#### Viết chương trình quản lý thôbg tin cán bộ trong trường bao gồm các chức năng:
- Nhập dữ liệu cho các cán bộ trong trường (nhập từ bàn phím)
#### Yêu cầu về OOP:
- Áp dụng các kiến thức về lập trình hướng đối tượng để xây dựng chương trình.
- Sử dụng thành thạo tính chất trừu tượng, đóng gói, đa hình, kế thừa và áp dụng được abstract class và interface trong bài làm.
- Hàm main chỉ thực hiện gọi đến các chức năng mà không cần viết nghiệp vụ nào khác.
#### Yêu cầu về giao diện
Xem kỹ các hình ảnh chạy mẫu sau để biết cách thức hoạt động của chương trình, giao diện phải làm.
- Màn hình chính:
```
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5):        
```
- Chức năng Add staff: Thêm 1 nhân viên
```
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5): 1
Do you want to create a Staff or a Teacher (enter S for Staff, otherwise for Teacher)?s
Name:Tran Tuan Anh
Salary ratio:3.4
Department:IT
Position (1=HEAD, 2=VICE HEAD, 3=STAFF): 1   
Number of working days:22
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5):      
```
- Chức năng Add staff: Thêm 1 giáo viên
```
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5): 1
Do you want to create a Staff or a Teacher (enter S for Staff, otherwise for Teacher)?t
Name:Nguyen Hai Nam
Salary ratio:5.2
Faculti:Eng
Degree (1=BACHNELOR, 2=MASTER, 3=DOCTOR): 2   
Number of teaching hours:45
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5):      
```
- Chức năng display danh sách nhân viên
```
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5): 4
Results:
Name, Fac/Dept, Deg/Pos, Sal Ratio, Allovance, T.Hours/W.Days, Salary
Nguyen Hai Nam, Eng, MASTER, 5.2, 500.0, 45, 6321.0   
Tran Tuan Anh, IT, HEAD, 3.4, 2000.0, 22.0, 5142.0
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5):
```
- Chức năng tìm kiếm nhân viên theo tên <br/> Chương trình sẽ liệt kê tất cả nhân viên có tên chứa chuỗi do người dùng nhập vào (không phân biệt chữ hoa, chữ thường).
```
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5): 2
        Enter name to search: Tua
Results:
Name, Fac/Dept, Deg/Pos, Sal Ratio, Allovance, T.Hours/W.Days, Salary
Tran Tuan Anh, IT, HEAD, 3.4, 2000.0, 22.0, 5142.0
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5):
```
- Chức năng tìm kiếm nhân viên theo phòng <br/> Chương trình sẽ liệt kê tất cả nhân viên thuộc phòng chứa chuỗi do người dùng nhập vào (không phân biệt chữ hoa, chữ thường).
```
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5): 2
        Enter dept/fac to search: en
Results:
Name, Fac/Dept, Deg/Pos, Sal Ratio, Allovance, T.Hours/W.Days, Salary
Nguyen Hai Nam, Eng, MASTER, 5.2, 500.0, 45, 6321.0
University Staff Management 1.0
        1.Add staff
        2.Search staff by name
        3.Search staff by department/faculty
        4.Display all staff
        5.Exit
Select function (1, 2, 3, 4 or 5):
```