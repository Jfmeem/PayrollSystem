public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        this.setHourlyRate(wage);
        this.setHoursWorked(hours);
    }

    public void setHourlyRate(double wage) {
        if (wage < (double)0.0F) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        } else {
            this.hourlyRate = wage;
        }
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public void setHoursWorked(double hours) {
        if (!(hours < (double)0.0F) && !(hours > (double)168.0F)) {
            this.hoursWorked = hours;
        } else {
            throw new IllegalArgumentException("Hours worked must be between 0.0 and 168.0.");
        }
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double earnings() {
        return this.getHoursWorked() <= (double)40.0F ? this.getHourlyRate() * this.getHoursWorked() : (double)40.0F * this.getHourlyRate() + (this.getHoursWorked() - (double)40.0F) * this.getHourlyRate() * (double)1.5F;
    }

    public String toString() {
        return String.format("Hourly Employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "Hourly Rate", this.getHourlyRate(), "Hours Worked", this.getHoursWorked());
    }
}
