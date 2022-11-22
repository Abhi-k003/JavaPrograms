package variables;

public class FoodOrder_App 
{
	static String restaurant_name="paradise";
	static int no_of_dishes_order=5,price=5000;
	int order_id=5647,discount_amt=2000;
	
	public static void order_Details() 
	{
		System.out.println("-------order_details-----");
		System.out.println(restaurant_name);
		System.out.println(no_of_dishes_order+"\n"+price);
		FoodOrder_App foa = new FoodOrder_App();
		System.out.println(foa.order_id+"\n"+foa.discount_amt);
		
	}
	public void delivery_Person(String address,int waitcharges) 
	{
		System.out.println("-------order_details+delivery person details-----");
		System.out.println("Address is : "+address+"\n"+"Wait charges is : "+waitcharges);
		order_Details();
		
	}
	public void zomzto_Partner() 
	{
		System.out.println("------order_details+delivery person details+zomzto partner details-----");
		int food_rating=5,delivery_rating=5,hygenic_rating=5;
		System.out.println(food_rating+"\n"+delivery_rating+"\n"+hygenic_rating);
		delivery_Person("h.no:-17-4 cmc colony", 20);
		
	}
	
	

	public static void main(String[] args) 
	{
	order_Details();
	
    FoodOrder_App foa2 = new FoodOrder_App();
    foa2.delivery_Person("jsafgydchyu", 101);
    foa2.zomzto_Partner();
    
    FoodOrder_App foa3 = new FoodOrder_App();  
    foa3.zomzto_Partner();
    
	}

}
