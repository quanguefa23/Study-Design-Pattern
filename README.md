# Design-Pattern
Singleton- Adapter - Composite - Prototype - Factory - Builder - Observer

#1. Singleton
Implement singleton theo 4 cách:
  - EAGER INITIALIZATION
  - LAZY INITIALIZATION
  - THREAD SAFE
  - DOUBLE CHECK LOCKING SINGLETON

#2. Adapter
Một người Việt muốn trao đổi với một người Nhật. Tuy nhiên, 2 người này không biết ngôn ngữ của nhau nên cần phải có một người để chuyển đổi từ ngôn ngữ tiếng Việt sang ngôn ngữ tiếng Nhật. Chúng ta sẽ mô hình hóa trường hợp này với Adapter Pattern như sau:
  Client: người Việt sẽ là Client trong ví dụ này,vì anh ta cần gửi một số message cho người Nhật.
  Target: đây là nội dung message được Client cung cấp cho thông dịch viên (Translator / Adapter).
  Adapter: thông dịch viên (Translator) sẽ là Adapter, nhận message tiếng Việt từ Client và chuyển đổi nó sang tiếng Nhật trước khi gởi cho người Nhật.
  Adaptee: đây là interface hoặc class được người Nhật sử dụng để nhận message được chuyển đổi từ thông dịch viên (Translator).
