package Observer;

/**
 * Interface định nghĩa một phương thức update() cho các đối tượng sẽ được subject thông báo đến khi có sự
 * thay đổi trạng thái. Phương thức này chấp nhận đối số là SubjectState, cho phép các ConcreteObserver
 * sử dụng dữ liệu của nó.
 */
public interface Observer {
    void update(User user);
}


/**
 * Logger, Mailer và Protector là các ConcreteObserver. Sau khi nhận được thông báo rằng có thao tác với user
 * và gọi tới phương thức update(), các ConcreteObserver sẽ sử dụng dữ liệu SubjectState để xử lý.
 */