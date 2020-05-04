
public class CourseArray
{
	int NUM = 10;  //number of elements
	int count = 0;  //keeps count on how many student has been added.
	Student[]names = new Student[NUM];  //creates an array of Students.
	String courseName;  //keeps the name of the course
	
	//Constructor that initializes courseName.
	CourseArray(String name)
	{
		courseName = name;
	}
	
	//adds student to the course.
	public  void addStudent(Student stud)
	{
			count++;  //adds a student count.
			names[count-1] = stud;
	}
	
	//removes student from the course
	public void dropStudent(Student stud)
	{
		for(int i =0; i < NUM-1; i++)
		{
			if (names[i] == stud)
			{
				names[i] = names[count-1];
				names[count-1] = null;
			}
		}
	}
	
	//takes the average of all the tests in the course.
	public double average()
	{
		Student temp;
		double total = 0;
		for(int i = 0; i < count-1; i++) 
		{   
			temp = names[i];			
			total +=  temp.average();
		} 
		return total/(count-1);
	}
	
	//fetches the courseName.
	public String getcourseName()
	{
		return courseName;
	}
	
	//returns the total number of elements in array.
	public int getNum()
	{
		return NUM;
	}
	
	//returns the # of students in the course. 
	public int getcount()
	{
		return count;
	}
	
	//displays all the current students in the course.
	public String roll()
	{
		Student temp;
		String s1 = new String();
		for(int i = 0; i < count-1; i++) 
		{   
			temp = (Student)names[i];			
			s1 +=  temp.getName() + "\n";
		} 	
		return s1;
	}
	
}
