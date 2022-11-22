package constructor;

public class Add 
{
	public Add()
	{
		System.out.println("default add constructor");
	}
	public Add(int i,int j)
	{
		this();
		System.out.println("the result is : "+(i+j));
		
	}
	public Add(double d) 
	{
		this(400,500);
	  	System.out.println("Result is : "+d*d);
	}

	public static void main(String[] args) 
	{
		Add a = new Add(10.5);
		Add a1 = new Add();
		Add a2 = new Add(20,80);

	}

}
