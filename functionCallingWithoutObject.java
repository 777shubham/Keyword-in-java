class fun
{
	public static void fun1()
	{
		int a=2;
		System.out.println("VALUE of A : "+a);
	}
}
class functionCallingWithoutObject extends fun
{
	public static void main(String args[])
	{
		functionCallingWithoutObject.fun1();
	}
}