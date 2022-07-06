import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.IOException;
import java.io.*;
public class Start {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("PRESS 1 to Add student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Display student");
			System.out.println("PRESS 4 to Exit app");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				//add student..
				System.out.println("Enter user name :");
				String name = br.readLine();
				
				System.out.println("Enter user phone: ");
				String phone=br.readLine();
				
				System.out.println("Enter user city :");
				String city = br.readLine();
				
				// create student object to store student
				Student st = new Student(name, phone, city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is added successfully...");
				}else {
					System.out.println("Something went wrong try again....");
				}
				System.out.println(st);
				
			}else if(c==2)
			{
				// delete student
				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean f = StudentDao.deleteStudent (userId);
				if (f) {
				System.out.println("Deleted......");
				} else {
				System.out.println("Something went wrong...");
				}
				
			}else if(c==3)
			{
				//display student..
				StudentDao.showAllStudent();
				
			}if(c==4)
			{
				//exit
				break;
			}else {
				//nothing just run again and again and again..
			}
		}
		
		System.out.println("Thankyou for using my Application !");
	}

}
