@FunctionalInterface
  interface Myinterface{
	public void m2();
}
public  class Lamda
{
public static void main(String[] args)
{
	Myinterface ob1=() -> System.out.println("m1 method");
	ob1.m2();
}
}
