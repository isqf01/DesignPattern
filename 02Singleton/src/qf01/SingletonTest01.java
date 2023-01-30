package qf01;

/**
 * @author IsQf02
 * @create 2023-01-29 21:48
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        //测试
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);

//       System.out.println("instance1.hashCode() = "+ instance1.hashCode());
//        System.out.println("instance2.hashCode() = "+ instance2.hashCode());

        //测试
        Singleton02 instance3 = Singleton02.getInstance();
        Singleton02 instance4=  Singleton02.getInstance();
        System.out.println(instance1 == instance2);

//        System.out.println("instance3.hashCode() = "+ instance3.hashCode());
//        System.out.println("instance4.hashCode() = "+ instance4.hashCode());
    }
}
