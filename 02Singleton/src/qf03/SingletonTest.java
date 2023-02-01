package qf03;

import qf02.Singleton1;
import qf02.Singleton2;

/**
 * @author IsQf02
 * @date 2023-02-01 20:05
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
