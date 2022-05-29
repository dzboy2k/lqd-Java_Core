## Giới thiệu Java Collections Framework
- Java Collections Framework cung cấp một tập hợp các Interface và các classes để giúp chúng ta làm việc dễ dàng nhanh chóng với các tập hợp dữ liệu.
- Trong Interface Collections chúng ta có các Interface chính như: List Interface, Set, SortedSet, Map và SortedMap.
### Ví dụ về classes:
1. **ArrayList**: là 1 class dạng list được implement dựa trên mảng có kích thước thay đổi được.
2. **LinkedList**: là một class dạng list hoạt động dựa trên cơ sở của cấu trúc dữ liệu danh sách liên kết đôi (double-linked list)
3. **HashMap**: là class thực thi giao diện **Map Interface, HashMap** lưu trữ dữ liệu ở dạng các cặp key-value (khóa-giá trị).
### Hirarchy of Collections Framework
Gói **java.util** chứa tất cả các class và interface của Collection.
```
                                        Iterable
                                            |
                                        Collection
                    /                       |                                \
             List                         Queue                                Set
          /   |    \                       |         \                     /  |      \ 
       /      |       \        ------------|---------Deque               /    |       SortedSet
    /         |         \     |            |            \              /      |            \
ArrayList   Vector    LinkedList    PriorityQueue   ArrayQueue    HashSet   LinkedHashSet   TreeSet
```

```
                      Map
          /         /     \         \
        /          /       \          SortedMap
      /           /         \            |
HashMap   LinkedHashMap   HashTable   TreeMap
```
### Các Interface trong Java Collections

Tên interface|Đặc điểm khái quát
---|---
List interface| Các phần tử trong List interface được sắp xếp có thứ tự và có thể có giá trị giống nhau.
Set| Các phần tử trong Set là duy nhất (_nghĩa là giá trị của các phần tử này không được giống nhau_).
SortedSet| Là 1 dạng riêng của Set Interface, trong đó giá trị của các phần tử mặc định được sắp xếp tăng dần.
Map| Giá trị cảu các phần tử trong Map bao gồm 2 phần đó là khóa (key) và giá trị tương ứng của key đó (value) và khóa của các phần tử này là duy nhất.
SortedMap| Là 1 dạng riêng của Map interface, trong đó giá trị key được sắp xếp tăng dần.
LinkedList (Danh sách liên kết)| Là 1 cấu trúc dữ liệu lưu trữ các phần tử dưới dạng danh sách. Các phần tử trong LinkedList được sắp xếp có thứ tự và có thể có giá trị giống nhau.
ArrayList| Là kiểu danh sách sử dụng cấu trúc mảng để lưu trữ phần tử. Thứ tự các phần tử dựa theo thứ tự lúc thêm vào và giá trị của các phần tử này có thể trùng nhau. 
HashSet| Thứ tự các phần tử trong HashSet không dựa theo thứ tự lúc thêm vào và giá trị của các phần tử này là duy nhất. 
TreeSet| Các phần tử trong TreeSet mặc định được sắp xếp tăng dần và giá trị của các phần tử này là duy nhất. 
HashMap| Giá trị của mỗi phần tử trong HashMap bao gồm 2 phần tử đó là khóa (key) và giá trị tương ứng của key đó (value) và khóa của các phần tử này là duy nhất. HashMap cho phép truy xuất trực tiếp dữ liệu bằng bằng khóa duy nhất của nó.
TreeMap| Giá trị của mỗi phần tử trong TreeMap bao gồm 2 phần tử đó là khóa (key) và giá trị tương ứng của key đó (value) và khóa của các phần tử này là duy nhất. Giá trị của các phần tử trong TreeMap được sắp xếp tăng dần.

### Ví dụ sử dụng Java Collection
Sau đây là một vài ví dụ khai báo một Java Collection.
```java
public class CollectionExample1 {

  public static void main(String[] args) {

    //Khai báo một ArrayList
    List<String> arrayList = new ArrayList<String>();
    arrayList.add("PHP");
    arrayList.add("Python");
    arrayList.add("Java");

    //Khai báo một LinkedList
    List<String> linkedList = new LinkedList<String>();
    linkedList.add("PHP");
    linkedList.add("Python");
    linkedList.add("Java");

    //Khai báo một HashSet
    Set<String> hashSet = new HashSet<String>();
    hashSet.add("PHP");
    hashSet.add("Python");
    hashSet.add("Java");

    //Khai báo một HashMap
    Map<String, String> hashMap = new HashMap<String, String>();
    hashMap.put("Language1", ".Net");
    hashMap.put("Language2", "Java");

  }
}
```
Note: Cần phải import các classes
```java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
```