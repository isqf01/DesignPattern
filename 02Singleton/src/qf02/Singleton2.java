package qf02;

/**
 * @author IsQf02
 * @date 2023-02-01 19:58
 */

//线程不安全
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    //提供一个静态的方法，为保证线程安全问题加入同步处理代码块
    public static synchronized Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }

}
