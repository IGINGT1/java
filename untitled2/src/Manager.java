import java.util.Comparator;

public class Manager implements Employee{
    int salary = 40_000;
    int profitCompany = 115_000;

    @Override
    public Integer getMonthSalary() {
        return salary + (int) (profitCompany + profitCompany * Math.random());
    }
}
