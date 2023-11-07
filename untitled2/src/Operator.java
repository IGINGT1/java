import java.util.Comparator;

public class Operator implements Employee, Comparator<Operator> {
    int salary = 30_000;
    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public int compare(Operator o1, Operator o2) {
        return 0;
    }
}
