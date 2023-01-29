package qf03_dependenceinversion;

/**
 * @author IsQf02
 * @date 2023/1/19-21:17
 */


public class Test01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

//练习：Person类接收消息


class Email {
    public String geInfo() {
        return "Hello,how are you ?";
    }
}

/*
    分析：
    1.简单，比较容易想到
    2.但如果获取的对象是 微信、短信等其他媒介的时候，Person类需要添加
        相应的接受方法
    3.解决：引入一个抽象的接口 IReceiver, 表示接收者, 这样 Person 类与
        接口 IReceiver 发生依赖。因为 Email, WeiXin 等等属于接收的范围，
        他们各自实现 IReceiver 接口就 ok, 这样我们就符合依赖倒转原则
 */
class Person {
    public void receive(Email email) {
        System.out.println(email.geInfo());
    }
}