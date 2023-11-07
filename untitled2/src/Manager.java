import java.util.Comparator;

public class Manager implements Employee, Comparator<Manager> {
    int salary = 40_000;
    int profitCompany = 115_000;

    @Override
    public int getMonthSalary() {
        return salary + (int) (profitCompany + profitCompany * Math.random());
    }

    @Override
    public int compare(Manager o1, Manager o2) {
        return 0;
    }
}
