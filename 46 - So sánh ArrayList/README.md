## So sánh ArrayList với Array
Sự khác nhau giữa Array với ArrayList được tóm tắt lại như trong bảng sau:

Array|ArrayList
---|---
1, Kích thước **cố định**.|Kích thước có thể **thay đổi được**.
2, Có thể lưu trữ dữ liệu kiểu **nguyên thủy** và **đối tượng**.|Chỉ có thể lưu trữ dữ liệu kiểu **đối tượng**. Kể từ Java 5, kiểu nguyên thủy được tự động chuyển đổi trong các đổi tượng gọi là **auto-boxing**.
3, Tốc độ lưu trữ và thao tác **nhanh hơn**.|Tốc độ lưu trữ và thao tác **chậm hơn**.
4, Chỉ có thuộc tính **length**.|Có nhiều phương thức để thao tác với dữ liệu.
## So sánh LinkedList và ArrayList
### Giống nhau giữa ArrayList và LinkedList
Cả hai lớp _ArrayList_ và _LinkedList_ đều được implements từ List Interface và duy trì thứ tự của phần tử được thêm vào. Cả hai lớp này đều là lớp không đồng bộ (non-sychronized).
### Khác nhau giữa ArrayList và LinkedList
#### 1. Cấu trúc dữ liệu
- **ArrayList** sử dụng mảng động để lưu trữ các phần tử. ArrayList là một cấu trúc dữ liệu dựa trên chỉ số (index), trong đó mỗi phần tử (element) được liên kết với một chỉ mục.
- **LinkedList** sử dụng danh sách liên kết doubly để lưu trữ các phần tử. Các phần tử trong LinkedList được gọi là node, mỗi node cần lưu trữ 3 thông tin: tham chiếu phần tử trước nó, giá trị của phần tử và một tham chiếu tới phần tử kế tiếp.
#### 2. Thao tác thêm và xóa
- **ArrayList** sẽ sắp xếp lại sau khi thêm/ xóa phần tử, do vậy thao tác thêm và xóa chậm.
- **LinkedList** không sắp xếp lại sau khi thêm/ xóa phần tử, do vậy thao tác thêm và xóa nhanh hơn ArrayList, nó chỉ cập nhật lại tham chiếu đến phần tử trước và sau phần tử.
#### 3. Thao tác tìm kiếm
**Truy suất phần tử trong ArrayList nhanh hơn LinkedList**. Bởi vì các phần tử trong ArrayList được lưu trữ dựa trên chỉ mục (index), còn LinkedList phải duyệt qua lần lượt các phần tử từ đầu tiên cho đến cuối cùng.
#### 4. Thao tác truy xuất ngẫu nhiên
- ArrayList có thể truy xuất ngẫu nhiên các phần tử.
- LinkedList không thể truy xuất ngẫu nhiên. Nó phải duyệt qua tất cả các phần tử từ đầu tiên đến phần tử cuối cùng để tìm phần tử.
### Khi nào sử dụng ArrayList và LinkedList?
- ArrayList khi bạn cần truy cập nhanh dữ liệu.
- LinkedList khi cần làm việc với việc chèn / xóa/ cập nhật phần tử.
