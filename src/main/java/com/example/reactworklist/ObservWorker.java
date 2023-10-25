package com.example.reactworklist;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ObservWorker {

    SimpleStringProperty name;
    SimpleStringProperty surname;
    SimpleStringProperty position;
    SimpleIntegerProperty age;
    SimpleIntegerProperty workExp;
    SimpleDoubleProperty salary;

    public ObservWorker(String name, String surname, String position, int age, int workExp, double salary) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.position = new SimpleStringProperty(position);
        this.age = new SimpleIntegerProperty(age);
        this.workExp = new SimpleIntegerProperty(workExp);
        this.salary = new SimpleDoubleProperty(salary);
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public SimpleStringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public int getAge() {
        return age.get();
    }

    public SimpleIntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public int getWorkExp() {
        return workExp.get();
    }

    public SimpleIntegerProperty workExpProperty() {
        return workExp;
    }

    public void setWorkExp(int workExp) {
        this.workExp.set(workExp);
    }

    public double getSalary() {
        return salary.get();
    }

    public SimpleDoubleProperty salaryProperty() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary.set(salary);
    }

    @Override
    public String toString() {
        return "ObservWorker{" +
                "name=" + name +
                ", surname=" + surname +
                ", position=" + position +
                ", age=" + age +
                ", workExp=" + workExp +
                ", salary=" + salary +
                '}';
    }
}
