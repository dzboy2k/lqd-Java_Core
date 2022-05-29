### Map Interface trong Java Collections
- Trong java, **map** được sử dụng để lưu trữ và _truy xuất dữ liệu theo cặp key và value_. Mỗi cặp key và value được gọi là mục nhập (entry). _Map trong java chỉ chứa các giá trị key duy nhất_. Map rất hữu ích nếu bạn phải tìm kiếm, cập nhật hoặc xóa các phần tử dựa vào các key.
- Các classes implement map: HashMap, HashTable, TreeMap, Linked HashTable
### HashMap trong Java Collections
HashMap được sử dụng để lưu trữ dữ liệu tập hợp như là cặp key / value.
- Lớp **HashMap** implement **Map Interface**
- Cần phải **import** java.util.HashMap khi sử dụng
#### Đặc điểm cần ghi nhớ về HashMap:
1. HashMap lưu trữ dữ liệu dưới dạng cặp key và value.
2. Nó chứa các key duy nhất.
3. Nó có thể có 1 key là null và nhiều giá trị null.
4. Nó duy trì các phần tử không theo thứ tự.
### Hierarchy của lớp HashMap
```
                    Map
         /      |       \         \
        /       |        \        SortedMap
       /        |         \              \
HashMap   LinkedHashMap   HashTable   TreeMap
```
### Ví dụ về HashMap trong java
Một số phương thức với HashMap
- **put(Object key,Object value)** : thêm một phần tử
- **containsKey(Object key)** kiểm tra phần tử có key tồn tại
- **containsValue(Object value)** kiểm tra phần tử có giá trị value tồn tại hay không
- **get(Object key)** lấy giá trị phần tử theo key
- **remove(Object key)** loại bỏ phần tử theo key
- **size()** lấy số phần tử
- **clear()** xóa toàn bộ phần tử \
Ngoài ra duyệt danh sách phần tử bằng vòng lặp (for) hoặc bằng **Iterator Interface**.
