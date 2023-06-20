import java.util.*;

public class BiggestNumber {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size");
    int size=sc.nextInt();
     
    System.out.println("Enter the array values");
    Integer arr[]= new Integer[size];
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=sc.nextInt();
    }
    int max = arr[0];
    int min = arr[0];

    for(int i=0;i<arr.length;i++) 
    {
    	if(arr[i]>max )
    	{
    		max=arr[i];
    	}
    	else if(arr[i]<min)
    	{
    		min=arr[i];
    		
    	}
    }
    System.out.println("maximum number"+max);
    System.out.println("minumum number"+min);

   sc.close();
	}

}
