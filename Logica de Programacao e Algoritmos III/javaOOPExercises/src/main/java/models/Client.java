package models;

public class Client extends Person{
    private  boolean isActive = true;

    public Client( ) {
    }
    public Client(String name) {
        this.name = name;
    }
    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean active) {
        isActive = active;
    }
}
