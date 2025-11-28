public class Student extends Person {
    private String course;
    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public String getDiscription() {
        return getName()+" A student studying "+ course;
    }
}
