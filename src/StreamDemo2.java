import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

public class StreamDemo2 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		List <Integer>ob1= new ArrayList<Integer>();
		System.out.println("Enter the 10th Marks");
		ob1.add(sc.nextInt());
		ob1.add(sc.nextInt());
		ob1.add(sc.nextInt());
		ob1.add(sc.nextInt());
		ob1.add(sc.nextInt());
		ob1.add(sc.nextInt());
		List<Integer> SudentData= ob1.stream().map((r)->r) .collect(Collectors.toList());
		System.out.println("Student Details"+SudentData);	
		List<Integer> FilureData= ob1.stream().filter((Integer r)->r<35).collect(Collectors.toList());
		System.out.println("Student FilureData Details ->" +FilureData);
		List<Integer> passedData= ob1.stream().filter((r)->r>=35).collect(Collectors.toList());
		System.out.println("Student PassedData Details->"+passedData);
		List<Integer> Data= ob1.stream().map((r)->r+5).collect(Collectors.toList());
		System.out.println("Student Update Details->"+Data);
		

	}

}
