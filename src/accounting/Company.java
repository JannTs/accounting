/**
 * Написать программу для бухгалтерии.
 *     Программа должна уметь:
 *     -добавлять сотрудников в штат
 *     -удалять сотрудников из штата
 *     -рассчитывать зарплату для двух категорий сотрудников
 *             - сотрудник с почасовой оплатой
 *             - менеджер по продажам
 *      У программы должны быть следующие классы:
 *      - Company, в котором содержатся методы для добавления сотрудника, удаления сотрудника, вывода на экран списка
 *         всех сотрудников, и метод для суммирования зарплат всех сотрудников
 *      - классы сотрудников:
 *         -abstract Employee
 *         -WageEmployee
 *         -SalesManager
 * У сотрудников  должны быть такие поля: id, имя, фамилия, количество проработанных часов. Также должен быть
 *      метод подсчета зарплаты
 *      У сотрудника на почасовой оплате должно быть поле ставка за час. Метод расчета его зарплаты должен учитывать
 *      минимальный размер оплаты труда
 *      У менеджера по продажам нет фиксированной оплаты, его зарплата рассчитывается как процент от обьема продаж.
 *      Но его метод оплаты тоже должен учитывать минимальный размер оплаты труда
 *
 *
 */
package accounting;
import java.util.ArrayList;
import java.util.List;

class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void printEmplsList() {
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getfName() + " " + employee.getlName() +
                    ", Salary: " + employee.salaryCalc() + " " + employee.getClass().getSimpleName());
        }
    }

    public double calcTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salaryCalc();
        }
        return totalSalary;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}