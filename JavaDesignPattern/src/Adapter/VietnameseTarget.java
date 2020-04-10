package Adapter;

/**
 * Đây là interface cho phép Client cung cấp message cho thông dịch viên (Translator/Adapter).
 */
public interface VietnameseTarget {

    void send(String words);

}