public class Employee extends Person{
    // fields
    private String position;
    private double salary;

    public Employee(){ // default constructor calls the person constructor
        super();
    }

    public Employee(String name, String surname, String position,double salary) { // parametrized constructor
        this();
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount() { // implements getPaymentAmount from Payable interface
        return salary;
    }

}
