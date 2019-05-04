public class Calculator
{
public int sum(int a, int b)
{
return a + b;
}
public int sub(int a, int b)
{
return a - b;
}
public int div(int a, int b)
{
return a / b;
}
public int mul(int a, int b)
{
return a * b;
}
}

class Test
{
public static void main(String args[])
{
Calculator calculator = new Calculator();
System.out.println("sum of a and b is" +calculator.sum(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("sub of a and b is" +calculator.sub(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("div of a and b is" +calculator.div(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
System.out.println("mul of a and b is" +calculator.mul(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
}
}


