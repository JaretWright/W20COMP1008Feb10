import java.time.LocalDate;
import java.util.ArrayList;

public class TestingEmployee {
    public static void main(String[] args)
    {
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jaret","Wright",
                            "987234", LocalDate.of(1927,5,5),87.23);

        hourlyEmployee.setHoursWorked(43);
        System.out.printf("%s earned $%.2f", hourlyEmployee, hourlyEmployee.calcPayAmount());

        PurchaseOrder po = new PurchaseOrder(LocalDate.now(), 863.42, "SQL text book");

        ArrayList<Payable> payItems = new ArrayList<>();
        payItems.add(po);
        payItems.add(hourlyEmployee);



    }
}
