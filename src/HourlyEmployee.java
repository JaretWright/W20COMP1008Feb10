import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    private double hourlyWage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String sin, LocalDate birthday, double hourlyWage) {
        super(firstName, lastName, sin, birthday);
        setHourlyWage(hourlyWage);
        hoursWorked=0;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage>=14)
            this.hourlyWage = hourlyWage;
        else
            throw new IllegalArgumentException("Hourly wage must be greater than or equal to 14");
    }

    public int getHoursWorked() {
        return hoursWorked;
    }


    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked>=0 && hoursWorked<=80)
            this.hoursWorked = hoursWorked;
        else
            throw new IllegalArgumentException("hour worked must be 0-80");
    }

    @Override
    public double calcPayAmount() {
        return hoursWorked*hourlyWage;
    }
}
