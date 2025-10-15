package Lab4;

import java.util.Scanner;

public class MyHR {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Employee[] emps = new Employee[5];
        Office[] offices = new Office[3];
        for(int i= 0; i<=2; i++)
        {
            Office of = new Office();
            offices[i] = of;
        }
        int choice = 0;
        while(choice !=4)
        {
            System.out.println("Please select option");
            System.out.println("1. List all offices");
            System.out.println("2. Create new employee record");
            System.out.println("3. List all employees");
            System.out.println("4. Exit");
            choice = in.nextInt();

            if(choice == 1)
            {
                for(Office of: offices)
                {
                    System.out.println(of + "\t" +"No. of employees:"+ of.getNoOfEmps());
                    if(of.getNoOfEmps() != 0)
                    {
                        System.out.println("Employees: "+ "\n"+ of.printEmployee());
                    }
                }

            }
            else if(choice == 2)
            {
                if(emps.length>=5)
                {
                    String fname;
                    String lname;
                    String street;
                    String city;
                    String county;
                    String comCar = null;
                    String empType;
                    String compCar;
                    Scanner inEmp = new Scanner(System.in);
                    System.out.println("Please enter employee frist name");
                    fname = inEmp.nextLine();
                    System.out.println("Please enter employee last name");
                    lname = inEmp.nextLine();
                    System.out.println("Please enter employee street");
                    street = inEmp.nextLine();
                    System.out.println("Please enter employee city");
                    city = inEmp.nextLine();
                    System.out.println("Please enter employee county");
                    county = inEmp.nextLine();
                    System.out.println("Please enter employee type (Manager | Staff)");
                    empType = inEmp.nextLine();
                    if(empType.equalsIgnoreCase("Manager"))
                    {
                        System.out.println("Please enter emplyee company car type");
                        compCar = inEmp.nextLine();
                    }
                    Address add = new Address(street, city, county);
                    Employee emp = new Employee(fname, lname, add, empType);
                    emp.setComCar(comCar);
                    emps[Employee.noOfEmplyee()]=emp;
                    for(Office of: offices)
                    {
                        if (of.getNoOfEmps()<=2) {
                            of.addEmp(emp);
                            break;
                        }
                    }

                }
                else
                {
                    System.out.println("You have created the maximum number of employees");
                }
            }
            else if(choice == 3)
            {
                for(Employee emp: emps)
                {
                    if(emp !=null) System.out.println(emp);
                }
            }
            else if(choice == 4)
            {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
        
        
        
        
       

        
    }
}
