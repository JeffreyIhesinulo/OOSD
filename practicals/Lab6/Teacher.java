public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses;
    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[10];
    }
    public boolean addCourse(String course){
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course){
        courses[numCourses] = course;
        numCourses--;
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
