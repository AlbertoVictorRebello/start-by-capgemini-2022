import CustomExceptions.OperationDeniedException;
import models.*;

public class Main {
    public static void main(String[] args) {
//        testEx01();
//        testEx02();
//        testEx03();
        testEx04();
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
//        testEx17();

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

    }

    static void testEx06() {

    }

    static void testEx07() {

    }
}
