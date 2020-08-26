public class EmpWageBuilderUC4
{
	public static void main(String [] args)
	{
		// Constant
		int isFullTime=  1;
		int isPartTime=  2;
		int wagePerHour=20;

		// Variables
		int empHrs=0;
		int empWage=0;

		int randomValue=(int)Math.floor(Math.random()*10)%3;
		switch(randomValue)
		{
		case 1:
			empHrs=8;
			break;
		case 2:
			empHrs=4;
			break;
		default :
			empHrs=0;
		}
	
	empWage=empHrs * wagePerHour;
	System.out.println("Employee wage is :" +empWage);
	}
}
