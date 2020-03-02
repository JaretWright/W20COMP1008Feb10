import java.time.LocalDate;

public class PurchaseOrder implements Payable{

    private LocalDate date;
    private double amount;
    private String description;

    public PurchaseOrder(LocalDate date, double amount, String description) {
        setDate(date);
        setAmount(amount);
        setDescription(description);
    }

    public LocalDate getDate() {
        return date;
    }

    /**
     * The date cannot be in the future
     * @param date
     */
    public void setDate(LocalDate date) {
        if (LocalDate.now().plusDays(31).isBefore(date))
            this.date = date;
        else
            throw new IllegalArgumentException("date cannot be more than 30" +
                    "days in the future");
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount >= 0)
            this.amount = amount;
        else
            throw new IllegalArgumentException("payment must be >= 0");
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.trim().isEmpty())
            this.description = description.trim();
        else
            throw new IllegalArgumentException("description cannot be empty");
    }

    @Override
    public void payAmount(LocalDate date, double amount, String description)
    {
        System.out.printf("System registered a payment of $%.2f on %s",
                amount, date);
    }
}
