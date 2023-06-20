import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class StreamProblems {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values");
     List<Integer> ob1= new ArrayList<>();
     ob1.add(sc.nextInt());
     ob1.add(sc.nextInt());
     ob1.add(sc.nextInt());
     ob1.add(sc.nextInt());
     ob1.add(sc.nextInt());
     System.out.println("Collection Data"+ob1);
   List<Integer>ob2=  ob1.stream().filter( (k)->k%2==0).collect(Collectors.toList());
   System.out.println("Even numbers"+ob2);
   List<Integer>ob3=  ob1.stream().filter( (k)->k%2==1).collect(Collectors.toList());
   System.out.println("Odd numbers"+ob3);
   List<Integer>ob4=  ob1.stream().map( (k)->k+5).collect(Collectors.toList());
   System.out.println("add some persenet"+ob4);


     
    
    	  
      }
        
       
      
        
        
     

	}


