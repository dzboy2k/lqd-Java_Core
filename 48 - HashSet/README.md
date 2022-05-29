### Set Interface trong Java Collections
- Set được sử dụng để lưu trữ dữ liệu không trùng lặp.
- Các lớp implement set Interface: HashSet, TreeSet, LinkedHashSet
### HashSet trong Java Collections
- Lớp **HashSet** implement **Set interface**.
- Cần phải **import** java.util.HashSet khi sử dụng
#### Đặc điểm cần ghi nhớ về HashSet:
1. HashSet chỉ chứa các phần tử duy nhất.
2. HashSet lưu trữ các phần tử bằng cách sử dụng một cơ chế được gọi là băm.
### Ví dụ về HashSet trong Java
Một số phương thức với HashSet
- add(E e) thêm phần tử vào tập hợp
- size() lấy số phần tử
- isEmpty() kiểm tra rỗng hay không
- contains(Object o) kiểm tra có chứa phần tử
- remove(Object o) xóa phần tử khỏi tập hợp
- toArray() lấy mảng các phần tử \
Ngoài ra duyệt danh sách phần tử bằng vòng lặp (for) hoặc bằng **Iterator interface**. 