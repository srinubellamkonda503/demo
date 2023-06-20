import java.util.*;
import java.util.ArrayList;
public class StreamDemo3 {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the values");
	List<Integer> ob1= new ArrayList<Integer>();
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	ob1.add(sc.nextInt());
	System.out.println(ob1);
	Integer MinumumValue =ob1.stream().min((s1,s2)->s1.compareTo(s2)).get();
	System.out.println("MINVALUE  ->"+MinumumValue);
	Integer MaximumValue =ob1.stream().max((s1,s2)->s1.compareTo(s2)).get();
	System.out.println( "MAXVALUE    ->"+MaximumValue);
		


	}

}
