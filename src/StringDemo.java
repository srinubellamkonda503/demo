import java.util.*;
public class StringDemo 
{
	private static final char[] ch = null;


	public void getData(String str)
	{
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			switch(ch)
			{
			case 'a' : c++; break;	
			case 'e' : c++; break;
			case 'i' : c++; break;
			case 'o' : c++; break;
			case 'u' : c++; break;
			
			}	
		}
		System.out.println(" how many vowels in String"+"  "+  c);
	System.out.println("========= Reverase of String=======");
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch= str.charAt(i);
			System.out.print(ch);
		}
	}
				
	
public static void main(String[] args)
{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the String name");
		String str=sc.nextLine().toLowerCase();
		StringDemo ob1 = new StringDemo();
		 ob1.getData(str);
		
}
	

}
