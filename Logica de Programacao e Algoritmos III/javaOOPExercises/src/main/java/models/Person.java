package models;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    protected boolean isCompany;
    protected String name;
    protected String lastName;
    private String telephoneNumber;
    protected String nationality;
    protected LocalDate birthDate;
    protected int age;
    protected float height;
    protected float weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        DateTimeFormatter brasilDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.birthDate = LocalDate.parse(birthDate, brasilDateFormat);
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setHeight(String height) {
        this.height = Float.parseFloat(height);
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public boolean isCompany() {
        return isCompany;
    }

    public void setCompany(boolean company) {
        isCompany = company;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "models.Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", height=" + height +
                ", age=" + getAge() +
                '}';
    }
}
