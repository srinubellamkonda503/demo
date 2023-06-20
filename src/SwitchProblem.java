import java.util.*;
public class SwitchProblem {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the  value");
	int value=sc.nextInt();
	if(value>=0) {
	switch(value) 
	{
	case 0:System.out.println("Supplie Srinu");
	      break;
	case 2:System.out.println("Baverse Srinu");
	      break;
	case 3:System.out.println("Useless Srinu");
          break;
	case 4:System.out.println("Psycho Srinu");
          break;
	case 5:System.out.println("Gorilla Srinu");
          break;
	case 6:System.out.println("Dareless Srinu");
          break;
	case 7:System.out.println("Waste Srinu");
          break;
	}}
    sc.close();
	}

}
