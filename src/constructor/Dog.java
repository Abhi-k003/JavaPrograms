package constructor;

public class Dog 
{
	String dname;
	public Dog(String dogname)
	{
		dname=dogname;
	}

	public static void main(String[] args) 
	{
		Dog d = new Dog("Tommy");
		System.out.println(d.dname);
		
		Dog d1 = new Dog("MOTI");
		System.out.println(d1.dname);
		
		Dog d3 = new Dog("kutta");
		System.out.println(d3.dname);

	}

}
