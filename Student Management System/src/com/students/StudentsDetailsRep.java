package com.students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.students.DBConnection;
public class StudentsDetailsRep implements StudentsDetail {
    @Override
    public boolean insertStudents(Student s) {
        boolean flag=false;
        try {
            Connection con = DBConnection.createConnection();
            String query = "insert into students_details(sname,clgName,city,percentage) values(?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(query);
            pst.setString(1, s.getName());
            pst.setString(2,s.getClgName());
            pst.setString(3,s.getCity());
            pst.setDouble(4,s.getPercentage());
            pst.executeUpdate();
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
            return flag;

    }

    @Override
    public boolean delete(int roll) {
        boolean flag=false;
        try{
            Connection con=DBConnection.createConnection();
            String query="Delete from students_details where rollNum="+roll;
            PreparedStatement pst= con.prepareStatement(query);
            pst.executeUpdate();
            flag=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(int roll, String update, int ch, Student s) {

        boolean flag=false;
        try {
            Connection con = DBConnection.createConnection();
               if(ch==1) {
                   String query = ("update students_details set sname=? where rollNum=?");
                   PreparedStatement pst = con.prepareStatement(query);
                   pst.setString(1, update);
                   pst.setInt(2, roll);
                   pst.executeUpdate();
                   flag=true;
               }
               if (ch==2){
                   String query="update students_details set clgName=? where rollNum=?";
                   PreparedStatement pst=con.prepareStatement(query);
                   pst.setString(1,update);
                   pst.setInt(2,roll);
                   pst.executeUpdate();
                   flag=true;
               }
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public void showAllStudent() {
        try {
            Connection con=DBConnection.createConnection();
            String query="select*from students_details";
            Statement smt=con.createStatement();
            ResultSet rst=smt.executeQuery(query);
            while(rst.next()){
                System.out.println("Rollnum :" + rst.getInt(1) + "\n" +
                        "Name :" + rst.getString(2) + "\n" +
                        "ClgName :" + rst.getString(3) + "\n" +
                        "City :" + rst.getString(4) + "\n" +
                        "Percentage :" + rst.getDouble(5));
                System.out.println("------------------------------------------------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public boolean ShowStudentById(int roll) {
        boolean flag=false;
        try{
            Connection con=DBConnection.createConnection();
            String query=("Select*from students_details where rollNum="+roll);
            Statement stm=con.createStatement();
            ResultSet rst=stm.executeQuery(query);

            while (rst.next()){
                System.out.println("Rollnum :" + rst.getInt(1) + "\n" +
                        "Name :" + rst.getString(2) + "\n" +
                        "ClgName :" + rst.getString(3) + "\n" +
                        "City :" + rst.getString(4) + "\n" +
                        "Percentage :" + rst.getDouble(5));
                flag=true;
            }


        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
