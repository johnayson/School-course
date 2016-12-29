/*
 * Class: CS 111B Objected-Oriented Programming Methodologies in Java
 * Description: Driver class that demonstrate Student.java, Address.java and 
 * CourseArray.java by making a course and adding student's test scores in it.
 * Due date: 10/7/2015
 * File name: SchoolCourseArray.java
 * Assignment #4
 * Programmed by John Ayson.
 */
import java.text.DecimalFormat;


public class SchoolCourseArray
{
	public static void main(String args[])
	{
   	DecimalFormat df = new DecimalFormat("#.00");

		
	CourseArray biology = new CourseArray("Biology");
	System.out.println(biology.getcourseName() + " Class");
	Address one = new Address("ocean","San Francisco", "CA",94124);
	Address two = new Address("Phelan","San Francisco","CA",94323);
	Address three = new Address ("Lee", "Daly City" , "CA", 93332);
	Address four = new Address("Brighton", "Compton" , "CA", 92324);
	
	Student john = new Student("John","Smith", one,two);	
	biology.addStudent(john);
	john.setTestScore(1, 77);
	john.setTestScore(2, 88);
	john.setTestScore(3, 85);
	System.out.println(john.toString());
	//System.out.println(john.stringAve()+ df.format(john.average()));

	Student bob = new Student("Bob","Builder",one,three);
	biology.addStudent(bob);
	bob.setTestScore(1, 82);
	bob.setTestScore(2, 76);
	bob.setTestScore(3, 84);
	System.out.println(bob.toString());
	//System.out.println(bob.stringAve()+ df.format(bob.average()) );
	System.out.println(bob.gethomeAddress());
	Student zoe = new Student ("Zoe", "Perry", one, four);
	biology.addStudent(zoe);
	zoe.setTestScore(1, 71);
	zoe.setTestScore(2,89);
	zoe.setTestScore(3,92);
	System.out.println(zoe.toString());
	//System.out.println(zoe.stringAve()+ df.format(zoe.average()) );
	
	biology.dropStudent(john);
	System.out.println("Average Test Score for all tests: " + df.format(biology.average()));
	System.out.println("Students Roll:");
	System.out.println(biology.roll());
	}

	
}

