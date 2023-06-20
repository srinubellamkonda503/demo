import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class StreamDemo 
{

	public static void main(String[] args) 
	{
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the hero names");
     List<String>ob1= new ArrayList<String>();
     ob1.add(sc.next());
     ob1.add(sc.next());
     ob1.add(sc.next());
     ob1.add(sc.next());
     ob1.add(sc.next());
     ob1.add(sc.next());
     ob1.add(sc.next());  
     System.out.println( "Names of heros"+ob1);
   Comparator<String>c=  (s1,s2)->
   {
    	int l1=s1.length() ;
    	int l2=s2.length();
    	if(l1<l2) return -1;
    	else if(l1>l2 ) return 2;
    	else return s1.compareTo(s2);
     };
     List <String> ob2=ob1.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
     System.out.println( "Assending Order"+ob2);
     List <String> ob3=ob1.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
     System.out.println( "Dssending Order"+ob3);
ob1.stream().forEach(System.out::println);

	}

}
