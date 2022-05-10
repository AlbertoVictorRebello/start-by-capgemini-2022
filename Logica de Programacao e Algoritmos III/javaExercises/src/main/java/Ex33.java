import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex33 {
    public static void execute(Scanner scanner) {
        int action = 1;
        List<Teacher> teachers = new ArrayList<>();

        System.out.println("========================= Aprender Scholl System =========================");
        System.out.println("Please, inform the personal information for each teacher:");

        while (action == 1) {
            Teacher newTeacher = new Teacher();
            System.out.println("Name:");
            newTeacher.setName(scanner.next());

            System.out.println("Level number (1, 2 or 3):");
            newTeacher.setLevel(scanner.nextInt());

            System.out.println("Number of worked hours:");
            newTeacher.setTotalWorkedHours(scanner.nextInt());
            System.out.printf("%s will earn a total salary of USS %.2f.\n",
                    newTeacher.getName(),
                    calculateSalary(newTeacher));

            System.out.println("Please, choose an action:");
            System.out.println("1 - continue");
            System.out.println("2 - Print report");
            action = scanner.nextInt();

        }

        System.out.println("========================= Salary Report =========================");
        System.out.println("Total employees registered: " + Person.totalPeople);
    }

    private static float calculateSalary(Teacher teacher) {
        if (teacher.getLevel() == 1) {
            return teacher.getTotalWorkedHours() * 12f;
        } else if ( teacher.getLevel() == 2) {
            return teacher.getTotalWorkedHours() * 17f;
        } else {
            return teacher.getTotalWorkedHours() * 25f;
        }
    }

}

class Teacher extends Person {
    private int totalWorkedHours = 0;
    private int level;

    public int getTotalWorkedHours() {
        return totalWorkedHours;
    }

    public void setTotalWorkedHours(int totalWorkedHours) {
        this.totalWorkedHours = totalWorkedHours;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "totalWorkedHours=" + totalWorkedHours +
                ", level=" + level +
                '}';
    }
}

