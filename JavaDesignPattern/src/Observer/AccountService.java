package Observer;

import java.util.ArrayList;
import java.util.List;

enum LoginStatus {
    SUCCESS, FAILURE, INVALID, EXPIRED
}

/**
 * Đóng vai trò là data của account
 */
class User {
    private String email;
    private String ip;
    private LoginStatus status;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User[email=" + email + ", ip=" + ip + ", status=" + status + "]";
    }
}

/**
 * Class đóng vai trò là ConcreteSubject, sẽ thông báo tới tất cả các observers bất cứ khi nào có thao tác
 * của người dùng liên quan đến đăng nhập, tài khoản hết hạn.
 */
public class AccountService implements Subject {

    private User user;
    private List<Observer> observers = new ArrayList<>();

    public AccountService(String email, String ip) {
        user = new User();
        user.setEmail(email);
        user.setIp(ip);
    }

    @Override
    public void attach(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(user);
        }
    }

    public void changeStatus(LoginStatus status) {
        user.setStatus(status);
        System.out.println("Status is changed");
        this.notifyAllObserver();
    }

    public void login() {

        if (!this.isValidIP()) {
            user.setStatus(LoginStatus.INVALID);
        } else if (this.isValidEmail()) {
            user.setStatus(LoginStatus.SUCCESS);
        } else {
            user.setStatus(LoginStatus.FAILURE);
        }

        System.out.println("Login is handled");
        this.notifyAllObserver();
    }

    private boolean isValidIP() {
        return "127.0.0.1".equals(user.getIp());
    }

    private boolean isValidEmail() {
        return "contact@gpcoder.com".equalsIgnoreCase(user.getEmail());
    }
}