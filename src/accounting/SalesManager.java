package accounting;

class SalesManager extends Employee {
    private double salesAmount;
    private double interestRateOnSales;

    public SalesManager(int id, String fName, String lName, double salesAmount, double interestRateOnSales) {
        super(id, fName, lName);
        this.salesAmount = salesAmount;
        this.interestRateOnSales = interestRateOnSales;
    }


    @Override
    public double salaryCalc() {
        double baseSalary = salesAmount * interestRateOnSales;
        return Math.max(baseSalary, MINIMUM_WAGE);
    }
}
