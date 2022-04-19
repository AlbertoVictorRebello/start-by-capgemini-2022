import CustomExceptions.OperationDeniedException;
import models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        testEx01();
//        testEx02();
//        testEx03();
//        testEx04();
//        testEx05();
//        testEx06();
//        testEx07();
//        testEx08();
//        testEx09();
//        testEx10();
//        testEx11();
//        testEx12();
//        testEx13();
//        testEx14();
//        testEx15();
//        testEx16();
        testEx17();

    }

    static void testEx01() {
        Person person = new Person();
        person.setName("Alberto");
        person.setBirthDate("26/09/1972");
        person.setHeight(1.74f);
        System.out.println(person);
    }

    static void testEx02() {
        Client client = new Client();
        client.setName("Alberto");
        client.setBirthDate("26/09/1972");
        client.setHeight(1.74f);

        Account currentAccount = new CurrentAccount(client);
        Account savingsAccount = new SavingsAccount(client);

        try {

            currentAccount.printBankStatement();

            currentAccount.deposit(1000);
            currentAccount.printBankStatement();


            currentAccount.withDraw(500);
            currentAccount.printBankStatement();

            currentAccount.transfer(500, savingsAccount);
            currentAccount.printBankStatement();

            savingsAccount.printBankStatement();

            savingsAccount.deposit(-500);

        } catch (OperationDeniedException e) {
            System.out.println(e.getMessage());

        }

    }

    static void testEx03() {
        FuelPump pump = new FuelPump();
        pump.setFuelType("gasoline");
        pump.setPrice(10.15f);
        pump.setStok(100f);

        System.out.println(pump);


        pump.supplyByLiters(10);
        System.out.println("Stok: " + pump.getStok());
        pump.supplyByValue(20);

        pump.supplyByLiters(0.5f);
        pump.supplyByValue(0.5f);

        pump.supplyByLiters(100);
        pump.setStok(100);
        pump.supplyByLiters(100);





    }

    static void testEx04() {
        Elevator elevator = new Elevator();
        elevator.initialize(10, 20);
        System.out.println(elevator);

        elevator.getUp(22);
        elevator.getDown(22);

        elevator.getUp(20);
        elevator.getUp(2);
        elevator.getDown(22);

        elevator.getIn(11);
        elevator.getOut(10);
        elevator.getIn(9);
        System.out.println(elevator);
        elevator.getOut(1);
        System.out.println(elevator);



    }

    static void testEx05() {

        Student student = new Student();
        student.setName("Alberto");
        student.setCourseName("Java");
        System.out.println(student);
        student.setEvaluations(new float[] {7.0f, 7.0f, 5.0f});
        System.out.printf(String.format("%.2f\n", student.getAverageScore()));
        System.out.printf(String.format("%.2f\n",student.calculatePassingScoreGap()));

        Student victor = new Student();
        victor.setName("Victor");
        victor.setCourseName("Java");
        System.out.println(victor);
        victor.setEvaluations(new float[] {8.9f, 9.0f, 6.0f});
        System.out.printf(String.format("%.2f\n", victor.getAverageScore()));
        System.out.printf(String.format("%.2f\n",victor.calculatePassingScoreGap()));


    }

    static void testEx06() {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber(1);
        invoice.setCustomerName("Alberto");
        Item product1 = new Item(
                invoice.getItems().size() + 1,
                "product 1",
                1,
                1.0F
        );

        Item product2 = new Item(
                invoice.getItems().size() + 1,
                "product 2",
                30,
                0.50F
        );
        invoice.setItem(product1);
        invoice.setItem(product2);
        System.out.println("Invoice number: " + invoice.getInvoiceNumber());
        System.out.println("Customer name: " + invoice.getCustomerName());
        System.out.println("Total: US$ " + invoice.getInvoiceAmount());



    }

    static void testEx07() {
        Employee alberto = new Employee("Alberto", "Rebello",10000f);
        alberto.setBirthDate("26/09/1972");

        Employee victor = new Employee("victor", "Rebello",20000f);
        victor.setBirthDate("26/09/1972");

        System.out.println("=======================Salary System=============================");
        System.out.println(alberto);
        System.out.println("Annual salary before adjust US$:" + (alberto.getSalary() * 12));
        alberto.setSalary(alberto.getSalary() * 1.1f);
        System.out.println("Annual salary after adjust: US$" + (alberto.getSalary() * 12));

        System.out.println(victor);
        System.out.println("Annual salary before adjust: US$" + (victor.getSalary() * 12));
        victor.setSalary(victor.getSalary() * 1.1f);
        System.out.println("Annual salary after adjust: US$" + (alberto.getSalary() * 12));

    }

    static void testEx08() {
        MyDate date1 = new MyDate("01/01/2000");
        MyDate date2 = new MyDate("01/01/2022");

        System.out.println(date1.compareMe(date2));
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getMonthName());
        System.out.println(date1.getYear());
        System.out.println(date1.isLeapYear());

        try {
            System.out.println("I: " + date2.getMyDate() + " at " + date2);
            MyDate myClone = (MyDate) date2.getClone();
            System.out.println("And my clone: " + myClone.getMyDate() + " at "+ myClone);
            System.out.println("Let me check if I am my clone: " + (date2 == myClone));
        }catch (CloneNotSupportedException e) {
            System.out.println("Ops!");
        }
    }

    static void testEx09() {
        MyDate flyDate = new MyDate("01/01/2022");
        Fly fly = new Fly(1, flyDate);
        System.out.println("Fly number: " + fly.getFlyNumber());
        System.out.println("Fly date: " + fly.getFlyDate().getMyDate());
        System.out.println("Fly available chairs: " + fly.getAvailableChairsQuantity());
        System.out.println("Next available chair number: " + fly.getNextAvailable());
        fly.setAvailable(0);
        fly.setAvailable(10);
        fly.setAvailable(20);
        fly.setAvailable(30);
        fly.setAvailable(40);
        fly.setAvailable(50);
        fly.setAvailable(60);
        fly.setAvailable(70);
        fly.setAvailable(80);
        fly.setAvailable(90);
        fly.setAvailable(99);
        System.out.println("Fly available chairs: " + fly.getAvailableChairsQuantity());
        System.out.println("Next available chair number: " + fly.getNextAvailable());

    }

    static void testEx10() {
        SoccerPlayer soccerPlayer1 = new SoccerPlayer();
        SoccerPlayer soccerPlayer2 = new SoccerPlayer();
        SoccerPlayer soccerPlayer3 = new SoccerPlayer();
        soccerPlayer1.setName("Player1");
        soccerPlayer1.setBirthDate("22/06/1989");
        soccerPlayer1.setNationality("Brazilian");
        soccerPlayer1.setHeight(1.74f);
        soccerPlayer1.setWeight(71.4f);
        soccerPlayer1.setPosition("Defense");

        soccerPlayer2.setName("Player2");
        soccerPlayer2.setBirthDate("22/06/1989");
        soccerPlayer2.setNationality("German");
        soccerPlayer2.setHeight(1.80f);
        soccerPlayer2.setWeight(85f);
        soccerPlayer2.setPosition("Center-Attack");

        soccerPlayer3.setName("Player3");
        soccerPlayer3.setBirthDate("22/06/1989");
        soccerPlayer3.setNationality("Marroquin");
        soccerPlayer3.setHeight(1.87f);
        soccerPlayer3.setWeight(83.0f);
        soccerPlayer3.setPosition("Attack");

        System.out.println(soccerPlayer1);
        System.out.println(soccerPlayer2);
        System.out.println(soccerPlayer3);
        System.out.println("Time to be retired in years: " + soccerPlayer1.yearsToRetirement());
        System.out.println("Time to be retired in years: " + soccerPlayer2.yearsToRetirement());
        System.out.println("Time to be retired in years: " + soccerPlayer3.yearsToRetirement());
    }

    static void testEx11() {
        Ticket regularTicket = new Ticket(10f);
        VipTicket vipTicket = new VipTicket(regularTicket.getValue());

        System.out.println(regularTicket.printValue());
        System.out.println(vipTicket.printValue());

    }

    static void testEx12() {
        Agenda agenda = new Agenda();
        System.out.println("Could you print all agenda's information, please?");
        agenda.register("Alberto", 49, 1.74f, true);
        agenda.register("Victor", 39, 1.54f, true);
        agenda.register("Josh", 29, 1.94f, true);
        agenda.register("Maria", 69, 1.54f, true);
        agenda.register("Carlos", 49, 1.64f, true);
        agenda.printAll();

        System.out.println("The index of Josh is " + agenda.findByName("Josh"));
        System.out.println("Removing Josh.");
        agenda.remove("Josh");
        System.out.println("The index of Josh is " + agenda.findByName("Josh"));

        System.out.println("The index of Mariah is " + agenda.findByName("Mariah"));
        System.out.println("Ops. There is a typo. The correct is Maria. Let's try again.");
        System.out.println("The index of Maria is " + agenda.findByName("Maria"));
        System.out.println("Could you print Carlos' information, please?");
        agenda.printByName("Carlos", true);
    }

    static void testEx13() {
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double a = 2;
        double b = 2;
        double c = 2;
        double d = 0;
        System.out.printf("Sum of a = %.2f, b = %.2f, c = %.2f and d = %.2f\n", a, b, c, d);
        System.out.println(calculator.sumOperation(a, b, c, d));

        a = 20;
        b = 10;
        c = 5;
        d = 5;

        System.out.printf("Subtraction of a = %.2f, b = %.2f, c = %.2f and d = %.2f\n", a, b, c, d);
        System.out.println(calculator.subtractionOperation(a, b, c, d));

        a = 2;
        b = 2;
        c = 2;
        d = 0.5;
        System.out.printf("Multiplication of a = %.2f, b = %.2f, c = %.2f and d = %.2f\n", a, b, c, d);
        System.out.println(calculator.multiplicationOperation(a, b, c, d));

        try {
            a = 8;
            b = .5;
            c = 2;
            d = 1;
            System.out.printf("Division of a = %.2f, b = %.2f, c = %.2f and d = %.2f\n", a, b, c, d);
            System.out.println(calculator.divisionOperation(a, b, c));

            a = 8;
            b = .5;
            c = 2;
            d = 0;
            System.out.printf("Division of a = %.2f, b = %.2f, c = %.2f and d = %.2f\n", a, b, c, d);
            System.out.println(calculator.divisionOperation(a, b, c, d));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            a = 2;
            b = 2;
            c = 2;
            d = 2;
            System.out.printf("Pow of a = %.2f ^ b = %.2f ^ c = %.2f ^ d = %.2f\n", a, b, c, d);
            System.out.println(scientificCalculator.powOperation(a, b, c, d));

            a = 4;
            System.out.printf("Squared root of a = %.2f\n", a);
            System.out.println(scientificCalculator.squareRootOperation(a));

            a = -3;
            System.out.printf("Squared root of a = %.2f\n", a);
            System.out.println(scientificCalculator.squareRootOperation(a));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testEx14() {
        Invoice invoice = new Invoice();
        invoice.setInvoiceNumber(1);
        invoice.setCustomerName("Alberto");
        Item product1 = new Item(
                invoice.getItems().size() + 1,
                "product 1",
                1,
                1.0F
        );

        Item product2 = new Item(
                invoice.getItems().size() + 1,
                "product 2",
                30,
                0.50F
        );
        invoice.setItem(product1);
        invoice.setItem(product2);
        System.out.println("Invoice number: " + invoice.getInvoiceNumber());
        System.out.println("Customer name: " + invoice.getCustomerName());
        System.out.println("Total: US$ " + invoice.getInvoiceAmount());



    }

    static void testEx15() {

        Employee alberto = new Employee("Alberto", "Rebello",10000f);
        alberto.setBirthDate("26/09/1972");

        Employee victor = new Employee("victor", "Rebello",20000f);
        victor.setBirthDate("26/09/1972");

        System.out.println("=======================Salary System=============================");
        System.out.println(alberto);
        System.out.println("Annual salary before adjust US$:" + (alberto.getSalary() * 12));
        alberto.setSalary(alberto.getSalary() * 1.1f);
        System.out.println("Annual salary after adjust: US$" + (alberto.getSalary() * 12));

        System.out.println(victor);
        System.out.println("Annual salary before adjust: US$" + (victor.getSalary() * 12));
        victor.setSalary(victor.getSalary() * 1.1f);
        System.out.println("Annual salary after adjust: US$" + (alberto.getSalary() * 12));
        System.out.println("Number of employees registered up to date:" + Employee.counter);
    }

    static void testEx16() {
        Car car = new Car();
        System.out.printf("Car tank level: %.2f - Odometer: %.2f\n", car.getTankLevel(), car.getOdometer());
        System.out.println("Please, supply my car with 60 liters of fuel.");
        car.supply(60);
        System.out.println("Please, supply my car with 45 liters of fuel.");
        car.supply(45);
        System.out.printf("Car tank level: %.2f - Odometer: %.2f\n", car.getTankLevel(), car.getOdometer());
        System.out.println("Please, move 150 Kilometers.");
        car.move(150);
        System.out.printf("Car tank level: %.2f - Odometer: %.2f\n", car.getTankLevel(), car.getOdometer());
        System.out.println("Please, move 300 Kilometers.");
        car.move(300);
        System.out.printf("Car tank level: %.2f - Odometer: %.2f\n", car.getTankLevel(), car.getOdometer());
        System.out.println("Please, move 300 Kilometers.");
        car.move(300);
        System.out.printf("Car tank level: %.2f - Odometer: %.2f\n", car.getTankLevel(), car.getOdometer());
    }

    static void testEx17() {
        Appointments appointments = new Appointments();
        Person alberto = new Person();
        alberto.setName("Alberto");
        alberto.setLastName("Rebello");
        alberto.setTelephoneNumber("+55 21 99999-9999");
        alberto.setCompany(false);

        Person ibm = new Person();
        ibm.setName("IBM");
        ibm.setCompany(true);
        ibm.setTelephoneNumber("+55 11 99009-9001");

        Person[] enrolledPeople = new Person[] {alberto, ibm};

        System.out.println("=> Please, create an appointment.");
        appointments.addNewRecord("Meeting", "25/07/2022","System Training",  enrolledPeople);
        appointments.printAll();
        System.out.println();

        System.out.println("=> Please, create an appointment.");
        appointments.addNewRecord("Meeting", "01/09/2022","System Launching",  enrolledPeople);
        appointments.printAll();
        System.out.println();

        Person victor = new Person();
        victor.setName("Victor");
        victor.setLastName("Freire");
        victor.setTelephoneNumber("+55 21 99999-9900");
        victor.setCompany(false);

        System.out.println("=> Please, enroll a new participant into appointment index 0");
        appointments.addNewParticipantById(0, victor);
        System.out.println("=> Please, print appointments where Alberto is enrolled");
        appointments.printByParticipant("Alberto");
        System.out.println();

        System.out.println("=> Please, remove participant Alberto from appointment index 0");
        appointments.removeParticipantById(0, alberto);
        System.out.println("=> Please, print appointments where Alberto is enrolled");
        appointments.printByParticipant("Alberto");
        System.out.println();

        System.out.println("=> Please, print appointments where date = 25/07/2022");
        appointments.printByDate("25/07/2022");
        System.out.println();

        System.out.println("=> Please, remove appointment index 2");
        appointments.removeRecordByIndex(2);
        System.out.println();

        System.out.println("=> Please, remove appointment index 0");
        appointments.removeRecordByIndex(0);
        appointments.printAll();


    }
}


