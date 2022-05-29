### Phương thức split trong Java String
- Phương thức split() tách chuỗi và trả về mảng chuỗi
- Phương thức
```
public String split(String regex)
public String split(String regex, int limit)
```
- Ví dụ
```java
public class SplitExample {
  public static void main(String[] args) {
    String s1 = "Hello java";
    
    String[] words = s1.split("\\s");// tach chuoi dua tren khoang trang
    // su dung vong lap foreach de in cac element cua mang chuoi thu duoc
    for (String w : words) {
      System.out.println(w);
    }
  }
  
}
```