package methods;

public class Area_with_Arg 
{
	public static void areaCir(int r) 
	{
		float pie=3.14F, area_cir;
		area_cir=pie*r*r;
		System.out.println(area_cir);
		
	}
	public static void areaSq(int i)
	{
		int area_square,a=10;
		area_square = a*a;
		System.out.println(area_square);
	}
	public static void areaRect(int l, int b) 
	{
		int area_rect;
		
	    area_rect=l*b;
	    System.out.println(area_rect);
		
	}

	public static void main(String[] args)  
	{
     areaSq(10);
     areaCir(5);
     areaCir(4);
     areaCir(8);
     areaCir(15);
     areaRect(12,15);

	}


}
