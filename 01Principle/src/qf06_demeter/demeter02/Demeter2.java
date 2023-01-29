package qf06_demeter.demeter02;

/**
 * @author IsQf02
 * @date 2023/1/23-12:18
 */
public class Demeter2 {
    public static void main(String[] args) {
        System.out.println("~~~使用迪米特法则改进~~~");
//创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
//输出学院的员工 id 和 学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
