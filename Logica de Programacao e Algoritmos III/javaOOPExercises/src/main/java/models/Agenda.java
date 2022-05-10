package models;

import java.util.Arrays;

public class Agenda {
    private int size = 10;
    Person[] people = new Person[size];

    public Agenda() {
        Arrays.fill(people, null);
    }

    public void register(String name, int age, float height, boolean... silent) {
        for (int i = 0; i < size; i++) {
            if (people[i] == null) {
                Person newPerson= new Person();
                newPerson.setName(name);
                newPerson.setAge(age);
                newPerson.setHeight(height);
                people[i] = newPerson;
                break;
            } else {
                if(!silent[0]) {
                    System.out.println("No empty entry.");
                }
            }

        }
    }

    public void remove(String name) {
        int i = findByName(name);
            if (i >= 0) {
                people[i] = null;
            } else {
                System.out.println("This name is not registered.");
            }
    }

    public int findByName(String name) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (people[i] != null && name.equals(people[i].name)) {
                return i;
            }
        }
        return -1;

    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            printById(i, true);
        }
    }

    public void printById(int id, boolean silent) {
            if (people[id] != null) {
                System.out.println("Name: " + people[id].name +
                        " Age: " + people[id].age +
                        " Height: " + people[id].height);
            } else {
                if (! silent) {
                    System.out.println("This register is empty.");
                }
            }
    }

    public void printByName(String name, boolean silent) {
        int id = findByName(name);
        if (id >= 0) {
            System.out.println("Name: " + people[id].name +
                    " Age: " + people[id].age +
                    " Height: " + people[id].height);
        } else {
            if (!silent) {
                System.out.println("This register is empty.");
            }
        }
    }

}
