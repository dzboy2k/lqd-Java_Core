## List interface trong Java Collections
- List là một interface trong java. Nó chứa các phương thức để chèn và xóa các phần tử dựa trên chỉ số index.
- Các classes implement List: _ArrayList, Vector, LinkedList_
### ArrayList trong Java Collections
- Lớp **ArrayList** trong Java được sử dụng như một mảng động để lưu trữ các phần tử. Nó impliments **List Interface**.
- Cần phải import gói thư viện java.util.ArrayList vào trong class.
#### Đặc điểm cần ghi nhớ về ArrayList:
1. Có thể chứa các phần tử trùng lặp
2. Duy trì thứ tự của phần tử được thêm vào.
3. Không đồng bộ (non-synchronized)
4. Cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục.

Ví dụ:
```
// Creating arraylist
List<String> arrayList = new ArrayList<String>();
arrayList.add("PHP");
arrayList.add("Python");
arrayList.add("Java");
```
### Hierarchy của lớp ArrayList
```
Iterable
   |
Collection
   |
  List
   |
ArrayList
```
### Một số phương thức thông dụng trong ArrayList
1. **add(Object o)** thêm phần tử vào cuối
2. **remove(int index)** xóa phần tử có chỉ số index
3. **clear()** xóa mọi phần tử 
4. **contains(Object o)** kiểm tra mảng có chứa phần tử
5. **get(int index)** lấy phần tử có chỉ số index
6. **size()** lấy số phần tử
7. **toArray()** chuyển thành mảng