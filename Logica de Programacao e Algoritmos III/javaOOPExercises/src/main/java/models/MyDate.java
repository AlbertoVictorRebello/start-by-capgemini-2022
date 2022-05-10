package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate implements Cloneable{
    LocalDate myDate;

    public MyDate(String myDate) {
        setMyDate(myDate);
    }

    public LocalDate getMyDate() {
        return myDate;
    }

    public void setMyDate(String myDate) {
        try {
            this.myDate = LocalDate.parse(myDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));;
        }catch (Exception e) {
            this.myDate = LocalDate.parse("01/01/0001", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
    }

    public int compareMe(MyDate otherDate) {
        int result = this.myDate.compareTo(otherDate.getMyDate());
        if (result > 0) {
            result = 1;
        } else if (result < 0) {
            result = -1;
        }
        return result;
    }

    public int getDay() {
        return myDate.getDayOfMonth();
    }

    public int getMonth() {
        return myDate.getMonthValue();
    }

    public String getMonthName() {
        return myDate.getMonth().name();
    }

    public int getYear() {
        return myDate.getYear();
    }

    public boolean isLeapYear() {
        return myDate.isLeapYear();

    }

    public Object getClone() throws CloneNotSupportedException {
            return this.clone();
    }

    @Override
    public String toString() {
        return String.format("%2s/%2s/%4s", myDate.getDayOfMonth(), myDate.getMonthValue(), myDate.getYear()).replace(' ','0');
    }
}
