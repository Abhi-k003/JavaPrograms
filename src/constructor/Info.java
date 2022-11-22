package constructor;

public class Info 
{
	String employeename,employeedesignation;
	int employeeid,employeesalary;
	public Info(String employeename,String employeedesignation,int employeeid,int employeesalary) 
	{
     this.employeename=employeename;
     this.employeedesignation=employeedesignation;
     this.employeeid=employeeid;
     this.employeesalary=employeesalary;
	}

	public static void main(String[] args) 
	{
		Info i = new Info("abhi", "automation", 7434, 80000);
        System.out.println(i.employeename+" "+i.employeedesignation+" "+i.employeeid+" "+i.employeesalary);
        
        Info i1 = new Info("abhishek","manual", 9854, 90000);
        System.out.println(i1.employeename+" "+i1.employeedesignation+" "+i1.employeeid+" "+i1.employeesalary);
        
        Info i2 = new Info ("abhishek kelusker","manual+automation", 84758347, 90000);
        System.out.println(i2.employeename+"\n"+i2.employeedesignation+" \n"+i2.employeeid+" \n"+i2.employeesalary);
}
}
