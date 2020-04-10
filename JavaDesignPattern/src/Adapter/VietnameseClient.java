package Adapter;

/**
 * Người Việt sẽ là Client trong ví dụ này, vì anh ta cần gửi một số message cho người Nhật.
 */
public class VietnameseClient {

    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}