package nwknvghg;

class student{
	int rollno;
	String name;
	int marks;
	
	 public String toString() 
	 {
	        return "Roll No: " + rollno + ", Name: " + name + ", Marks: " + marks;
	 }
}



public class Array_foreachloop {
	
	public static void main(String[] args)
	{
		
		
		student students[] = new student[3]; 
		
		student s1 =new student();
		s1.marks=95;
		s1.name="aravind";
		s1.rollno = 1;
		
		student s2 =new student();
		s2.marks=95;
		s2.name="aravindlaxman";
		s2.rollno = 2;
		
		student s3 =new student();
		s3.marks=95;
		s3.name="SAL";
		s3.rollno = 3;
		
		students[0]=s2;
		students[1]=s1;
		students[2]=s3;
		
		for(student stud : students)
		{
			System.out.println(stud.name);
			System.out.println(stud.toString());
			
		}
		
		
		
	}

}
