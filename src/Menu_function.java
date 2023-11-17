import java.util.*;
import java.util.Scanner;

class MyException extends Exception{
	String message;
	public MyException(String message) {
		this.message=message;
	}
	
	public String toString() {
		return message;
	}
}


public class Menu_function {
	
	
		
		private static List<Employee> list=new LinkedList<Employee>();
		
		Scanner sc = new Scanner(System.in);
		
		//Create New Employee
		public void createEmp(String type) {
			try {
				System.out.println("Enter Name of Employee: ");
				String name = sc.next();
				System.out.println("Enter Aadhar of Employee: ");
				String aadhar = sc.next();
				if(!checkAadhar(aadhar)) {
					throw new MyException("Invalid Aadhar");
				}
				System.out.println("Enter Phone Number of Employee: ");
				String no = sc.next();
				if(!checkno(no)) {
					throw new MyException("Invalid Number");
				}
				System.out.println("Enter Wage of Employee: ");
				double w = sc.nextInt();
				
				if(type.equals("F")) {
					Employee g= new Full_time_Emp("F",name, aadhar, no, w);
					list.add(g);
				}
				else {
					Employee g= new Part_Time_Emp("P",name, aadhar, no, w);
					list.add(g);
				}
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
		
		public void displayall() {
			for(Employee s:list) {
				s.display();
			}
		}

		//Validate Aadhar
		public boolean checkAadhar(String aadhar) {
			if(aadhar.length()==12) {
				try 
				{ 
					long x= Long.parseLong(aadhar); 
					for(Employee e:list) {
						if(e.getAadhar().equals(aadhar)) {
							System.out.println("Aadhar Number is already linked to an Employee");
							return false;
						}
					}
					return true;
				}  
				catch (NumberFormatException e)  
				{ 
					return false;
				} 
				
				
			}
			else {
				return false;
			}
		}
		
		//Validate Number
		public boolean checkno(String no) {
			if(no.length()==10 ) {
				try 
				{ 
					int i=Integer.parseInt(no); 
					return true;
				}  
				catch (NumberFormatException e)  
				{ 
					return false;
				} 
			}
			
			else if(no.length()==12 ) {
				try 
				{ 
					if(no.substring(0,2).equals("91")) {
						int i=Integer.parseInt(no); 
						return true;
					}
					else {
						return false;
						}
				}  
				catch (NumberFormatException e)  
				{ 
					return false;
				} 
			}
			
			
			else if(no.length()==13 ) {
				try 
				{ 
					if(no.substring(0,3).equals("+91")) {
						String str=no.substring(1, no.length());
						long i= Long.parseLong(str); 
						return true;
					}
					else {
						System.out.println("hfsdkj");
						return false;
					}
				}  
				catch (NumberFormatException e)  
				{ 
					System.out.println("fds");
					return false;
				} 
			}
			else {
				return false;
			}
		}
		
		//Remove by Id
		public void deleteById() throws MyException {
			boolean flag=false;
			System.out.println("Enter Id to be remove: ");
			String id = sc.next();
			for(Employee e:list) {
				if(e.getId().equals(id)) {
					list.remove(e);
					flag=true;
				}
			}
			if(flag) {
				System.out.println("Employee Removed");
			}
			
			else {
				throw new MyException("ID not found");
			}
			
		}

		
		//Search by Aadhar
		public void searchByAadhar() throws MyException {
			System.out.println("Enter Aadhar of Employee: ");
			String aadhar = sc.next();
			for(Employee e:list) {
//				System.out.println(e.getAadhar()+" "+aadhar);
//				System.out.println(e.getAadhar()==aadhar);
//				System.out.println((e.getAadhar()).equals(aadhar));
				if(e.getAadhar().equals(aadhar)) {
					e.display();
					return;
				}
			}
			
			throw new MyException("Aadhar not found");
			
		}
		
		public void sortByJoining() {
			 Collections.sort(list);
			 displayall();
		}
		
}

		
	