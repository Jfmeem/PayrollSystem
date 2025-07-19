public abstract class Employee {
    private String empFirstName;
    private String empLastName;
    private String socialSecNum;

    public Employee(String firstName, String lastName, String ssn) {
        this.empFirstName = firstName;
        this.empLastName = lastName;
        this.socialSecNum = ssn;
    }

    public String getEmpFirstName() {
        return this.empFirstName;
    }

    public String getEmpLastName() {
        return this.empLastName;
    }

    public String getSocialSecNum() {
        return this.socialSecNum;
    }

    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s", this.getEmpFirstName(), this.getEmpLastName(), this.getSocialSecNum());
    }

    public abstract double earnings();
}