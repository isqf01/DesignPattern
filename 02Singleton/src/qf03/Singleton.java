package qf03;

import qf02.Singleton2;

/**
 * @author IsQf02
 * @date 2023-02-01 19:58
 */


public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    //提供一个静态的方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
