package liskovSubstitution;

public class Intern implements Employee{

    private String name;
    private String surname;
    private int workingHour;

    @Override
    public String getDepartment() {
        return getClass().toString();
    }

    public Intern(String name, String surname, int workingHour) {
        this.name = name;
        this.surname = surname;
        this.workingHour = workingHour;
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
}
