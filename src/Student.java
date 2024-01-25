public class Student extends Person{
    //fields
    private double gpa;
    private static final double STIPEND = 36660.00;

    public Student(){ //default constructor calls the person constructor
        super();
    }
    public Student(String name,String surname,double gpa){ // parametrized constructor
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    @Override
    public double getPaymentAmount() { //method that returns a stipend if gpa is more than 2.67
        if (gpa > 2.67) {
            return STIPEND;
        }
        return 0;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }
}
