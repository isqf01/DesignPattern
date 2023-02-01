package qf02;

/**
 * @author IsQf02
 * @date 2023-02-01 19:58
 */

//线程不安全
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){}

    //提供一个静态的方法，当调用时才去创建对象实例
    public static Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }

}
