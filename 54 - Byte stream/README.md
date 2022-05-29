## Giới thiệu về Java IO
### Input/Output trong Java
- Java IO cung cấp một tập hợp của các **classes và interface** mà ta có thể sử dụng để thực hiện hầu hết như mọi thao tác vào - ra thông qua ứng dụng Java.
- Trong đó, Java sử dụng khái niệm **stream** để làm cho hoạt động I/O nhanh hơn.
- Khái niệm về **stream** ở đây là một dãy dữ liệu liên tục.
- Package **java.io** chứa tất cả các lớp cần thiết cho hoạt động input và output.
- Hoạt động của Java OutputStream và InputStream được mô tả trong hình dưới đây:
```
File  Console   Socket                                      File  Console   Socket
    \    |     /                                                \    |     /
     \   |   /   InputStream        Java        OutputStream     \   |   /
      Source  -- 101010101010 -- Application -- 101010101010 -- Destination
                     Read                           Write
```
### Kiến trúc Input Stream (Luồng nhập dữ liệu)
- Lớp **InputStream/Reader** là lớp trừu tượng. Nó là super class của tất cả các lớp đại diện cho một input stream.
```
                       ---FileInputStream
                       |  
                       |                    BufferedInputStream
                       |                   /
            InputStream -- FilterInputStream
          /            |                   \
         /             |                    DataInputStream
        /              |                      
       /               ---ObjectInputStream
 Object                       
       \              
        \            BufferedReader
         \         /
            Reader    
                   \  
                     Input Stream Reader --- File Reader
```
### Kiến trúc Output Stream (Luồng xuất dữ liệu)
- Trong đó **OutputStream/Writer** là lớp trừu tượng. Nó là super class của tất cả các lớp đại diện cho một Output stream.
```
                       ---FileOutputStream
                       |  
                       |                    BufferedOutput Stream
                       |                   /
            OutputStream -- FilterOutputStream
          /            |                   \
         /             |                    DataOutput Stream
        /              |                      
       /               ---ObjectOutputStream
 Object                       
       \              
        \            BufferedWriter
         \         /
            Writer   PrintWriter
                   \  
                     OutputStreamWriter --- FileWriter
```
### Đọc ghi file trong Java
- Java cung cấp 3 kiểu stream để đọc ghi file trong Java:
  - Byte stream => sử dụng các classes **FileInputStream/FileOutputStream**.
  - Character stream => sử dụng các classes **FileReader/FileWriter**.
  - Buffered stream => sử dụng các classes **BufferedReader/BufferedWriter**.
- Các thao tác xử lý dữ liệu:
  - Bước 1: Tạo đối tượng luồng và liên kết với nguồn dữ liệu.
  - Bước 2: Thao tác dữ liệu (đọc hoặc ghi hoặc cả hai).
  - Bước 3: **Đóng luồng**.
### Đọc ghi file với byte stream
- Các chương trình sử dụng Byte Stream để đọc ghi dữ liệu theo từng byte (8bit). Tất cả các class Byte Stream có nguồn gốc từ **InputStream và OutputStream**.
- **FileInputStream và FileOutputStream** thường được sử dụng cho việc đọc - ghi byte.
### Đọc ghi file với character stream
- Byte Stream trong Java được sử dụng để thực hiện input và output của các byte (8 bit), trong khi đó, Character Stream trong Java được sử dụng để thực hiện input và output cho Unicode 16 bit. Tất cả các class Character Stream có nguồn gốc từ Reader và Writer.
- **FileReader và FileWriter** thường được sử dụng cho việc đọc - ghi trong trường hợp này.