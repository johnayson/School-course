/*
 * Class: CS 111B Objected-Oriented Programming Methodologies in Java
 * Description: Driver class that demonstrate Student.java, Address.java and 
 * Course.java or CourseArray. by making a course and adding student's test 
 * scores in it.
 * Due date: 10/7/2015
 * File name: School.java
 * Assignment #4
 * Programmed by John Ayson.
 */
import java.text.DecimalFormat;
public class School
{
	//adds students their test scores to a zoology and biology course. 
	public static void main(String args[])
	{
   	DecimalFormat df = new DecimalFormat("#.00");
		Course zoology = new Course("Zoology");  //creates a course named zoology.
		System.out.println(zoology.getcourseName() + " Class");
		Address one = new Address("ocean","San Francisco", "CA",94124);
		Address two = new Address("Phelan","San Francisco","CA",94323);
		Address three = new Address ("Lee", "Daly City" , "CA", 93332);
		Address four = new Address("Brighton", "Compton" , "CA", 92324);
		
		//adds an object named john and sets his test scores.
		Student john = new Student("John","Smith", two,one);	
		zoology.addStudent(john);
		john.setTestScore(1, 77);
		john.setTestScore(2, 88);
		john.setTestScore(3, 85);
		System.out.print(john.toString());
		System.out.println(df.format(john.average()));
	
		//adds an object named bob and sets his test scores.
		Student bob = new Student("Bob","Builder",three,one);
		zoology.addStudent(bob);
		bob.setTestScore(1, 82);
		bob.setTestScore(2, 76);
		bob.setTestScore(3, 84);
		System.out.println(bob.toString());
		System.out.println(df.format(bob.average()));

		//adds an object named zoe and sets his test scores.
		Student zoe = new Student ("Zoe", "Perry", four, one);
		zoology.addStudent(zoe);
		zoe.setTestScore(1, 71);
		zoe.setTestScore(2,89);
		zoe.setTestScore(3,92);
		System.out.println(zoe.toString());
		System.out.println(df.format(zoe.average()));
		
		zoology.dropStudent(john);  //removes john from the student arraylist.
		System.out.println("\nAverage Test Score for all tests: " + 
		df.format(zoology.average()));
		System.out.println("Students Roll:");
		System.out.println(zoology.roll());
		
		//Creates a biology course from CourseArray(uses Student[])
		CourseArray biology = new CourseArray("Biology"); 
		System.out.println(biology.getcourseName() + " Class");
		
		Student joe = new Student("Joe","Johnson", two,one);	
		biology.addStudent(joe);
		joe.setTestScore(1, 77);
		joe.setTestScore(2, 88);
		joe.setTestScore(3, 85);
		System.out.println(joe.toString());
		System.out.println(df.format(joe.average()));

		Student tom = new Student("Tom","Doe",three,one);
		biology.addStudent(tom);
		tom.setTestScore(1, 82);
		tom.setTestScore(2, 76);
		tom.setTestScore(3, 84);
		System.out.println(tom.toString());
		System.out.println(df.format(tom.average()) );
		
		Student see = new Student("jake","Doe",three,one);
		biology.addStudent(see);
		see.setTestScore(1, 82);
		see.setTestScore(2, 76);
		see.setTestScore(3, 84);
		System.out.println(see.toString());
		System.out.println(df.format(see.average()) );
		
		biology.dropStudent(joe);  //removes john from the student arraylist.
		System.out.println("\nAverage Test Score for all tests: " + 
		df.format(biology.average()));
		System.out.println("Students Roll:");
		System.out.println(biology.roll());
		
	}
	
}
