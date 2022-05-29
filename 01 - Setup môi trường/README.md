## Tại sao nên chọn Java để học?
### 1. Ngôn ngữ lập trình hướng đối tượng
Nếu bạn đang đi tìm một ngôn ngữ lập trình hướng đối tượng để học thì JAVA sẽ luôn là lựa chọn số 1. JAVA được thiết kế gần như 100% OOP, với cú pháp rõ ràng rành mạch, mạnh mẽ, rất dễ đọc và tìm hiểu.
### 2. Java là mã nguồn mở (Open Source)
Java là một ngôn ngữ lập trình mã nguồn mở, free cho các nền tảng, bạn không phải trả bất cứ chi phí gì để viết ứng dụng của bạn.
### 3. API phong phú
Java có hệ sinh thái mã nguồn mở cung cấp nhiều API vô cùng phong phú và bạn làm mọi thứ khi làm việc với Java: Lập trình network, games, desktop, web app,...
### 4. Cộng đồng lớn
- Cộng đồng phát triển Java mạnh nhất thế giới Open Source
- Nếu bạn muốn hỏi vấn đề của bạn thì có thể vào Google, Stackoverflow, GitHub,...
### 5. Cơ hội việc làm lớn
Học Java có cơ hội việc làm rất lớn, bạn có thể làm ở các công ty phần mềm hoặc làm freelancer. Nhu cầu tuyển dụng Job về lập trình viên JAVA rất lớn, bạn có thể vào các trang tuyển dụng như: https://www.vietnamworks.com để thấy rõ điều đó.

## Giới thiệu về Java
### Java Introduction
- Java là ngôn ngữ lập trình hướng đối tượng, được phát triển bởi Sun Microsystem vào năm 1995, sau đó Oracle mua lại và tiếp tục phát triển cho đến ngày nay.
- Java là tên một hòn đảo ỏ Indonesia. Ban đầu Ngôn ngữ này được đặt tên là "Oak" (có nghĩa là "Cây sồi)
- Hỗ trợ đa nền tảng (Window, UNIX, Linux, Mac OS)
  - _"write one, run everywhere"_
- Java luôn đứng top ranking các ngôn ngữ lập trình nên học từ các trang thống kê nổi tiếng như: stackoverflow, Github...
- https://www.oracle.com/java/technologies/downloads/

==> Google: Java Oracle ==> Java Software | Oracle
### Ứng dụng Java
- Lập trình Desktop Application (Swing)
- Lập trình Java Web (Jsp,servlet)
- Lập trình Games
- Lập trình mobile App (android)
- Lập trình TCP/IP,Networking
- Đặc biệt sử dụng để phát triển các ứng dụng Enterprice Application như: Banking, ERP,Back-End system để giao tiếp với các hệ thống khác.

## Setup JDK & Biến môi trường JAVA
1. download JAVA
2. setup
3. setup bien moi truong
4. check java version
#### ==1==
==> Google: download java 8 oracle => Java SE 8 Archive Downloads => Java SE Development Kit 8u301 => Windows x64 Installer
#### ==3==
==> This PC => Properties => Advanced system settings => Environment Variables:
- System variables: New:
```
Variable name: JAVA_HOME
Variable value: C:\Program Files\Java\jdk1.8.0_251
  ==> OK
```
- Path => Edit... => New:
```
%JAVA_HOME%\bin
  ==> OK
```
#### ==4==
```
java --version
```

## Setup Eclipse
1. download va cai dat eclipse
2. Thiet lap co ban cho eclipse
3. Tao workspace
#### ==1==
Google: eclipse download => Eclipse IDE for Java EE ... => Eclipse Oxygen (4.7) => 3A Packages => Eclipse IDE for Java EE Developers => x86_64
#### ==2==
Eclipse: Window => Preferences:
```
Java: 
  Installed JREs:
    + Edit...
    + Add... => Standard VM => Next:
      + JRE home: D:\Environment\java\jdk1.7.0_76_x86 
        => Finish
  General: 
    Workspace 
      => Text file encoding: Other => UTF-8
      => Bỏ Build automatically
```
#### ==4==
```
Eclipse: 
  File => New => Switch Workspace => Other...
    => Launch
  File => New => Other... => Java Project => Next:
    Project Name: JavaCore 
    => Use a project specific JRE: jre1.8.0_191
    => Finish
    
  src => New => Class => Name: => public 
    => Chọn public static void main(String[] args)
    => Finish
    
  Rus as => Java Application
  
Cmd:
  cd D:\..\..\JavaCore\src\
  D:
  javac HelloWorld.java
  java HelloWorld
```

## Quá trình Biên Dịch và Thông Dịch một chương trình Java
### Quá trình Write One, Run Anywhere ?
```
Write Once, Run Anywhere
                                        Java Interprefer
                                        for Mac OS
Java        Compiler      Java      //
Program ==>           ==> Bytecode  ==> Java Interprefer
                          Program       for Windows
                                    \\
                                        Java Interprefer
                                        for Linux
                                          
HelloWorld.java <==> Java Program
||
javac HelloWorld.java <==> Compiler
||
HelloWorld.class <==> Java Bytecode Program
||
Java HelloWorld <==> Java Interprefer
||
Hello World
```
### Quá trình biên dịch và chạy chương trình JAVA
```
Chương trình  => Dịch (Complier) => Các mã byte  | Tệp các
nguồn                               (Byte Codes) | lớp .class 
Tệp chương                                ||
trình java                                || Kiểm tra các
(.java)                                   || byte codes
                                          ||
                                    Các mã byte 
                                    (Byte Codes) 
                                          ||
                                          || Bộ nạp lớp 
                                          || (class loader)
                                          ||      
                                    Máy Java ảo 
                                    (Java Virtual machine)
                                          ||
                                          || Thông dịch
                                          || (Interprefer)
                                          ||
                                    Phần cứng và hệ điều hành
                                    (Hardware and OS)   
                                    || Dã thực hiện .exe
```

## JDK, JRE, JVM
### Tìm hiểu JVM
#### Hiểu rõ sự khác nhau giữa JDK, JRE và JVM là điều khá quan trọng trong Java.
- JVM (viết tắt của Java Virtual Machine) máy ảo JAVA có thể giúp máy tính chạy các chương trình Java. Nó cung cấp môi trường runtime mà trong đó Java Bytecode có thể được thực thi.
- JVM là có sẵn cho nhiều nền tảng (Windows, Linux...). JVM, JRE và JDK là phụ thuộc nền tảng, bởi vì cấu hình của mỗi OS (hệ điều hành) là khác nhau. Nhưng, java là độc lập nền tảng.
### Tìm hiểu JRE
JRE (là viết tắt của Java Runtime Environment) được sử dụng để cung cấp môi trường runtime. Nó là trình triển khai của JVM. JRE bao gồm tập hợp các thư viện và các file khác mà JVM sử dụng tại runtime. Trình triển khai của JVM cũng được công bố bởi các công ty khác ngoài Sun Micro Systems.
### Tìm hiểu JDK
JDK (là viết tắt của Java Development Kit) bao gồm JRE và các Development Tool.