import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class Company {

    public static int income;

    public static ArrayList<Employee> employee = new ArrayList<>();

    public static int getIncome() {
        return income;
    }

    public static void setIncome(int income) {
        Company.income = income;
    }

    public void hire(Employee emp){
        employee.add(emp);
    }
    public void hireAll(Collection<Employee> employes){
        employee.addAll(employes);
    }
    public void fire(Employee emp) {
        employee.remove(emp);
    }
    public void getSalary(){
        for (Employee salary : employee){
            System.out.println(salary.getMonthSalary());
        }
    }


}