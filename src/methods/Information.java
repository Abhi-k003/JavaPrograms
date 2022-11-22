package methods;

public class Information 
{
	static String uname="Abhishek",password="Abhi003";
	static int nooffrnds=1000, nooffollowers=5000 ,nooffollowing=200, noofblockcon=20,noofgroups=20;
	
	
	public static void instagram() 
	{
		System.out.println("-----INSTAINFO------");
		System.out.println(uname+"\n"+password+"\n"+nooffollowers+"\n"+nooffollowing);
		
	}
	public static void fb() 
	{
	  System.out.println("-----FBINFO-----");
	  System.out.println(uname+"\n"+password+"\n"+nooffrnds);
	}
    public static void whatsApp()  
    {
    System.out.println("-------WHATSAPPINFO------");
    System.out.println(uname+"\n"+password+"\n"+noofblockcon+"\n"+noofgroups);
		
	}
	public static void main(String[] args) 
	{
		whatsApp();
		fb();
		instagram();
	}

}
