package qf04_liskovsubstitution;


/**
 * @author IsQf02
 * @date 2023/1/21-21:08
 */
public class test01 {
    public static void main(String[] args) {

        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));//这里本意是求出 11-3
        System.out.println("1-8=" + b.func1(1, 8));// 1-8
        System.out.println("11+3+9=" + b.func2(11, 3));
        System.out.println("-----------------------");
        /*
            此时代码中出现了问题，原因是类B中无意重写了父类的方式，造成错误。
            通用的做法是：原来的父类和子类都继承一个更通俗的基类，原有的继承关系去掉，
            采用依赖，聚合，组合等关系代替
         */
    }
}

// A 类
class A {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

// B 类继承了 A
// 增加了一个新功能：完成两个数相加,然后和 9 求和
class B extends A {
    //这里，重写了 A 类的方法, 可能是无意识
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}