## Debugging chương trình
### Debugging là gì?
- Debugging chương trình là quá trình dò tìm lỗi của chương trình, đồng thời cũng là cách sẽ giúp bạn có thể hiểu về cách chương trình vận hành trong những trường hợp bạn kế thừa chương trình từ người khác.
- Vì vậy debug là một kỹ năng vô cùng quan trọng đối với các bạn Developer (Lập trình viên)
- Các phương pháp Debug
  - Print console: Tức là bạn thêm code vào chương trình để in nội dung ra màn hình console.
  - Log file: Bạn ghi nội dung muốn monitor ra file log, từ đó bạn có thể review lại file log để dò tìm ra lỗi.
  - Sử dụng tool: Tức là bạn dùng tool để chạy chương trình ở chế độ debug, khi đó bạn có thể theo dõi từng dòng lệnh chạy được, theo dõi được những giá trị của biến trong từng khối code,... Ví dụ bạn có dùng eclipse để debug chương trình của bạn.
### Các bước debug code Java trong Eclipse ?
1. Tạo BreakPoint.
2. Start chương trình ở chế dộ Debug.
3. Theo dõi flow thực thi của chương trình.

```
debug (Window=>Show View=>Debug)
java ee
đặt breakpoint (toggle breakpoint)
  9. this.id = id;
  45. if (id != null) {
debug as => Java Application
Step Over (F6) chạy dòng tiếp thep
Variables => Change Value... Thay đổi giá trị (name=Sinh Vien B)
Step Over (F6)
F8 (Resume) 
Variables => Change Value...(id=null)
Step Over (F6)
```