class WhileMultiplication
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int i=1;
		while(i<=10)
	{
		System.out.println( num + "*" + i + "=" + num*i);
		i++;
	}
	}
}