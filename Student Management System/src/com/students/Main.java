package com.students;
import java.util.Scanner;
public class Main {
    public static void menu(){
        System.out.println("*******************Students Management System**************************\n" +
                "Here is Your Options\n1. Add Students\n2. Show All the Students\n" +
                "3. Show Students students based on Id\n4.update Student Details\n" +
                "5. delete student\n6. Exit");
    }
    public static void main(String[] args) {
        StudentsDetailsRep stdeo=new StudentsDetailsRep();
        Scanner sc=new Scanner(System.in);
        while(true){
            menu();
            System.out.println("Enter your Choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Add student detail");
                    System.out.println("Enter name");
                    String name= sc.next();
                    System.out.println("Enter your Clg name ");
                    String clgName= sc.next();
                    System.out.println("Enter city");
                    String city= sc.next();
                    System.out.println("enter your percentage");
                    double percentage=sc.nextDouble();
                    Student st=new Student(name,clgName,city,percentage);
                    boolean act=stdeo.insertStudents(st);
                    if(act){
                        System.out.println("Student detail Added Successully....");
                    }
                    else
                        System.out.println("Something went Wrong please try Again..");
                    break;
                case 2:
                    stdeo.showAllStudent();
                    break;
                case 3:
                    System.out.println("Enter ur Rollnumber :");
                    int roll=sc.nextInt();
                    boolean ans=stdeo.ShowStudentById(roll);
                    if(!ans){
                        System.out.println("This rollnum is not registered in our application");
                    }
                    break;
                case 4:
                    System.out.println("1.Update name\n2.Update clgname");
                    System.out.println("enter your choice");
                    int choice= sc.nextInt();
                    if(choice==1){
                        System.out.println("enter student rollnum:");
                        roll= sc.nextInt();
                        System.out.println("Enter new name :");
                        String sname=sc.next();
                        Student st1=new Student();
                        st1.setName(sname);
                        ans=stdeo.update(roll,sname,choice,st1);
                        if(ans){
                            System.out.println("Student name Updated Successfully");
                        }
                        else{
                            System.out.println("Something went wrong");
                        }

                    }
                    if(choice==2){
                        System.out.println("enter student rollnum");
                        roll=sc.nextInt();
                        System.out.println("enter updated clgname ");
                        String clgname=sc.next();
                        Student st2=new Student();
                        st2.setClgName(clgname);
                        ans=stdeo.update(roll,clgname,choice,st2);
                        if(ans){
                            System.out.println("Student Clgname Updated Successfully");
                        }
                        else{
                            System.out.println("Something went wrong");
                        }
                    }
                    else System.out.println("enter corrent choice");
                    break;
                case 5:
                    System.out.println("Enter Student rollNum :");
                    roll= sc.nextInt();
                    ans=stdeo.delete(roll);
                    if(ans) {
                        System.out.println("Student Detail Deleted Successullly");
                    }
                    else{
                            System.out.println("Something went wrong");
                        }
                        break;

                case 6:
                    System.out.println("thank you for Using this Application..");
                    System.exit(0);
                default:
                    System.out.println("please enter valid option");
            }
        }
    }
}