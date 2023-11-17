
public class Full_time_Emp extends Employee{

	private double MonthlyWage;
	
	public Full_time_Emp(String type, String name, String number, String aadhar, double wage) {
		super( type, name,  number,  aadhar);
		this.setMonthlyWage(wage);
	}

	/**
	 * @return the monthlyWage
	 */
	public double getMonthlyWage() {
		return MonthlyWage;
	}

	/**
	 * @param wage the monthlyWage to set
	 */
	public void setMonthlyWage(double wage) {
		MonthlyWage = wage;
	}

	public void display()
	{
		super.display();
		System.out.println("Wage : "+MonthlyWage);
		System.out.println();
	}
}
