package Observer;

/**
 * Mọi thao tác của người dùng đều được ghi log lại
 */
public class Logger implements Observer {

    @Override
    public void update(User user) {
        System.out.println("Logger: " + user);
    }
}