public class EmpWageBuilderUC6
{
	public static void main(String[] args)
	{
		// Constants
		int isPartTime=2;
		int isFullTime=1;
		int wagePerHour=20;
		int noOfWorkingDays=20;
		int totalmaxHrs =100;
		// variables
		int empHrs= 0;
		int empWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while(totalEmpHrs<=totalmaxHrs && totalWorkingDays<noOfWorkingDays)
		{
			totalWorkingDays++;

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

			totalEmpHrs +=empHrs;


		}
	empWage=totalEmpHrs * wagePerHour;
	   System.out.println("employee wage is :" +empWage);
	}
}
