package com.students;

public interface StudentsDetail {
     public boolean insertStudents(Student s);
     public boolean delete(int roll);
     public boolean update(int roll,String update,int ch,Student s);
     public void showAllStudent();
     public boolean ShowStudentById(int roll);
}
