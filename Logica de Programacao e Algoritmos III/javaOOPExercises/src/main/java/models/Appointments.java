package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Appointments {
    private List<Appointment> records = new ArrayList<>();

    public List<Appointment> getRecords() {
        return records;
    }

    public void addNewRecord(String type, String date, String subject, Person... person) {
        Appointment record = new Appointment();
        record.setType(type);
        record.setSubject(subject);
        record.setEnrolled(List.of(person));
        record.setDate(date);
        this.records.add(record);
    }

    public void removeRecordByIndex(int id) {
        try {
            this.records.remove(id);
        }catch (Exception e) {
            System.out.println("Denied. This record does not exist.");
        }
    }

    public void addNewParticipantById(int id, Person... person) {
        records.get(id).setEnrolled(List.of(person));
    }

    public void removeParticipantById(int id, Person... person) {
        records.get(id).removeEnrolled(List.of(person));
    }
    public void printAll() {
        if (records.size() == 0) {
            System.out.println("No records.");
        } else {
            for (Appointment ap : records
            ) {
                System.out.printf(
                        "Appointment Type: %s\nDate: %s Subject: %s\nEnrolled: \n%s\n", ap.getType(), ap.getDate(), ap.getSubject(), ap.getEnrolled()
                );
            }
        }
    }

    public void printByParticipant(String name) {
        String response = "";
        if (records.size() == 0) {
            System.out.println("No records.");
        } else {
            for (Appointment ap : records
            ) {
                if (ap.isEnrolled(name)) {
                    response += String.format("Appointment Type: %s\nDate: %s Subject: %s\nEnrolled: \n%s\n", ap.getType(), ap.getDate(), ap.getSubject(), ap.getEnrolled()
                    );
                }
            }
        }
        if ("".equals(response)) {
            System.out.println("No records.");
        } else {
            System.out.print(response);
        }
    }

    public void printByDate(String date) {
        String response = "";
        if (records.size() == 0) {
            System.out.println("No records.");
        } else {
            for (Appointment ap : records
            ) {
                if (ap.getDate().toString().equals(date)) {
                    response += String.format("Appointment Type: %s\nDate: %s Subject: %s\nEnrolled: \n%s\n", ap.getType(), ap.getDate(), ap.getSubject(), ap.getEnrolled()
                    );
                }
            }
        }
        if ("".equals(response)) {
            System.out.println("No records.");
        } else {
            System.out.print(response);
        }
    }
}

class Appointment {
    private String type;
    private MyDate date;
    private String subject;
    private List<Person> enrolled = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type.toUpperCase(Locale.ROOT);
    }

    public String getEnrolled() {
        String response = "";
        for (Person p : enrolled
             ) {
            if (p.isCompany()) {
                response += String.format("Name: %-32s Telephone: %s\n",
                        p.getName() + " (Company)", p.getTelephoneNumber());
            }else {
                response += String.format("Name: %-10s Last Name: %-10s Telephone: %s\n",
                        p.getName(), p.getLastName(), p.getTelephoneNumber());
            }
        }

        return response;
    }

    public boolean isEnrolled(String name) {
        for (Person p : enrolled
             ) {
            if (name.equals(p.getName())) {
                return true;
            }
        }
        return false;
    }

    public void setEnrolled(List<Person> enrolled) {
        this.enrolled.addAll(enrolled);
    }

    public void removeEnrolled(List<Person> enrolled) {
        this.enrolled.removeAll(enrolled);
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = new MyDate(date);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

