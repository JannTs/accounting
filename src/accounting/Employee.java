package accounting;

abstract class Employee implements Comparable<Employee> {
    static final double MINIMUM_WAGE = 12.0;
    private static int nextId = 1;
    private int id;
    private final String fName;
    private final String lName;

    public Employee(int id, String fName, String lName) {
        this.id = nextId++;
        this.fName = fName;
        this.lName = lName;
    }

    public abstract double salaryCalc();

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee other) {
        // First sort by Name
        int fNameComparing = this.fName.compareTo(other.fName);
        if (fNameComparing != 0) {
            return fNameComparing;
        }

        // ....  then by ID
        return Integer.compare(this.id, other.id);
    }

}