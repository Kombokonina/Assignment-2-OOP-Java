public abstract class Person implements Payable {
    private int id;
    private String name;
    private String surname;
    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }
    public Person() {}
    public String getPosition() {
        return "Student";
    }
    Student student = new Student();
    @Override
    public double getPaymentAmount() {
        if (student.getGpa() > 2.67) {
            return 36660.00;
        }
        else {
            return 0;
        }
    }

    public abstract int compareTo(Employee other);

    public abstract int compareTo(Student other);
}
