public abstract class Person implements Payable,Comparable<Person> {
    //fields
    private static int id_gen = 1; // static variable to generate unique ID's
    private int id;
    private String name;
    private String surname;

    public Person(){ // Default constructor
        id = id_gen++;
    }

    public Person(String name, String surname){ // Parametrized constructor
        this(); // calls the default constructor
        setName(name);
        setSurname(surname);

    }
    public void setName(String name){ //setter
        this.name = name;
    }
    public void setSurname(String surname){ //setter
        this.surname = surname;
    }
    public int getId(){ //getter
        return id;
    }
    public String getName(){ //getter
        return name;
    }
    public String getSurname(){ //getter
        return surname;
    }

    public String getPosition(){ //method to get position
        return "Student";
    }
    @Override
    public String toString(){ // method that returns a string representation of the Person
        return id + "." + name + " " + surname;
    }

    @Override
    public abstract double getPaymentAmount();

    @Override
    public int compareTo(Person other){ //method that compares amount of payment:salary or stipend
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());

    }
}
