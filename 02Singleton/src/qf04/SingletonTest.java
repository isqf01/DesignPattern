package qf04;

/**
 * @author IsQf02
 * @date 2023-02-01 21:15
 */
public class SingletonTest {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());


    }
}
