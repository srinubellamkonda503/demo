package Sri;
import java.util.*;
@SuppressWarnings("unused")
public class ReverseNumber
{
	int sum=0 ,rev;
	
public void getData(int num) 
{
	while(num>0) {
	rev=num%10;
	sum=sum*10+rev;
	num=num/10;
	}
	System.out.println(sum);
}
	
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		ReverseNumber ob1= new ReverseNumber();
		ob1.getData(num);
		

	}

}
