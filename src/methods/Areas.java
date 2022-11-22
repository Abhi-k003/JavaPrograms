package methods;

public class Areas 
{
	public static void areaCir() 
	{
		float pie=3.14F, area_cir;
		int r=10;
		area_cir=pie*r*r;
	System.out.println(area_cir);
		
	}
	public static void areaSq()
	{
		int area_square,a=10;
		area_square = a*a;
		System.out.println(area_square);
		
	}
	public static void areaRect() 
	{
		int area_rect;
		int l=10,b=40;
	    area_rect=l*b;
	    System.out.println(area_rect);
		
	}

	public static void main(String[] args)  
	{
    /* areaSq();
     areaCir();
     areaCir();
     areaCir();
     areaCir();
     areaRect();*/
		Areas a = new Areas();
		a.areaSq();
		Areas.areaCir();
		areaRect();

	}


}
