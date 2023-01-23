package qf06_demeter.demeter01;

/**
 * @author IsQf02
 * @date 2023/1/23-12:18
 */
public class Demeter1 {
    public static void main(String[] args) {
//创建了一个 SchoolManager 对象
        SchoolManager schoolManager = new SchoolManager();
//输出学院的员工 id 和 学校总部的员工信息
        schoolManager.printAllEmployee(new CollegeManager());
    }
}
