package methods;

public class QspiderLogin 
{
	private static boolean login(String un,int pwd) 
	{
		if (un=="Qspiders" && pwd==5454) 
		{
		 return true;	
		}
		else 
		{
			return false;	
		}
		
		
	}

	public static void main(String[] args) 
	{
		boolean qsp = QspiderLogin.login("Qspiders",5454);
        System.out.println(qsp);
        boolean qsp2 = QspiderLogin.login("Qspider", 5458);
        System.out.println(qsp2);
        
        System.out.println(QspiderLogin.login("euhja", 87567));
        
        QspiderLogin qs = new QspiderLogin();
       boolean amk = qs.login("dfhnkj", 5454);
        System.out.println(amk);
        

	}

}
