package Composite;

import java.util.*;

/**
 * Client sử dụng interface FileComponent để làm việc với các đối tượng FileLeaf và FolderComposite
 */
public class Client {

    public static void main(String[] args) {
        //initial 3 files
        FileComponent file1 = new FileLeaf("file 1", 10);
        FileComponent file2 = new FileLeaf("file 2", 5);
        FileComponent file3 = new FileLeaf("file 3", 12);

        //initial folder1 which includes 3 files above
        List<FileComponent> list1 = Arrays.asList(file1, file2, file3);
        FileComponent folder1 = new FolderComposite(list1);

        //initial folder2 which includes 3 files and folder1
        List<FileComponent> list2 = Arrays.asList(file1, file2, file3, folder1);
        FileComponent folder2 = new FolderComposite(list2);

        folder2.showProperty();
        System.out.println("Total Size: " + folder2.totalSize());
    }
}