import java.time.LocalDate;
import java.time.Period;

public abstract class Employee {
    private String firstName, lastName, sin;
    private LocalDate birthday;

    public Employee(String firstName, String lastName, String sin, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setSin(sin);
        setBirthday(birthday);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        int age = Period.between(birthday,LocalDate.now()).getYears();

        if (age>0 && age<=130)
            this.birthday = birthday;
        else
            throw new IllegalArgumentException("Age must be 0->130 years");
    }

    public abstract double calcPayAmount();

    public String toString()
    {
        return String.format("%s %s", firstName, lastName);
    }
}
