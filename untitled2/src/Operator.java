import java.util.Comparator;

public class Operator implements Employee{
    int salary = 30_000;
    @Override
    public Integer getMonthSalary() {
        return salary;
    }

}
