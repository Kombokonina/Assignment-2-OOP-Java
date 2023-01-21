public abstract class Person implements Payable, Comparable<Person> {
    private int id;
    private static int idg = 1;
    private String name;
    private String surname;

    public String toString(Person p) {
        return this.id + "." + this.getName() + " " + this.getSurname();
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
    public Person() {
        id = idg++;
    }
    public String getPosition() {
        return "Student";
    }
    @Override
    public double getPaymentAmount() {
        return this.getPaymentAmount();
    }
    @Override
    public int compareTo(Person a){
        if(this.getPaymentAmount()>a.getPaymentAmount()){
            return 1;
        }
        else if (this.getPaymentAmount()==a.getPaymentAmount()){
            return 0;
        }
        else{
            return -1;
        }
    }


}
