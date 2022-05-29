## Lớp LinkedList trong java
- Lớp **LinkedList** trong java sử dụng cấu trúc danh sách liên kết Doubly (Doubly Linked List) để lưu trữ các phần tử.
- Cần phải import java.util.LinkedList;
#### Đặc điểm cần ghi nhớ về LinkedList:
1. Có thể chứa các phần tử trùng lặp
2. Duy trì thứ tự của phần tử được thêm vào.
3. Không đồng bộ (non-synchronized)
4. Thao tác nhanh vì không cần phải dịch chuyển nếu bất kì phần tử nào bị xóa khỏi danh sách.
### Hierarchy của lớp LinkedList
```
    Iterable
        |
    Collection
     /     \
  List    Queue
    \       |    
     \    Deque
      \   /
    LinkedList
```
### Ví dụ sử dụng lớp LinkedList
LinkedList cũng implement List interface cho nên nó cũng có một số method giống ArrayList, ngoài ra nó còn cung cấp thêm một số method dưới đây:
- Add phần tử: _add, addAll_
- Đọc phần tử: _get(index), getFirst() và getLast()_
- Cập nhật giá trị của phần tử: _set(int index, E element)_