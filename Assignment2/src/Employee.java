public class Employee extends Person {
    private int id;
    private String name;
    private static int idg = 1;
    private String surname;
    private String position;
    private double salary;
    public String toString() {
        return "Emlployee: " + id + "." + name + " " + surname;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public void setPosition(String position) {
        this.position=position;
    }
    public void setSalary(double salary) {
        this.salary=salary;
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
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
    public Employee(String name, String surname, String position, double salary) {
        setName(name);
        setSurname(surname);
        setPosition(position);
        setSalary(salary);
    }
    public Employee() {
        id = idg++;
    }
    @Override
    public double getPaymentAmount() {
        return salary;
    }


}
