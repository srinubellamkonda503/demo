import java.util.*;
import java.util.function.Predicate;
public class Lamda2 
{
	public static void main(String[] args) 
	{
		
		Predicate <Integer> p = ( Integer i) -> i%2==1;
		
		 System.out.println(p.test(10));
	}
	
}
