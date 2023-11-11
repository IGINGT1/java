import java.util.Comparator;

public class TopManager implements Employee {
    int salary = 100_000;

    @Override
    public Integer getMonthSalary() {
        if (Company.income >= 10000000){
            return (int)(salary*2.5);
        }else{
            return salary;
        }
    }
}
