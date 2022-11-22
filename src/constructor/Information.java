package constructor;

public class Information 
{
	String employeename,employeedesignation;
	int employeeid,employeesalary;
	public Information(String ename,String ejob,int eid,int esal) 
	{
     employeename=ename;
     employeedesignation=ejob;
     employeeid=eid;
     employeesalary=esal;
	}

	public static void main(String[] args) 
	{
		Information i = new Information("abhi", "automation", 7434, 80000);
        System.out.println(i.employeename+" "+i.employeedesignation+" "+i.employeeid+" "+i.employeesalary);
        
        Information i1 = new Information("abhishek","manual", 9854, 90000);
        System.out.println(i1.employeename+" "+i1.employeedesignation+" "+i1.employeeid+" "+i1.employeesalary);
        
        Information i2 = new Information("abhishek kelusker","manual+automation", 84758347, 90000);
        System.out.println(i2.employeename+"\n"+i2.employeedesignation+" \n"+i2.employeeid+" \n"+i2.employeesalary);
	}

}
