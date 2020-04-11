package Observer;

/**
 * Interface cung cấp các phương thức để thêm, loại bỏ, thông báo observer.
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObserver();
}