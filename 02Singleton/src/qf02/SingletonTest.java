package qf02;

/**
 * @author IsQf02
 * @date 2023-02-01 20:05
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("懒汉式 1 ， 线程不安全~");
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton2 instance3 = Singleton2.getInstance();
        Singleton2 instance4 = Singleton2.getInstance();
        System.out.println(instance3 == instance4); // true
        System.out.println("instance.hashCode=" + instance3.hashCode());
        System.out.println("instance2.hashCode=" + instance4.hashCode());
    }
}
