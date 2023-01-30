package qf01;

/**
 * @author IsQf02
 * @create 2023-01-29 21:48
 */
public class Singleton02 {
    //1.将构造器私有化,外部不能new
    private Singleton02(){

    }

    // 2.在本类内部创建对象实例
    private static Singleton02 instance;

    static {    //将创建对象放在静态代码块中
        instance = new Singleton02();
    }

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton02 getInstance(){
        return instance;
    }

}
