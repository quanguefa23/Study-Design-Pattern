# Design-Pattern
Những Design Pattern xuất hiện trong repository này: Singleton, Adapter, Composite, Factory, Prototype, Builder, Observer  
Lưu ý: **Sample Problem** là đề bài cho code mẫu được đặt bên trong thư mục JavaDesignPattern  
## 1. Singleton
Implement singleton theo 4 cách:
  - EAGER INITIALIZATION
  - LAZY INITIALIZATION
  - THREAD SAFE
  - DOUBLE CHECK LOCKING SINGLETON

## 2. Adapter
**Sample Problem**:  

Một người Việt muốn trao đổi với một người Nhật. Tuy nhiên, 2 người này không biết ngôn ngữ của nhau nên cần phải có một người để chuyển đổi từ ngôn ngữ tiếng Việt sang ngôn ngữ tiếng Nhật. Chúng ta sẽ mô hình hóa trường hợp này với Adapter Pattern như sau:
  - Client: người Việt sẽ là Client trong ví dụ này, vì anh ta cần gửi một số message cho người Nhật.
  - Target: đây là nội dung message được Client cung cấp cho thông dịch viên (Translator/Adapter).
  - Adapter: thông dịch viên (Translator) sẽ là Adapter, nhận message tiếng Việt từ Client và chuyển đổi nó sang tiếng Nhật trước khi gởi cho người Nhật.
  - Adaptee: đây là interface hoặc class được người Nhật sử dụng để nhận message được chuyển đổi từ thông dịch viên (Translator).  

![design-patterns-adapter-diagram-translator-example](https://user-images.githubusercontent.com/60953757/78984804-5bbe7f80-7b51-11ea-9ff5-54b286d0e118.png)

## 3. Composite
Một Composite Pattern bao gồm các thành phần cơ bản sau:
  - Component : là một interface hoặc abstract class quy định các method chung cần phải có cho tất cả các thành phần tham gia vào mẫu này.
  - Leaf : là class implement Component, nó không chứa object con.
  - Composite : là class implement Component, nó lưu trữ một list type Component để chứa các Leaf và Composite khác (tính đa hình). Composite cài đặt các phương thức được định nghĩa trong Component bằng cách ủy nhiệm (delegate) cho các thành phần con xử lý.
  - Client: sử dụng Component để làm việc với các đối tượng trong Composite.  

**Sample Problem**:  

Cài đặt Composite Pattern về chương trình quản lý một hệ thống tập tin.  

![design-patterns-composite-example](https://user-images.githubusercontent.com/60953757/79002796-6db51800-7b7b-11ea-9747-8b4e287fe270.png)

## 4&5. Factory & Prototype
Một Factory Pattern bao gồm các thành phần cơ bản sau:
  - Super Class: môt supper class trong Factory Pattern có thể là một interface, abstract class hay một class thông thường.
  - Sub Classes: các sub class sẽ implement các phương thức của supper class theo nghiệp vụ riêng của nó.
  - Factory Class: một class chịu tránh nhiệm khởi tạo các đối tượng sub class dựa theo tham số đầu vào. Lưu ý: lớp này là Singleton hoặc cung cấp một public static method cho việc truy xuất và khởi tạo đối tượng. Factory class sử dụng if-else hoặc switch-case để xác định class con đầu ra.  

Một Prototype Pattern gồm các thành phần cơ bản sau:
  - Prototype : interface hoặc abtract class, khai báo phương thức clone để clone chính nó.
  - ConcretePrototype class : các lớp này thực thi interface (hoặc kế thừa từ lớp abstract) được cung cấp bởi Prototype để copy (nhân bản) chính bản thân nó. Các lớp này chính là thể hiện cụ thể phương thức clone(). Lớp này có thể không cần thiết nếu: Prototype là một class và nó đã implement việc clone chính nó.
  - Client class : tạo mới object bằng cách gọi Prototype thực hiện clone chính nó.  

![design-patterns-prototype-diagram](https://user-images.githubusercontent.com/60953757/79008922-968fda00-7b88-11ea-9fdc-445762c3a21a.png)  

**Sample Problem**:  

MiningPool là một factory để tạo ra các đồng CryptoCurrency, bao gồm: BTC, ETH, XRP. Các đồng CryptoCurrency này có thể được tạo ra bằng cách clone từ một prototype sẵn có và sau đó sửa lại một số thông tin khác. Clients có thể sử dụng MiningPool để tạo ra CryptoCurrency và đặt chúng vào wallet của họ.


