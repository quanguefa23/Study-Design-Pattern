package Composite;

/**
 * Đây là class implement FileComponent, nó không chứa object con.
 */
public class FileLeaf implements FileComponent {

    private String name;
    private long size;

    public FileLeaf(String name, long size) {
        super();
        this.name = name;
        this.size = size;
    }

    @Override
    public long totalSize() {
        return size;
    }

    @Override
    public void showProperty() {
        System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
    }
}