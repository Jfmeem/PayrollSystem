public class CommissionEmployee extends Employee {
    private double totalSales;
    private double commissionPercent;

    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        super(firstName, lastName, ssn);
        this.setTotalSales(sales);
        this.setCommissionPercent(rate);
    }

    public void setCommissionPercent(double rate) {
        if (!(rate <= (double)0.0F) && !(rate >= (double)1.0F)) {
            this.commissionPercent = rate;
        } else {
            throw new IllegalArgumentException("Commission percentage must be between 0.0 and 1.0.");
        }
    }

    public double getCommissionPercent() {
        return this.commissionPercent;
    }

    public void setTotalSales(double sales) {
        if (sales < (double)0.0F) {
            throw new IllegalArgumentException("Total sales cannot be negative.");
        } else {
            this.totalSales = sales;
        }
    }

    public double getTotalSales() {
        return this.totalSales;
    }

    public double earnings() {
        return this.getTotalSales() * this.getCommissionPercent();
    }

    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "Commission-Based Employee", super.toString(), "Total Sales", this.getTotalSales(), "Commission Percent", this.getCommissionPercent());
    }
}
