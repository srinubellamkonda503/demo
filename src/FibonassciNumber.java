import java.util.*;
public class FibonassciNumber
{

	static int k1=0,k2=1,k3;
	public static void method(int k)
	{
		if(k>0) 
		{
			k1=k2;
			k2=k3;
			k3=k1+k2;
		System.out.println(k3);
		method(k-1);
		}
	}
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the value");
	int k=sc.nextInt();
	FibonassciNumber ob1= new FibonassciNumber();
	ob1.method(k);
	sc.close();
	}

}
