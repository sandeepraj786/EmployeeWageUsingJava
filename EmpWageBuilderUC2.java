public class EmpWageBuilderUC2
{
	public static void main(String[] args)
	{
		//constant
		int wagePerHour=20;
		int isPresent=1;

		// variables
		int empHrs=0;
		int empWage=0;

		double randomValue=Math.floor(Math.random()*10)%2;
		if (randomValue == isPresent)
		{
			empHrs=8;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*wagePerHour;
		System.out.println("Employee wage is :"+ empWage);
	}
}
