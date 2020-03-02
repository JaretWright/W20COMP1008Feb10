import java.time.LocalDate;

public interface Payable {
    public void payAmount(LocalDate date, double amount, String description);
}
