package qf01_singleresponsibility;

/**
 * @author IsQf02
 * @date 2023/1/15-21:07
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("单车");

        vehicle3.runAir("飞机");

        vehicle3.runWater("轮船");
    }
}
/**
 * 方式三：
 *      1.这种修改没有对类做太大改动，只是增加方法
 *      2.在方法级别上遵守了单一职责原则
 */
class Vehicle3{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行。。。");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+"在天空上运行。。。");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"在水里上运行。。。");
    }
}
