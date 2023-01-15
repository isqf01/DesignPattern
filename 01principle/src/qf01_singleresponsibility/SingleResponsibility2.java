package qf01_singleresponsibility;

/**
 * @author IsQf02
 * @date 2023/1/15-20:57
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {

        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("自行车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("帆船");
    }
}

/**
 * 方案二：
 *  1.遵守单一职责原则
 *  2.但改动太大，即：将类分解，同时要修改客户端
 *  3.改进：直接修改Vehicle类，改动的代码会比较小
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行。。。");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空上运行。。。");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水里上运行。。。");
    }
}