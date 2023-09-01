package accounting;
import java.util.ArrayList;
import java.util.List;

public class WageEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public WageEmployee(int id, String fName, String lName, double hRate, int hWorked) {
        super(id, fName, lName);
        this.hourlyRate = hRate;
        this.hoursWorked = hWorked;
    }

    @Override
    public double salaryCalc() {
        double baseSalary = hourlyRate * hoursWorked;
        return Math.max(baseSalary, MINIMUM_WAGE);
    }
}
