### Replace trong Java String
- Phương thức replace() được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
- Phương thức:
```
public String replace(char oldChar, char newChar) 
public String replace(CharSequence target, CharSequence replacement) 
```
- Ví dụ
```java
public class ReplaceExample {

  public static void main(String[] args) {
    String s1 = "Hello Java";
    
    //thay thế tất cả ký tự 'a' thành 'o'
    String replaceString1 = s1.replace('a', 'o');
    System.out.println(replaceString1); // Kết quả : Hello Jovo

    //thay thế chuỗi "Java" thành "Python"
    String replaceString2 = s1.replace("Java", "Python");
    System.out.println(replaceString2); // Kết quả : Hello Python
  }
}
```