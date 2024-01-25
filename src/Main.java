import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Daniyar","Akhmetov","Manager",150000.00);
        Employee employee2 = new Employee("Sultan","Ospanov","tutor",80000.00);
        Employee employee3 = new Employee("Dastan","Aliev","shopp assistant",90000.00);
        Student student1 = new Student("Sanzhar","Omarov",2.09);
        Student student2 = new Student("Aybek","Iskakov",2.84);
        Student student3 = new Student("Zhansaya","Ismailova",3.48);

        ArrayList<Person> people = new ArrayList<>();
        people.add(employee1);
        people.add(employee2);
        people.add(employee3);
        people.add(student1);
        people.add(student2);
        people.add(student3);

        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<Person> people){
        for (Person person:people){
            System.out.println(person + " " + "earns" + " " + person.getPaymentAmount() + " " + "tenge");
        }
    }
}