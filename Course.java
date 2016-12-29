/*
 * Class: CS 111B Objected-Oriented Programming Methodologies in Java
 * Description: Keeps the course name and manages students in
 * that course. It uses the ArrayList as an array. 
 * Due date: 10/7/2015
 * File name: Course.java
 * Assignment #4
 * Programmed by John Ayson.
 */
import java.util.ArrayList;

public class Course
{
	//keeps the student's names.
	ArrayList<Student> names = new ArrayList<Student>();  
	String courseName;  //name of the course
	
	//constructor which initializes the course name.
	Course(String name)
	{
		courseName = name;
	}
	
	//adds student in the array list.
	public  void addStudent(Student stud)
	{
		names.add(stud);
	}
	
	//removes student from the array list.
	public void dropStudent(Student stud)
	{
		names.remove(stud);
	}
	
	//averages the test course of all the students in the course. 
	public double average()
	{
		Student temp;
		double total = 0;
		for(int i = 0; i < names.size(); i++) 
		{   
			temp = (Student) names.get(i);			
			total +=  temp.average();
		} 
		return total/names.size();
	}
	
	//fetches the name of the course.
	public String getcourseName()
	{
		return courseName;
	}
	
	//prints all the students in the course.
	public String roll()
	{
		Student temp;
		String s1 = new String();
		for(int i = 0; i < names.size(); i++) 
		{   
			temp = (Student) names.get(i);			
			s1 +=  temp.getName() + "\n";
		} 
		
		return s1;
	}
	
}
