public class Student extends Person {
    private int id;
    private static int idg = 1;
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
    public Student() {
        id = idg++;
    }
    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        else {
            return 0;
        }
    }

}
