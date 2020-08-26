public class EmpWageBuilderUC1
{
   public static void main(String [] args)
   {
		System.out.println("Welcome to employee wage problem");
		// Constants
      final int isPresent=1;
      final double randomValue=Math.floor(Math.random()*10)%2;
      if (randomValue == isPresent)
      {
         System.out.println("Employee is present");
      }
      else
      {
         System.out.println("Employee is absent");

      }
   }
}


