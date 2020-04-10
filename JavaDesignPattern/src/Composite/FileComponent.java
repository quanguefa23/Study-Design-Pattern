package Composite;

/**
 * Đây là interface quy định các method chung cần phải có cho tất cả các thành phần tham gia vào mẫu này.
 */
public interface FileComponent {
    void showProperty();
    long totalSize();
}