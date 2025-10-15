package Lab4;

public class Employee {
    private static int nextCountNum = 0;
    private static int nextEmployeeNum = 1000;
    private int employeeNum;
    private int count;
    private String fname;
    private String lname;
    private String empType;
    private String comCar;
    private Address address;

    public Employee(String fname, String lname, Address address, String empType) 
    {
     
       // nextCountNum++;
        //count = nextCountNum;
        setFname(fname);
        setAddress(address);
        setLname(lname);
        setEmpType(empType);
        setEmployeeNum(nextEmployeeNum);
        nextEmployeeNum++;

    }

    //getters & setters
    public Address getAddress() {
        return address;
    }

    public String getComCar() {
        return comCar;
    }
    public int getEmployeeNum() {
        return employeeNum;
    }

    public String getEmpType() {
        return empType;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setEmpType(String empType) {
        this.empType = empType;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setComCar(String comCar) {
        this.comCar = comCar;
    }
    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }
    public static int noOfEmplyee(){
        return nextEmployeeNum-1000;
    }
    //toString 
    @Override
    public String toString() {
        if (empType.equalsIgnoreCase("Manager"))
        {
            return "Employee [ fname=" + fname+ " lname="+ lname+" address="+address+" employee number="+employeeNum+" car type="+comCar+"]";
        }
        else
        {
            return "Employee [ fname=" + fname+ " lname="+ lname+" address="+address+" employee number="+employeeNum+"]";
        }
        
    }
}

