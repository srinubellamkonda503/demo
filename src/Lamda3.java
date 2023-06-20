import java.util.function.Predicate;

public class Lamda3 {

	public static void main(String[] args) {
		String [] names= {"Srinu","arry","Anusaka"};
	Predicate <String> p= (name)->name.charAt(0)== 'A';
     for(String name: names) 
   {
	if(p.test(name));
	{
		System.out.println(name);
	}
		
	;
}
	}

}
