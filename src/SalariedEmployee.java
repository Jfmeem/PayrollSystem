public class SalariedEmployee extends Employee {
    private double fixedWeeklyPay;

    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn);
        this.setFixedWeeklyPay(salary);
    }

    public void setFixedWeeklyPay(double salary) {
        if (salary < (double)0.0F) {
            throw new IllegalArgumentException("Weekly pay must be a non-negative value.");
        } else {
            this.fixedWeeklyPay = salary;
        }
    }

    public double getFixedWeeklyPay() {
        return this.fixedWeeklyPay;
    }

    public double earnings() {
        return this.getFixedWeeklyPay();
    }

    public String toString() {
        return String.format("Salaried Employee: %s\n%s: $%,.2f", super.toString(), "Weekly Pay", this.getFixedWeeklyPay());
    }
}
