package accounting;
import java.util.ArrayList;
import java.util.List;

public class AccountingProgram {
    public static void main(String[] args) {
        Company company = new Company();

        WageEmployee wageEmployee = new WageEmployee(1, "John", "Doe", 10.0, 40);
        SalesManager salesManager = new SalesManager(2, "Alice", "Smith", 10000.0, 0.05);

        company.addEmployee(wageEmployee);
        company.addEmployee(salesManager);

        System.out.println("Employee List:");
        company.displayEmployeeList();

        System.out.println("Total Salary: " + company.calculateTotalSalary());
    }
}
