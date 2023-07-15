package employees;

import java.util.Scanner;

public class Main {
    public static boolean detail=true;
    public static void menu(){
        System.out.println("******************Employee management system**************" + "\n" +
                "Here is your Options" + "\n" +
                "1. Add Employee" + "\n" + "2. View All Employee" + "\n" + "3. View Employee " + "\n"
                + "4. Update Employee Details" + "\n" + "5. Delete Employee" + "\n" + "6. Exit"
        +"\n" +"Please Enter the Above option..");
    }
    public static void main(String[] args) {
        EmployeeServices service=new EmployeeServices();
        Scanner sc=new Scanner(System.in);
        do{
            menu();
            int n=sc.nextInt();
            switch(n){
                case 1:
                    service.addEmp();
                    break;
                case 2:
                    service.viewAllEmp();
                    break;
                case 3:
                    service.viewEmp();
                    break;
                case 4:
                    service.updateEmp();
                    break;
                case 5:
                    service.deleteEmp();
                    break;
                case 6:
                    System.out.println("Thank you for Using this Application.....");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid Options");
            }

        }while (detail);


    }

}