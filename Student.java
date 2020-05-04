

public class Student
{
   private String firstName, lastName;  //Student's first and last name
   private Address homeAddress, schoolAddress; //Addresses of home and school.
   private int testOne;  //keeps score for test 1.
   private int testTwo;  //keeps score for test 2.
   private int testThree;  //keeps score for test 3.   
   
   //Constructor: Sets up this student with the specified values and 
   //initializes the test.
   public Student(String first, String last, Address home,
                  Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      testOne = 0;
      testTwo = 0;
      testThree = 0;
   }
   
   //Constructor that sets all instance values based on parameter values.
   public Student(String firstName, String lastName, Address homeAddress,
            Address schoolAddress,int testOne, int testTwo, int testThree)
   {
   	this.firstName = firstName;
   	this.lastName = lastName;
   	this.homeAddress = homeAddress;
   	this.schoolAddress = schoolAddress;
   	this.testOne = testOne;
   	this.testTwo = testTwo;
   	this.testThree = testThree;
   }
   
   //sets the score for designated test number.
   public void setTestScore(int num,int score)
   {
   	if(num ==1)
   		testOne = score;
   	if(num == 2)
   		testTwo = score;
   	else
   		testThree = score;
   }
   
   //fetches the score for the matching test number
   public int getTestScore(int num)
   {
   	if(num == 1)
   		return testOne;
   	if(num == 2)
   		return testTwo;
   	else 
   		return testThree;
   }
   
   //fetches the person's first name.
   public String getfirstName()
   {
   	return firstName;
   }
   
   //fetches the person's last name.
   public String getlastName()
   {
   	return lastName;
   }
   
   //fetches the person's full name.
   public String getName()
   {
   	return firstName +" " + lastName;
   }
   
   //fetches the homeAddress
   public Address gethomeAddress()
   {
   	return homeAddress;
   }
   
   //fetches the schoolAddress
   public Address getSchoolAddress()
   {
   	return schoolAddress;
   }

   //fetches the average of the student's 3 tests.
   public double average ()
   {
   	double average;
   	average = (testOne + testTwo + testThree)/ 3.0 ;
   	return average;
   }
   
   //  Returns a string description of this Student object.
   public String toString()
   {
      String result;
      
      result = "\n----------------------------------\n";
      result += firstName + " " + lastName + "\n";
      result += "----------------------------------";
      result += "\nHome Address:\n" + homeAddress + "\n";
      result += "\nSchool Address:\n" + schoolAddress;
      result += "\n\nTest 1 score: " + testOne;
      result += "\nTest 2 score: " + testTwo;
      result += "\nTest 3 score: " + testThree; 
      result += "\nAverage Test Score: " ;
      return result;
   }
   
   
}
