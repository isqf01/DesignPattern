package qf05;

/**
 * @author IsQf02
 * @date 2023-02-01 21:26
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

        singleton.sayHello();
    }
}
