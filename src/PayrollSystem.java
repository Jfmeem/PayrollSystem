public class PayrollSystem {
    public PayrollSystem() {
    }

    public static void main(String[] args) {
        SalariedEmployee salariedEmp = new SalariedEmployee("Dva", "arah", "555-55-555", (double)1200.0F);
        HourlyEmployee hourlyEmp = new HourlyEmployee("Nyx", "horizon", "666-66-666", (double)20.5F, (double)45.0F);
        CommissionEmployee commissionEmp = new CommissionEmployee("Astra", "arah", "777-77-777", (double)8000.0F, 0.08);
        BasePlusCommissionEmployee basePlusCommissionEmp = new BasePlusCommissionEmployee("Mitsuha", "hana", "888-88-888", (double)12000.0F, 0.05, (double)450.0F);
        Employee[] employeeArray = new Employee[]{salariedEmp, hourlyEmp, commissionEmp, basePlusCommissionEmp};
        System.out.println("Processing Employee Payroll Polymorphically:\n");

        for(Employee currentEmployee : employeeArray) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee employee) {
                double newBase = employee.getBaseAmount() * 1.1;
                employee.setBaseAmount(newBase);
                System.out.printf("New base salary after 10%% bonus: $%,.2f\n", employee.getBaseAmount());
            }

            System.out.printf("Total earnings: $%,.2f\n\n", currentEmployee.earnings());
        }

    }
}