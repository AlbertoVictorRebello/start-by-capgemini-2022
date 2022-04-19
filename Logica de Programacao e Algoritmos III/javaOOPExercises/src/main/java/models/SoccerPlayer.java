package models;

public class SoccerPlayer extends Person{
    private String position;

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int yearsToRetirement() {
        int result = 0;
        if ("Defense".equals(this.position)) {
            result = 40 - getAge();

        } else if ("Center-Attack".equals(this.position)) {
            result = 38 - getAge();

        } if ("Attack".equals(this.position)) {
            result = 35 - getAge();

        }
        return result >= 0 ? result : 0;

    }

    @Override
    public String toString() {
        return "SoccerPlayer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + this.getAge() +
                ", height=" + height +
                ", weight=" + weight +
                ", position='" + position + '\'' +
                '}';
    }
}
