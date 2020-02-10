import java.time.LocalDate;

public class TestingEmployee {
    public static void main(String[] args)
    {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jaret","Wright",
                            "987234", LocalDate.of(1927,5,5),87.23);

        hourlyEmployee.setHoursWorked(43);
        System.out.printf("%s earned $%.2f", hourlyEmployee, hourlyEmployee.calcPayAmount());


    }
}
