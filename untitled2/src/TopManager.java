import java.util.Comparator;

public class TopManager implements Employee, Comparator<TopManager> {
    int salary = 100_000;

    @Override
    public int getMonthSalary() {
        if (Company.income >= 10000000){
            return (int)(salary*2.5);
        }else{
            return salary;
        }
    }

    @Override
    public int compare(TopManager o1, TopManager o2) {
        return 0;
    }
}
