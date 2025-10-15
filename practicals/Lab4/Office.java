package Lab4;

public class Office {
    private static int nextOfficeNum = 100;
    private int officeNum;
    private int noOfEmps = 0;
    private Employee[] employees = new Employee[2];

//Constructor
    public Office() 
    {
        setOfficeNum(nextOfficeNum);
        nextOfficeNum++;
    }
//getters & setters
 public void setNoOfEmps(int noOfEmps) {
     this.noOfEmps = noOfEmps;
 }
 public void setOfficeNum(int officeNum) {
     this.officeNum = officeNum;
 }
 public void setEmployees(Employee[] employees) {
     this.employees = employees;
 }
 public Employee[] getEmployees() {
     return employees;
 }
 public int getNoOfEmps() {
     return noOfEmps;
 }
 public int getOfficeNum() {
     return officeNum;
 }
//to string
@Override
public String toString() {
    return "Office [" +officeNum+"]";
}
    
//add emp method
public void addEmp(Employee employee){
    if(noOfEmps<=2)
    {
        employees[noOfEmps] = employee;
        noOfEmps++;
    }
    else
    {
        System.out.println("You have reached the maximum no. of emps");
    }
    
}
public String printEmployee(){
    String empDetails="";
    for(Employee emp:employees)
    {
        if(emp !=null){
           empDetails+=emp.getEmployeeNum()+","+emp.getFname()+""+emp.getLname()+"\n"; 
        }
    }
    return empDetails;
}


}
