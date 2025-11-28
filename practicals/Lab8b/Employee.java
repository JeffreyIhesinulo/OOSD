public class Employee extends Person{
    double salary;
    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    @Override
    public String getDiscription() {
        return getName()+" An employee with a salary of " + salary;
    }
}
