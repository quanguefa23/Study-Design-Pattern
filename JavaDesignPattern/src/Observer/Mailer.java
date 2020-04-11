package Observer;

/**
 * Thực hiện gửi mail thông báo khi tài khoản hết hạn
 */
public class Mailer implements Observer {

    @Override
    public void update(User user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getEmail() + " is expired. An email was sent!");
        }
    }
}