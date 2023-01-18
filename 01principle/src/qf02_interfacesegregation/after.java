package qf02_interfacesegregation;

/**
 * @author IsQf02
 * @date 2023/1/18-21:23
 */
public class after {
    public static void main(String[] args) {
        //Test class A
        A2 a = new A2();
        a.depend1(new B2());
        a.depend2(new B2());
        a.depend3(new B2());

        //Test class C
        C2 c = new C2();
        c.depend1(new D2());
        c.depend2(new D2());
        c.depend3(new D2());
    }
}

interface Interface11 {
    void operation11();


}

interface Interface2 {
    void operation22();

    void operation33();
}

interface Interface3 {
    void operation44();

    void operation55();
}

class B2 implements Interface11, Interface2 {
    public void operation11() {
        System.out.println("类B2实现接口中的方法1");
    }

    public void operation22() {
        System.out.println("类B2实现接口中的方法2");
    }

    public void operation33() {
        System.out.println("类B2实现接口中的方法3");
    }

}

class D2 implements Interface11, Interface3 {
    public void operation11() {
        System.out.println("类D2实现接口中的方法1");
    }


    public void operation44() {
        System.out.println("类D2实现接口中的方法44");
    }

    public void operation55() {
        System.out.println("类D2实现接口中的方法55");
    }
}

//A 类通过接口 Interface1 依赖(使用) B 类，但是只会用到 1,2,3 方法
class A2 {
    public void depend1(Interface11 i) {
        i.operation11();
    }

    public void depend2(Interface2 i) {
        i.operation22();
    }

    public void depend3(Interface2 i) {
        i.operation33();
    }

}

//C 类通过接口 Interface1 依赖(使用) D 类，但是只会用到 1,4,5 方法
class C2 {
    public void depend1(Interface11 i) {
        i.operation11();
    }

    public void depend2(Interface3 i) {
        i.operation44();
    }

    public void depend3(Interface3 i) {
        i.operation55();
    }

}