package main;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Person {
    public enum Sex {
        MALE,
        FEMALE
    }
    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    private List<Person> roaster = new ArrayList<>();

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
        roaster.add(this); // adding instance of Person class to this collection
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        if (this.birthday != null) {
            return Period.between(birthday,  LocalDate.now()).getYears();
        }
        else {
            return 0;
        }
    }

    public void printPerson() {

    }
}
