## Cách duyệt - Sắp xếp phần tử trong Java Collections
### Cách duyệt phần tử Java Collections
- Có 2 cách để duyệt các phần tử của collection trong java.
  - Sử dụng **Iterator interface**. Trong các bài trước, khi muốn duyệt qua các phần tử của một đối tượng nào đó thì thông thường chúng ta hay sử dụng các loại vòng lặp như for, while hoặc do-while. Nhưng đối với Collections thì chúng ta sử dụng một cách mới để duyệt qua các phần tử của một Collections đó là **Iterator interface**.
  - Sử dụng **vòng lặp for-each**
- Ví dụ:
```java
public class ArrayListExample1 {
  public static void main(String[] args) {

    // Creating arraylist
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("C++");
    list.add("PHP");

    // Show list through Iterator
    Iterator<String> itr = list.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next() + ", ");
    }
    // Show list through for-each
    System.out.println();
    for (String obj : list) {
      System.out.print(obj + ", ");
    }
  }
}
```
### Các static methods thông dụng class Collections
- Collection có nhiều phương thức tĩnh tiện dụng như: **sort(Collection c)** sắp xếp danh sách, **max/min(Collection c)** lấy giá trị lớn nhất, **reverse(List list)** đảo ngược thứ tự.
```
// number
List<Integer> nums = new ArrayList<Integer>();
nums.add(3);
nums.add(36);
nums.add(73);
nums.add(40);
nums.add(1);
//sort
Collections.sort(nums);
System.out.println("Number sort:" + nums);
//find max/min
System.out.println("Max = " + Collections.max(nums));
System.out.println("Min = " + Collections.min(nums));
```