package employees;

import java.util.HashSet;
import java.util.*;

public class EmployeeServices {
    Employee emp1=new Employee(101,"Raja",33,"MBA","safety management",35000);
    Employee emp2=new Employee(102,"Vinayagam",30,"BE","ECE",32000);
    Employee emp3=new Employee(103,"krishana kumar",29,"B.Tech","Information Techno;ogy",30000);
    Employee emp4=new Employee(104,"Renga",25,"DCE","Civil",27000);

    HashSet<Employee> empset=new HashSet<>();
    Scanner sc=new Scanner(System.in);

    int id;
    String name;
    int age;
    String designation;
    String department;
    double salary;
    public EmployeeServices(){
        empset.add(emp1);
        empset.add(emp2);
        empset.add(emp3);
        empset.add(emp4);

    }
    public void viewAllEmp(){
        for(Employee emp:empset){
            System.out.println(emp);
        }
    }
    public void addEmp(){
        System.out.println("Please enter Id ");
        id=sc.nextInt();
        System.out.println("enter your name");
        name=sc.next();
        System.out.println("enter your Age ");
        age=sc.nextInt();
        System.out.println("Enter your designation");
        designation=sc.next();
        System.out.println("Enter your Department");
        department= sc.next();
        System.out.println("Enter your current salary");
        salary= sc.nextDouble();
        Employee emp=new Employee(id,name,age,designation,department,salary);
        empset.add(emp);
        System.out.println(emp);
        System.out.println("Emplee details Added Successfully...");
    }
    public void viewEmp(){
        System.out.println("Enter id: ");
        id= sc.nextInt();
        boolean occur=false;
        for(Employee em:empset){
            if(em.getId()==id){
                System.out.println(em);
                occur=true;
            }
        }
        if(!occur){
            System.out.println("Please enter valid Id this id is not registred...");
        }

    }
    public void updateEmp(){
        System.out.println("Enter user id:");
        id=sc.nextInt();
        boolean occur=false;
        for (Employee em:empset){
            if(em.getId()==id){
                System.out.println("enter name :");
                name=sc.next();
                System.out.println("Current Salary");
                salary= sc.nextDouble();
                em.setName(name);
                em.setSalary(salary);
                occur=true;
            }
        }
        if(!occur){
            System.out.println("Please enter valid user id ");
        }
        else{
            System.out.println("Your modification updated Successfully...");
        }
    }
    public void deleteEmp() {
        System.out.println("Enter user id:");
        id = sc.nextInt();
        boolean occur=false;
        Employee dltemp = null;
        for (Employee em : empset) {
            if (em.getId() == id) {
                dltemp = em;
                occur = true;
            }
        }
        if(!occur){
            System.out.println("Please enter valid user id :");

        }
        else
        {
            empset.remove(dltemp);
            System.out.println("Employee details deleted successfully..");
        }
    }

}
