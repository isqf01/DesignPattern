package qf01_singleresponsibility;

/**
 * @author IsQf02
 * @date 2023/1/15-20:47
 */
public class SingleResponsibility {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("摩托车");
        vehicle.run("飞机");
    }
}

/**
 *方式一：
 *     1.在方式1的run方法中，违反了单一职责原则
 *     2.解决：根据交通工具的运行方式不同，分解成不同的类。
 *
 */

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行。。。");
    }
}