package constructor;

public class Car 
{
	String name,color,model;
	int capacity; double price;
	
	public Car(String name,String color) 
	{
		this.name=name;
		this.color=color;
		
	}
	public Car(String name, String color,Double price) 
	{
	 this.name=name;
	 this.color=color;
	 this.price=price;
	 
	}
	public Car(String name,String color, Double price, int capacity, String model) 
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.capacity=capacity;
		this.model=model;
	}

	public static void main(String[] args) 
	{
		 Car c = new Car("Audi", "yellow", 9000.3836, 8, "XL308");
         System.out.println(c.name+" "+c.color+" "+c.price+" "+c.capacity+c.model);
         
         Car c1 = new Car("ferrari","green",78.73663);
         System.out.println(c1.name+"\n"+c1.color+"\n"+c1.price);
	}

}
