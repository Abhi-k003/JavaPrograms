package constructor;

public class Student 
{
	String name;
	public Student(String Gname)
	{
		name=Gname;
	}
	

	public static void main(String[] args) 
	{
		Student s = new Student("Anchal");
		System.out.println(s.name);
		
		Student s2 = new Student("DLKFJSIOFHIW");
		System.out.println(s2.name);
	

	}

}
