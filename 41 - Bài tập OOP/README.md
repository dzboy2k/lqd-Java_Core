## Mô tả bài Assignment
Viết các lớp mô tả về ba loại Ong khác nhau là: ong thợ (Worker bee), ong chúa (Queen bee) và ong đực (Drone). Mỗi con ban đâu có sức khỏe mặc định là 100.
- Xây dựng phương thức damage() lấy ngẫu nhiên một số nguyên từ 0 đến 100. Khi phương thức này được gọi ở mỗi con ong thì sức khỏe (health) sẽ bị giảm theo số ngẫu nhiên (không lớn hơn số health hiện tại của con ong) vừa lấy được theo phương thức trả về. 
- Khi sức khỏe của ong thợ dưới 70 thì nó không thể bay và chết. Ong chúa sẽ chết khi sức khỏe dưới 20 và ong đực sẽ chết khi sức khỏe dưới 50. Sống hay chết là một thuộc tính của mỗi con ong. Khi ong đã chết thì sức khỏe sẽ không bị giảm mặc dù vẫn gọi đến phương thức damage().
- Bạn tạo ra một chương trình có một tập hợp số ngẫu nhiên 10 con ong có cả 3 loại ong trên. Hiển thị thông tin số thứ tự, loại ong, sức khỏe và trạng thái sống hay đã chết.
- Chương trình hiện menu trên dòng lệnh gồm hai lựa chọn 1 và 2.
#### 1 - Create bee list: 
Tạo danh sách ong mới ngẫu nhiên gồm 10 con ong theo 3 loại ong mô tả phía trên.
#### 2 - Attack bees:
Tấn công lền lượt những con ong và hiển thị thông tin của những con ong sau khi đã bị tấn công.
#### Yêu cầu về giao diện:
Xem kỹ các hình ảnh chạy mẫu sau để biết cách thức hoạt động của chương trình, giao diện cần thiết phải làm.
#### Màn hình chính
```
--------------Bee hive--------------
        1 - Create bee list
        2 - Attack bees
        3 - Exit
Enter your choice (1, 2 or 3):
```
#### Chức năng Create bee list
```
--------------Bee hive--------------
        1 - Create bee list
        2 - Attack bees
        3 - Exit
Enter your choice (1, 2 or 3): 1
Bees details at the beginning:
1) Drone      100       alive
2) Drone      100       alive
3) Worker     100       alive
4) Queen      100       alive
5) Queen      100       alive
6) Worker     100       alive
7) Drone      100       alive
8) Worker     100       alive
9) Worker     100       alive
10) Worker    100       alive
```
#### Chức năng Attack bees
Gọi lần 1:
```
--------------Bee hive--------------
        1 - Create bee list
        2 - Attack bees
        3 - Exit
Enter your choice (1, 2 or 3): 2
Bees details at the moment:
1) Drone      47        dead
2) Drone      73        alive
3) Worker     93        alive
4) Queen      86        alive
5) Queen      9         dead
6) Worker     4         dead
7) Drone      16        dead
8) Worker     11        dead
9) Worker     77        alive
10) Worker    14        dead
```
Gọi lần 2:
```
Bees details at the moment:
1) Drone      47        dead
2) Drone      73        alive
3) Worker     93        alive
4) Queen      86        alive
5) Queen      9         dead
6) Worker     4         dead
7) Drone      16        dead
8) Worker     11        dead
9) Worker     77        alive
10) Worker    14        dead
--------------Bee hive--------------
        1 - Create bee list
        2 - Attack bees
        3 - Exit
Enter your choice (1, 2 or 3): 2
Bees details at the moment:
1) Drone      47        dead
2) Drone      39        dead
3) Worker     16        dead
4) Queen      4         dead
5) Queen      9         dead
6) Worker     4         dead
7) Drone      15        dead
8) Worker     11        dead
9) Worker     45        dead
10) Worker    14        dead
--------------Bee hive--------------
        1 - Create bee list
        2 - Attack bees
        3 - Exit
Enter your choice (1, 2 or 3): 
```
Ghi chú: Dữ liệu này có thể khác khi chạy trên máy bạn (do trong chương trình có sử dụng các giá trị ngẫu nhiên như loại ong, sức khỏe (health) của ong)