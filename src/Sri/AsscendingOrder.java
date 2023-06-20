package Sri;
import java.util.*;
@SuppressWarnings("unused")
public class AsscendingOrder {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		Integer arr[]=new Integer[size];
		System.out.println("Enter the Array elements");
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		int temp;
	for (int i=0;i<arr.length;i++) 
	{
		for(int j=i+1;j<arr.length;j++) 
		{
			if(arr[i]<arr[j]) 
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(Integer K:arr) {
		System.out.println(K);
	}

	}

}
