import java.time.LocalDate;

/**
 * 
 */
public class Employee implements Comparable<Employee>{

	private String id;
	private String name;
	private String aadhar;
	private String number;
	LocalDate joining;
	

	private static int fcount=1;
	private static int pcount=1;
	
	/**
	 * 
	 */
	public Employee() {
		this.name="XXX";
		this.aadhar="XXXXXXXXXXXX";
		this.number="0000000000";
		this.joining= LocalDate.now();
	}
	
	public Employee(String type, String name, String aadhar, String number) {
		this.id=setId(type);    //Create a Unique ID for both Parttime and fulltime employee
		this.name=name;
		this.aadhar=aadhar;
		this.number=number;
		this.joining= LocalDate.now();
	}
	
	//Unique Id generator
	public String setId(String type) 
	{
		if(type.equals("F")){
			return(type+ Integer.toString(fcount++));
		}
		else
		{
			return(type+ Integer.toString(pcount++));	
		}
	}

	//Getter and Setter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	public LocalDate getJoining() {
		return joining;
	}

	//Display 
	public void display()
	{
		System.out.println();
		System.out.println("Id.:"+id);
		System.out.println("Name :"+name);
		System.out.println("Aadhar :"+aadhar);
		System.out.println("Number :"+number);
		System.out.println("Joined : "+joining);		
	}

	//Sort By date of joining
	@Override
	  public int compareTo(Employee o) {
	    return getJoining().compareTo(o.getJoining());
	  }
}
