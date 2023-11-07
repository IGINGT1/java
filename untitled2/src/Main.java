import java.util.*;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        Company.setIncome(10000000);
        hireEmployees(company);

    }

    private static void hireEmployees(Company company) {
        for (int i = 0; i < 180; i++) {
            Employee operator = new Operator();
            company.hire(operator);
        }
        for (int i = 0; i < 80; i++) {
            Employee manager = new Manager();
            company.hire(manager);
        }
        for (int i = 0; i < 10; i++) {
            Employee topManager = new TopManager();
            company.hire(topManager);
        }
    }


}






