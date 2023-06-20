package maccess;
import test.EmployeeSalary;
import test.Designation;
import java.util.*; 
@SuppressWarnings({ "unused", "serial" })
public class DemoException2 extends Exception{
	public DemoException2(String msg)
	{
		super(msg);
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try {
		System.out.println("Enter the EmpId:");
		String id =s.nextLine();
		if(id.length()!=3)
		{
			DemoException2 de= new DemoException2("Invalid empid....");
			throw de;
		}
	System.out.println("Enter the EmpName:");
	String name=s.nextLine();
	System.out.println("Enter the EmpDes");
	String desg=s.nextLine().toUpperCase();
	Designation des=new Designation();
	boolean k =des.verify(desg);
	if(!k)
	{
		DemoException2 de= new DemoException2("Invalid desg...");
		throw de;
	}
	System.out.print("Enter the bsal:");
	int bSal=s.nextInt();
	if(bSal<12000)
	{
		DemoException2 de=new DemoException2("Invalid bSal...");
		throw de;
	}
	EmployeeSalary es=new EmployeeSalary();
	float totSal=es.calculate(bSal);
	System.out.println("====EmployeeDetails====");
	System.out.println("EmpId:"+id);
	System.out.println("EmpName:"+name);
	System.out.println("EmpDesg:"+desg);
	System.out.println("BSal:"+bSal);
	System.out.println("totSal:"+totSal);
	}
	catch(DemoException2 de)
	{
		System.out.println(de.getMessage());
	}
     catch(InputMismatchException ime)
	{
    	 System.out.println("Enter Only Integer Value..");
    	 }
	finally
	{
		s.close();
	}
	}

}
