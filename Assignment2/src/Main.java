import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public void main() {
        Employee e1 = new Employee("John", "Lennon", "Singer", 27000.50);
        Employee e2 = new Employee("George", "Harrison", "Guitarist", 50000);
        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.0);
        // Create an arrayList of person objects
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(e1);
        persons.add(e2);
        persons.add(s1);
        persons.add(s2);
        Collections.sort(persons);
        printData(persons);
    }
    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            double payment = person.getPaymentAmount();
            if (person instanceof Employee) {
                System.out.println("Employee: " + person.toString() + " earns " + payment + " tenge");
            } else {
                System.out.println("Student: " + person.toString() + " earns " + payment + " tenge");
            }
        }
    }
}