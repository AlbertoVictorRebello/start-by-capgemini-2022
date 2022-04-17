import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex28 {
    public static void execute(Scanner scanner) {
        float baseSalary;
        int counter = 584;
        float totalAdjust = 0f;
        int action = 1;
        List<Employee> employees = new ArrayList<>();

        System.out.println("========================= Salary System =========================");
        System.out.println("Please, inform the base salary value:");
        baseSalary = scanner.nextFloat();
        System.out.println("Please, inform the personal information for each employee:");

        while (action == 1) {
            Employee newEmployee = new Employee();
            System.out.println("Name:");
            newEmployee.setName(scanner.next());

            System.out.println("Salary?:");
            newEmployee.setSalary(scanner.nextFloat());

            employees.add(newEmployee);
            float newSalary = calculateSalary(newEmployee.getSalary(), baseSalary);

            totalAdjust += newSalary - newEmployee.getSalary();
            System.out.printf("%s will earn a new salary: %.2f.\n",
                    newEmployee.getName(), newSalary);

            if (Person.totalPeople == 584) {
                System.out.println("There are already 584 registered employees. The report will be printed.");
                action = 2;
            } else {
                System.out.println("Please, choose an action:");
                System.out.println("1 - continue");
                System.out.println("2 - Print report");
                action = scanner.nextInt();
            }
        }

        System.out.println("========================= Salary Report =========================");
        System.out.println("Total employees registered: " + Person.totalPeople);
        System.out.printf("Total adjustments cost: %.2f \n", totalAdjust);


    }

    private static float calculateSalary(float salary, float baseSalary) {
        float adjustFactor = salary / baseSalary;

        if ( adjustFactor >= 20) {
            return salary * 1.1f;
        } else if ( adjustFactor >= 10) {
            return salary * 1.15f;
        } else if ( adjustFactor >= 3) {
            return salary * 1.2f;
        } else {
            return salary * 1.5f;
        }


    }

}

class Employee extends Person {
    private float salary = 0f;

    /*public Employee() {
        super();
    }*/

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

