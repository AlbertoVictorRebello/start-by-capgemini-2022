import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    private String name;
    private LocalDate birthDate;
    private float height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", height=" + height +
                ", age=" + getAge() +
                '}';
    }
}
