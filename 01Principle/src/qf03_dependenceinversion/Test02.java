package qf03_dependenceinversion;

/**
 * @author IsQf02
 * @date 2023/1/19-21:28
 */
public class Test02 {
    public static void main(String[] args) {
        new Person1().receive(new Email1());
        new Person1().receive(new WeiXin());
    }
}

interface IReceive {
    String getInfo();
}

//定义Email类
class Email1 implements IReceive {

    public String getInfo() {
        return "Hello how are you ?";
    }
}

//新增一个微信类
class WeiXin implements IReceive {

    @Override
    public String getInfo() {
        return "Are you OK ?";
    }
}


class Person1 {
    public void receive(IReceive iReceive) {
        System.out.println(iReceive.getInfo());
    }
}



