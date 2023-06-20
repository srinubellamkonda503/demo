import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class MapProgramme {

	public static void main(String[] args) 
	{
		Scanner Sadhika= new Scanner(System.in);
		System.out.println("Enter The Id");
		String id=Sadhika.next();
		System.out.println("Enter the name");
		String name=Sadhika.next();
		Map<String,String> ob1= new LinkedHashMap<String,String>();
		ob1.put(id, name);
		ob1.replace(id, name);
		System.out.println(ob1);
		for(String K:ob1.keySet())
		{
			System.out.println(K);
		}
		
		ob1.clear();
		System.out.println(ob1);
		Sadhika.close();
		
		

	}

}
