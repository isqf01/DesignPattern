package qf01;

/**
 * @author IsQf02
 * @create 2023-01-29 21:48
 */
public class Singleton01 {
    //1.将构造器私有化,外部不能new
    private Singleton01(){

    }

    // 2.本类内部创建对象实例
    private final static Singleton01 instance = new Singleton01();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton01 getInstance(){
        return instance;
    }
}
