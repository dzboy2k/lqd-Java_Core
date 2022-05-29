### Sử dụng Break trong java
**Từ khóa break trong java** được sử dụng để stop thực thi lệnh trong vòng lặp hoặc trong mệnh đề switch tại điều kiện đã được chỉ định \
Ví dụ:
```java
public class BreakExample {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        break;
      }
      // Không in ra giá trị 5
      System.out.println(i);
    }
  }
}
```
Kết quả in ra màn hình : 1,2,3,4
### Sử dụng Continue trong java
**Từ khóa continue trong java** được sử dụng để tiếp tục vòng lặp tại điều kiện đã được xác định, với điều kiện đó khối lệnh phía sau từ khóa continue sẽ không được thực thi \
**Ví dụ:**
```java
public class ContinueExample {
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      if (i == 5) {
        continue;
      }
      // Khi i == 5 thì không in i = 5 ra màn hình
      System.out.println(i);
    }
  }
}
```
**Kết quả in ra màn hình :** 1,2,3,4,6,7,8,9,10