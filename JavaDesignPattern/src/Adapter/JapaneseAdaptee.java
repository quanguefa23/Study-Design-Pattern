package Adapter;

/**
 * Đây là class được người Nhật sử dụng để nhận message được chuyển đổi từ thông dịch viên (Translator) và thực hiện
 * các tác vụ với message nhận được.
 */
public class JapaneseAdaptee {

    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...");
        System.out.println(words);
    }
}