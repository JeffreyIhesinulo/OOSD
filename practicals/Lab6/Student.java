import java.util.Arrays;

public class Student extends Person {

    private int numCurses;
    protected String[] courses;
    protected int[] grades;
    public Student(String name, String address)
    {
        super(name, address);
        this.courses = new String[10];
        this.grades = new int[10];

    }
    public void addCourseGrade(String course, int grade){
        courses[numCurses] = course;
        grades[numCurses] = grade;
        numCurses++;
    }
    public void printGrades()
    {
        System.out.println(Arrays.toString(grades));
    }
    public double getAverageGrade()
    {
        double sum = 0;
        if (numCurses == 0)
            return 0;
        else
            for (int i = 0; i < numCurses; i++){
                sum += grades[i];
            }
        return sum / numCurses;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
