package accounting;

import java.util.Collections;

public class AccountingApp {
    public static void main(String[] args) {
        Company company = new Company();

        WageEmployee wageEmployee = new WageEmployee(1, "Jake", "Salivan", 12.0, 40);
        SalesManager salesManager = new SalesManager(2, "Angela", "Merkel", 10000.0, 0.05);
        SalesManager salesManager1 = new SalesManager(3, "Angela", "Newmann", 15000.0, 0.04);
        WageEmployee wageEmployee2 = new WageEmployee(4, "Elton", "John",13.23,50 );
        company.addEmployee(wageEmployee);
        company.addEmployee(salesManager);
        company.addEmployee(salesManager1);
        company.addEmployee(wageEmployee2);

        System.out.println("Employee List:");
        company.printEmplsList();

        System.out.println("Total Salary: " + company.calcTotalSalary());

        // Sorted by Last Name and then by ID

        System.out.println("Employee List (Unsorted):");
        company.printEmplsList();

        Collections.sort(company.getEmployees());

        System.out.println("Employee List (Sorted by Name and then by ID):");
        company.printEmplsList();

    }
}
