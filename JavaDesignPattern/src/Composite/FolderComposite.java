package Composite;

import java.util.*;

/**
 * Đây là class implement FileComponent, nó lưu trữ một list kiểu FileComponent để chứa các FileLeaf và
 * FolderComposite khác (tính đa hình). FolderComposite cài đặt các phương thức được định nghĩa trong FileComponent
 * bằng cách ủy nhiệm (delegate) cho các thành phần con xử lý.
 */
public class FolderComposite implements FileComponent {

    private List<FileComponent> files;

    public FolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (FileComponent file : files) {
            file.showProperty();
        }
    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent file : files) {
            total += file.totalSize();
        }
        return total;
    }
}