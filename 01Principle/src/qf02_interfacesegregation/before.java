package qf02_interfacesegregation;

/**
 * @author IsQf02
 * @date 2023/1/18-20:48
 */
public class before {
    public static void main(String[] args) {
        //Test class A
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        //Test class C
        C c = new C();
        c.depend1(new D());
        c.depend2(new D());
        c.depend3(new D());
    }
}

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
    public void operation1() {
        System.out.println("类B实现接口中的方法1");
    }

    public void operation2() {
        System.out.println("类B实现接口中的方法2");
    }

    public void operation3() {
        System.out.println("类B实现接口中的方法3");
    }

    public void operation4() {
        System.out.println("类B实现接口中的方法4");
    }

    public void operation5() {
        System.out.println("类B实现接口中的方法5");
    }
}

class D implements Interface1 {
    public void operation1() {
        System.out.println("类D实现接口中的方法1");
    }

    public void operation2() {
        System.out.println("类D实现接口中的方法2");
    }

    public void operation3() {
        System.out.println("类D实现接口中的方法3");
    }

    public void operation4() {
        System.out.println("类D实现接口中的方法4");
    }

    public void operation5() {
        System.out.println("类D实现接口中的方法5");
    }
}

//A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }

}

//C 类通过接口 Interface1 依赖(使用) D 类，但是只会用到 1,4,5 方法
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation4();
    }

    public void depend3(Interface1 i) {
        i.operation5();
    }

}