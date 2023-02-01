package qf04;

import sun.security.jca.GetInstance;

/**
 * @author IsQf02
 * @date 2023-02-01 21:07
 */
//使用静态内部类实现
public class Singleton {
    private static volatile Singleton instance;

    //构造器私有化
    private Singleton(){

    }
    //写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE;
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
