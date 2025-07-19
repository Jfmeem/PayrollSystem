public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseAmount;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate, double salary) {
        super(firstName, lastName, ssn, sales, rate);
        this.setBaseAmount(salary);
    }

    public void setBaseAmount(double salary) {
        if (salary < (double)0.0F) {
            throw new IllegalArgumentException("Base amount must be a non-negative value.");
        } else {
            this.baseAmount = salary;
        }
    }

    public double getBaseAmount() {
        return this.baseAmount;
    }

    public double earnings() {
        return this.getBaseAmount() + super.earnings();
    }

    public String toString() {
        return String.format("Base-Salaried %s\n%s: $%,.2f", super.toString(), "Base Amount", this.getBaseAmount());
    }
}