
public class Part_Time_Emp extends Employee{

	private double hourlyWage;
	public Part_Time_Emp(String type, String name, String number, String aadhar, double hrsWage) 
	{
		super( type, name, number, aadhar);
		this.setHourlyWage(hrsWage);
	}
	/**
	 * @return the hourlyWage
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}
	/**
	 * @param hrsWage the hourlyWage to set
	 */
	public void setHourlyWage(double hrsWage) {
		this.hourlyWage = hrsWage;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Wage : "+hourlyWage);	
		System.out.println();
	}

}
