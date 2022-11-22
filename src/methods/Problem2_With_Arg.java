package methods;

public class Problem2_With_Arg 
{
	public static void fbInfo(String id,int nooffrnd,int noofpost) 
	{
	System.out.println("----FB INFORMATION-----");	
	System.out.println(noofpost+"\n"+nooffrnd+"\n"+id);
		
	}
	public static void instaInfo(String id,int noofcon,int noofgroups,int blockedcon) 
	{
		System.out.println("-----instaINFO-----");
		System.out.println(id+" "+noofcon+" "+noofgroups+" "+blockedcon);
		
	}
	public static void whatsApp(String un,int noofcon,int noofgroups,int blockedcon) 
	{
		System.out.println("------whatsAppINFO------");
		System.out.println(un+"\n"+noofcon+"\n"+noofgroups+"\n"+blockedcon);
		
		
	}

	public static void main(String[] args) 
	{
		whatsApp("Abhi003", 100, 10, 15);
		instaInfo("abhi_k_003", 100, 5, 5);
		fbInfo("Abhishek kelusker", 600, 20); 
	

	}

}
