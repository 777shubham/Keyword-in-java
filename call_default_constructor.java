
class demo
{
	int A;
	demo()
	{
	A=50;	
	
	}
	demo(int n)
	{
		this();
	}
	void show()
	{
		System.out.println("Parameterised Constructor call Default Constructor and return value of A as : "+A);
	}
}
public class call_default_constructor
{
	public static void main(String[] args)
	{
		demo d=new demo(10);
		d.show();
	}
}