package liskovSubstitution;

import openClose.Employee;

public class Engineer implements SalariedEmployee {
    private String name;
    private String surname;
    private int workingHour;

    public Engineer(String name, String surname, int workingHour) {
        this.name = name;
        this.surname = surname;
        this.workingHour = workingHour;
    }

    @Override
    public double getSalary() {
        return workingHour * 30;
    }

    @Override
    public String getDepartment() {
        return getClass().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workingHour=" + workingHour +
                '}';
    }

}
