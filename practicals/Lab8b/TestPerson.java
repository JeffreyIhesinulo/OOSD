public class TestPerson {
    public static void main(String[] args) {
        Person[] person = new Person[2];
        person[0] = new Employee("Joe", 10000);
        person[1] = new Student("James","C000111");
        System.out.println(person[0].getDiscription());
        System.out.println(person[1].getDiscription());
    }
}
