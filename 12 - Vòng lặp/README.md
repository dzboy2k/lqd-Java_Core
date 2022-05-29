## Vòng lặp for - while - do while trong Java
**Định nghĩa**: Vòng lặp dùng để xử lý những khối lệnh được lặp đi lặp lại trong chương trình của chúng ta.\
Ví dụ: In ra màn hình các số theo thứ tự từ 1 đến 100.\
Có 3 kiểu vòng lặp : **for , while , do...while**
### Vòng lặp for
- Cú pháp:
``` 
for (khoi_tao_bien;check_dieu_kien;tang/giam_bien) {
  // Khối lệnh được thực thi
}
```
- Vòng lặp for thường được sử dụng với số lần lặp biết trước
### Vòng While
- Cú pháp:
``` 
while (condition) {
  // Khối lệnh được lặp lại cho đến khi condition = False
}
```
- Vòng lặp While thường được sử dụng với số lần lặp không xác định
### Vòng Do- While
- Cú pháp:
``` 
do {
  // Khối lệnh được thực thi
}
while (condition);
```
- Tương tự như vòng lặp while, ngoại trừ do-while thực hiện lệnh ít nhất một lần ngay cả khi điều kiện là False.