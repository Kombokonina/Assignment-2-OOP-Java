public class Student extends Person {
    private int id;
    private String name;
    private String surname;
    private double gpa;
    public String toString() {
        return "Student: " + id + "." + name + " " + surname;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public void setGpa(double gpa) {
        this.gpa=gpa;
    }
    public int getId() {
        return id;
    }
    public double getGpa() {
        return gpa;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Student(String name, String surname, double gpa) {
        setName(name);
        setSurname(surname);
        setGpa(gpa);
    }
    public Student() {}

    @Override
    public int compareTo(Employee other) {
        return 0;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
