package Singleton;

/**
 * 1. EAGER INITIALIZATION
 * Class được khởi tạo ngay khi được gọi đến, đây là cách cài đặt đơn giản nhất nhưng điểm yếu là
 * instance có thể được khởi tạo nhưng không được dùng đến
 */
class EagerInitializedSingleton {

    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    // Private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }
}

/**
 * 2. LAZY INITIALIZATION
 * Đây là một cách làm mang tính mở rộng hơn so với cách làm trên và hoạt động tốt trong môi trường đơn luồng
 * (single-thread)
 */
class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}

/**
 * 3. THREAD SAFE
 * Trong môi trường bất đồng bộ, cách cài đặt đơn giản nhất là chúng ta gọi phương thức synchronized của hàm
 * getInstance() và như vậy hệ thống đảm bảo rằng tại cùng một thời điểm chỉ có thể có 1 luồng có thể truy cập
 * vào hàm getInstance() và đảm bảo rằng chỉ có duy nhất 1 thể hiện của class.
 */
class ThreadSafeSingleton {

    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

/**
 * 4. DOUBLE CHECK LOCKING SINGLETON
 * Để implement theo cách này, chúng ta sẽ kiểm tra sự tồn tại thể hiện của lớp, với sự hổ trợ của đồng bộ hóa,
 * hai lần trước khi khởi tạo. Phải khai báo volatile cho instance để tránh lớp làm việc không chính xác do
 * quá trình tối ưu hóa của trình biên dịch.
 */
class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        // Do something before get instance ...
        if (instance == null) {
            // Do the task too long before create instance ...
            // Block so other threads cannot come into while initialize
            synchronized (DoubleCheckLockingSingleton.class) {
                // Re-check again. Maybe another thread has initialized before
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        // Do something after get instance ...
        return instance;
    }
}

/**
 * Main Class, test 4 implementations above
 */
public class Singleton {
    public static void main(String[] argv) {
        EagerInitializedSingleton eagerInitializedSingleton1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton eagerInitializedSingleton2 = EagerInitializedSingleton.getInstance();
        if (eagerInitializedSingleton1 == eagerInitializedSingleton2) {
            System.out.println("Same instance");
        }

        LazyInitializedSingleton lazyInitializedSingleton1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazyInitializedSingleton2 = LazyInitializedSingleton.getInstance();
        if (lazyInitializedSingleton1 == lazyInitializedSingleton2) {
            System.out.println("Same instance");
        }

        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        if (threadSafeSingleton1 == threadSafeSingleton2) {
            System.out.println("Same instance");
        }

        DoubleCheckLockingSingleton doubleCheckLockingSingleton1 = DoubleCheckLockingSingleton.getInstance();
        DoubleCheckLockingSingleton doubleCheckLockingSingleton2 = DoubleCheckLockingSingleton.getInstance();
        if (doubleCheckLockingSingleton1 == doubleCheckLockingSingleton2) {
            System.out.println("Same instance");
        }
    }

}