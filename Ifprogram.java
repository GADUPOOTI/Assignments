public class Ifprogram
{
 public static void main(String args[])
 {
  if(Integer.parseInt(args[0])<=10)
  {
	System.out.println("Child");
  }
   else if(Integer.parseInt(args[0])<=20)
   {
	   System.out.println("Teenage");
   }
   else if(Integer.parseInt(args[0])<=30)
   {
	   System.out.println("Youngster");
   }
   else if(Integer.parseInt(args[0])<=40)
   {
	   System.out.println("Middle age");
   }
   else
   {
	System.out.println("Abbo age");
   }
 }
}