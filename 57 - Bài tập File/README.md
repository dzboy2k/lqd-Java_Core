## Staff Managerment System (v1.1)
### Tổng quan về dự án
Trong dự án này bạn được yêu cầu bổ sung thêm các tính năng sau:
1. Lưu dữ liệu ra file văn bản (text file).
2. Thực hiện xử lý các ngoại lệ (exception handling) để chương trình không bị dừng (terminate) khi ngoại lệ xảy ra.
### Yêu cầu cụ thể
1. Chương trình cần thực hiện việc ghi dữ liệu nhân viên hành chính (Staff) và giảng viên (Teacher) vào file văn bản (.txt). Thông tin mỗi nhân viên hành chính/giảng viên được ghi trên một dòng, các thuộc tính được phân cách bởi dấu phẩy. \
Chương trình cần thực hiện đọc và nạp lại danh sách nhân viên/giảng viên từ file data.txt khi bắt đầu chạy. \
Ví dụ dữ liệu trong file data.txt:
```
Staff, Nguyen Van A, IT, HEAD, 3.5, 2000.0, 25.0, 5305.0
Staff, Nguyen Van B, IT, STAFF, 2.5, 500.0, 27.0, 3135.0
Teacher, Le Quang Dat, JAVA, MASTER, 7.5, 500.0, 40, 7775.0
```
File data.txt nên đặt trong thư mục src của project
2. Để chương trình không bị dừng lại bất thường (không kiểm soát được), các ngoại lệ sau cần được xử lý :
    - Không đọc được file data.txt (IOException)
    - Đọc file (.txt) lưu dữ liệu bị lỗi:
      - sai định dạng file (không đủ các trường dữ liệu)
      - trường dữ liệu bị sai kiểu
    - Sai dữ liệu khi người dùng nhập (nhân viên/giảng viên) từ bản phím.
