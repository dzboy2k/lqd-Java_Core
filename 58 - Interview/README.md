## Câu hỏi thường gặp khi Interview về Java core
### I. Java Environment
#### 1. Java có phải là ngôn ngữ hoàn toàn là hướng đối tượng không ?
_Trả lời: không, vì nó vẫn support các kiểu dữ liệu nguyên thủy: int, short, long, double, float, Boolean._
#### 2. Java là ngôn ngữ biên dịch hay thông dịch ?
_Trả lời: Biên dịch._
#### 3. Máy ảo Java là gì ?
_Trả lời: Môi trường để thực thi chương trình Java._
#### 4. JDK, JVM, JRE là gì ?
_Trả lời: JDK = Tool(Compile/Debugger...) + JRE \
JRE = Libs + JVM_
#### 5. Giải thích về Garbage Collection trong Java 
_Trả lời: Đó là quá trình giải phóng bộ nhớ trong chương trình Java, nó sẽ xóa trong bộ nhớ những đối tượng đã được tạo ra trước đó và không được sử dụng để ưu tiên bộ nhớ cho việc tạo các đối tượng khác. Quá trình này được thực hiện bởi JVM._
### II. Java condition
#### 1. Vòng lặp do-while khác với các vòng lặp for, while ở điểm nào ?
_Trả lời: Thực hiện ít nhất 1 lần cho dù điều kiện có thể sai._
#### 2. Điều gì xảy ra nếu chúng ta không thêm câu lệnh break trong 1 case nào đó trong cấu trúc mệnh đề switch ?
_Trả lời: Nó không thoát ra khỏi lệnh switch ngay trong case đó và có thể thực thi case tiếp sau nó._
#### 3. Khi nào sử dụng vòng lặp for, while, do...while ?
_Trả lời: Sử dụng vòng lặp for khi biết trước số lần lặp, còn lại sử dụng while. Sử dụng do-while trong các trường hợp cần thực thi trước khi sử dụng điều kiện lặp (Ví dụ: Nhập số nguyên từ bàn phím, nếu nhập sai thì phải nhập lại...)_
### III. Java String
#### 1. Có mấy cách tạo đối tượng String ?
_Trả lời: Có 2 cách \
String str = new String("abc"); -> Đối tượng được tạo ra lưu trong Heap. \
String str1 = "abc"; // String literal -> Lưu trong String Pool._
#### 2. So sánh sự khác nhau cơ bản giữa lớp String với StringBuilder/StringBuffer ?
_Trả lời: Đối tượng String là không thay đổi được -> vì vậy khi các thao tác nối chuỗi nó sẽ tạo ra các đối tượng String mới trong bộ nhớ để lưu chuỗi mới -> Tốn bộ nhớ \
StringBuilder/StringBuffer: là thay đổi được, vì vậy khi các thao tác nối chuỗi thì sẽ không tạo thêm các đối tượng mới mà sửa ngay đối tượng chuỗi cũ._
#### 3. So sánh StringBuilder với StringBuffer ?
_Trả lời: StringBuffer là thread safe còn StringBuilder thì không -> vì vậy StringBuffer an toàn trong môi trường đa luồng còn StringBuilder thì thực thi nhanh hơn. \
Còn lại cơ bản là giống nhau._
#### 4. So sánh sự khác nhau giữa equals() and == ?
_Trả lời: equals -> dùng để so sánh nội dung. \
Còn == dùng để so sánh địa chỉ tham chiếu._
### IV. Java Array
#### 1. Mảng dùng trong trường hợp nào, hạn chế của nó là gì ?
_Trả lời: Để lưu các đối tượng cùng kiểu, mảng có hạn chế là khi tạo mảng thì không thay đổi kích thước của mảng được._
#### 2. Khi thực hiện khai báo và khởi tạo mảng xong thì Java lưu mảng trong vùng nhớ nào ?
_Trả lời: Heap._
#### 3. Khi nào thì exception sau xuất hiện ArrayIndexOutOfBoundsException ?
_Trả lời: Đó là khi chúng ta cố tình truy xuất một phần tử mảng có index không tồn tại trong mảng._
### V. Java OOP
#### 1. Nêu các đặc tính cơ bản của OOP trong Java ?
_Trả lời: Java có 4 đặc tính cơ bản đó là Kế thừa, Đa hình, Trừu tượng và Đóng gói._
#### 2. Nêu sự khác nhau chính giữa Interface và Abstract class ?
_Trả lời: Interface chỉ có các fields là public static final và tất cả method đều là method trừu tượng. \
Còn Abstract class có thể có abstract method hoặc Non-abstract method. Abstract class có thể có implementation code còn interface thì không. \
Abstract class dùng để cho kế thừa nhưng đó là đơn kế thừa. \
Interface sẽ giúp cho Java có thể thực hiện được đa kế thừa._
#### 3. So sánh khác nhau Constructor và method ?
_Trả lời: Constructor có tên giống với tên class và dùng để tạo ra đối tượng từ một class và không trả về kiểu dữ liệu. \
Còn method dùng để thực thi một hành động trên một đối tượng và có trả về kiểu dữ liệu._
#### 4. Nêu những phạm vi truy cập trong Java ?
_Trả lời: Public,private, protected và khi không khai báo thì nó là default._
#### 5. So sánh khác nhau Overloading và Overriding trong Java ?
_Trả lời: Overloading được thực hiện trong một class còn Overriding là quá trình ghi đè method khi có quan hệ kế thừa giữa lớp con và lớp cha. \
Overloading -> giúp thu được tính đa hình trong giai đoạn biên dịch. \
Overriding -> giúp thu được tính đa hình trong giai đoạn runtime. \
Cách tạo overloading: chỉ cần thay đổi số lượng tham số hoặc kiểu của tham số, không thực hiện thay đổi kiểu giá trị trả về của method. \
Trong khi đó Overriding thì method ở lớp con và cha phải giống nhau._
#### 6. Từ khóa final trong Java dùng để làm gì ?
_Trả lời: final có thể sử dụng ở mức biến (định nghĩa hằng số), method (khi đó không được ghi đè) và mức class (khi đó không được kế thừa)._
#### 7. Từ khóa static trong Java dùng để làm gì ?
_Trả lời: static trong Java để tạo các biến và method tĩnh và nó hoạt động ở mức class chứ không phải trên đối tượng, gọi thông qua class name. \
Và được dùng để chia sẻ chung cho các đối tượng._
#### 8. Từ khóa super trong Java dùng để làm gì ?
_Trả lời: super là biến tham chiếu đến đối tượng cha. \
Mỗi khi tạo một đối tượng con thì chương trình cũng ngầm định tạo một đối tượng cha nếu chúng có quan hệ kế thừa._
#### 9. Kiểu tham chiếu và kiểu tham trị là gì ?
_Trả lời: Truyền dữ liệu kiểu tham chiếu là truyền theo biến tham chiếu -> nếu trong method thay đổi object -> dẫn đến biến tham chiếu đến object đó bên ngoài cũng thay đổi. \
Truyền kiểu dữ liệu: Bên trong method có thay đổi thì bên ngoài cũng không bị ảnh hưởng, áp dụng cho các params kiểu dũ liệu nguyên thủy trong Java (int, long, short, float, double, byte, boolean)._
### VI. Java Collections
#### 1. So sánh sự khác nhau chính giữa Array và Collection ?
_Trả lời: Array lưu cố định các phần tử và cùng kiểu dữ liệu. \
Còn Collection có thể thay đổi được kích thước lưu số lượng phần tử và có thể lưu nhiều kiểu khác nhau về đối tượng._
#### 2. So sánh sự khác nhau giữa ArrayList và LinkedList ?
_Trả lời: ArrayList lưu dữ liệu động và truy xuất qua index. \
LinkedList lưu dữ liệu liên kết vòng (lưu thông tin phần tử trước và sau)._ \
_ArrayList có thể truy cập ngẫu nhiên nhưng LinkedList thì không (phải duyệt hết các phần tử)._ \
_ArrayList thường dùng với thao tác đọc dữ liệu tập hợp hơn là thêm mới hay xóa phần tử (vì lại phải sắp xếp lại -> chậm)._ \
_Còn LinkedList dùng trong các trường hợp thêm và xóa hay thêm mới dữ liệu tập (nhanh hơn ArrayList vì không phải sắp xếp lại, chỉ cập nhật địa chỉ tham chiếu phần tử trước và sau)._
#### 3. So sánh sự khác nhau chính giữa List và Set ?
_Trả lời: List có thể chứa các phần tử trung lặp, trong khi Set chỉ chứa các phần tử duy nhất._
#### 4. So sánh sự khác nhau chính giữa Set và Map ?
_Trả lời: Map lưu dữ liệu theo format key=>value và duy nhất theo key, nhưng có thể trùng lặp về giá trị._ \
_Trong khi đó Set chỉ lưu mỗi value và duy nhất._
#### 5. So sánh sự khác nhau chính giữa ArrayList và Array ?
_Trả lời: ArrayList -> lưu phần tử là động._ \
_Còn Array lưu số lượng phần tử cố định và không có cách nào thay đổi kích thước khi đối tượng mảng được tạo ra._
#### 6. So sánh sự khác nhau chính giữa ArrayList và Vector ?
_Trả lời: ArrayList => không synchronized -> vì vậy Non - thread-safe._ \
_Vector => synchronized -> vì vậy thread-safe._
### VII. Java Exception
#### 1. Exception là gì, nêu một vài class Exception bạn biết ?
_Trả lời: Là một trạng thái bất thường của chương trình, và nó được ném ra trong lúc runtime hoặc thời điểm biên dịch chương trình._ \
_Ví dụ: IOException -> liên quan đến đọc/ghi file._ \
_SQLException -> liên quan đến thao tác với database._ \
_NullPointerException -> thao tác trên một đối tượng null._ \
_ArrayIndexOutOfBoundsException -> truy xuất phần tử mảng với Index không tồn tại._ 
#### 2. Error là gì ?
_Trả lời: Là các lỗi gây ra làm chương trình sẽ ngừng hoạt động ngay và không khôi phục được._ \
Ví dụ: OutOfMemoryError, VirtualMachineError, StackOverflowError
#### 3. Exception Handling là gì ?
_Trả lời: Exception Handling (xử lý ngoại lệ) là một cơ chế xử lý các lỗi runtime như IOException, NullPointerException, SQLException, ..._ \
_Việc xử lý exception có thể giúp cho hiển thi thông báo lỗi đến người dùng và giúp cho chương trình có thể tiếp tục được chạy._ \
_Để xử lý ngoại lệ trong Java thường có sử dụng: try ... catch ... finally._ \
_Khối code trong finally luôn luôn được thực thi cho dù cho dù exception hay không -> thường được dùng để làm các việc như đóng kết nối với file, đóng kết nối connection, ..._
### VIII. Others
#### 1. Debugging là gì ?
_Trả lời: Debugging là quá trình tìm kiếm ra lỗi hay nguyên nhân gây ra lỗi, thường các IDE hỗ trợ chúng ta trong việc debug chương trình._ \
_Ví dụ: eclipse, netbean,..._ \
_Các bước thực hiện: Set break point -> run chương trình chế độ debug -> kiểm tra và thay đổi được giá trị của các biến trong quá trình chạy debug._ 
