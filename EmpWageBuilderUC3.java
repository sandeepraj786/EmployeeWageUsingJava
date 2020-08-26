public class EmpWageBuilderUC3 
{
	public static void main(String[] args) 
{
		//Constants		
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHour = 20;
		//Variables
		int empHrs = 0;
		int empWage = 0;
		//Computation
		double randomValue = Math.floor(Math.random() * 10) % 3;
		if (randomValue == isFullTime)
			{
				empHrs = 8;
			}
		else if (randomValue == isPartTime)
			{
				empHrs = 4;
			}
		else
			{
				empHrs=0;
			}
		empWage = empHrs * wagePerHour;
		System.out.println("Employee Wage : " +empWage);
	}
}
