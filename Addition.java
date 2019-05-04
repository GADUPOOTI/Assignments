class Addition
{
	int sum(int a, int b)
	{
	 return a+b;
	}
class Subtraction
{
	int sub(int a,int b)
	{
	 return a-b;
	}
}
class Multiplication
{
	int mul(int a,int b)
	{
	 return a*b;
	}
}
class Division
{
	int div(int a,int b)
	{
	 return a/b;
	}
}
class Calculator
{
 public static void main(String args[])
	{
		System.out.println("Enter the values of a and b");
		Addition a=new Addition();
		System.out.println("sum= "a.sum(Interger.parseInt(arg[0]),Integer.parseInt(arg[1]));
		Subtraction s=new Subtraction();
		System.out.println("sub= "s.sub(Interger.parseInt(arg[0]),Integer.parseInt(arg[1]));
		Multiplication m=new Multiplication();
		System.out.println("mul= "m.mul(Interger.parseInt(arg[0]),Integer.parseInt(arg[1]));
		Division d=new Division();
		System.out.println("div= "d.div(Interger.parseInt(arg[0]),Integer.parseInt(arg[1]));
	}
}