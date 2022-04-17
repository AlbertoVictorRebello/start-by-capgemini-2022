public class Main {
    public static void main(String[] args) {
        testEx01();

    }

    static void testEx01() {
        Person person = new Person();
        person.setName("Alberto");
        person.setBirthDate("26/09/1972");
        person.setHeight(1.74f);
        System.out.println(person);

    }
}
