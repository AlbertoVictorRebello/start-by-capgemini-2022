import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex21 {
    public static void execute(Scanner scanner) {
        int counter = 0;
        int action = 1;
        List<Person> people = new ArrayList<>();

        System.out.println("========================= Evaluation System =========================");
        System.out.println("Please, inform the personal information for each candidate:");


        while (action == 1) {
            Person newPerson = new Person();
            System.out.println("Name:");
            newPerson.setName(scanner.next());
            System.out.println("Gender (M) for Male and (F) for Female:");
            newPerson.setGender(scanner.next().toUpperCase());
            System.out.println("Age:");
            newPerson.setAge(scanner.nextInt());
            System.out.println("It is healthy?:");
            newPerson.setHealthCondition(scanner.nextBoolean());

            people.add(newPerson);
            System.out.printf("Registered. This person is %s able to join army.",
                    newPerson.isHealthCondition() ? "" : "not");
            System.out.println(newPerson);

            System.out.println("Please, choose an action:");
            System.out.println("1 - continue");
            System.out.println("2 - Print report");
            action = scanner.nextInt();
        }

        System.out.println("========================= Evaluation Report =========================");
        System.out.println("Total persons evaluated: " + Person.totalPeople);
        System.out.println("Total number of male persons: " + Person.malePersons);
        System.out.println("Total number of female persons: " + (Person.totalPeople - Person.malePersons));
        System.out.println("Total number of healthy persons: " + Person.healthyPersons);

    }

}

class Person {
    protected static int totalPeople = 0;
    protected static int malePersons;
    protected static int healthyPersons;
    private String name;
    private String gender;
    private int age;
    private boolean healthCondition;

    public Person() {
        totalPeople++;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public boolean isHealthCondition() {
        return healthCondition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
        if ("M".equals (this.gender)) malePersons++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealthCondition(boolean healthCondition) {
        this.healthCondition = healthCondition;
        if (healthCondition) healthyPersons++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", healthCondition=" + healthCondition +
                '}';
    }
}
