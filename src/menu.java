import java.util.Scanner;

public class menu 
{
	public static void main(String[] args) throws Exception {
	int choice=0;
	Scanner sc = new Scanner(System.in);
	Menu_function s1= new Menu_function();
	while(true)
	{
		System.out.println("1. Add a Full time Employee\n"
				+ "2. Add a Part time Employee\n"
				+ "3. Delete An Employee by Emp Id\n"
				+ "4. Search by Aadhar no\n"
				+ "5. Display all Employee\n"
				+ "6. Display all Employee sorted by date of joinig\n"
				+ "7. Exit\n"
				);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
		{
			s1.createEmp("F");
			break;
		}
		case 2: 
		{
			s1.createEmp("P");	
			break;
		}
		case 3:
		{
			s1.deleteById();
			break;
		}
		
		case 4: 
		{
			s1.searchByAadhar();
			break;
			
		}
		case 5: {
			s1.displayall();
			break;
		}
		case 6: {
			s1.sortByJoining();
			break;
		}
		case 7: {
			System.exit(0);
		}
		default:
			System.out.println("Invalid Input");
		}
			
		}
	}
}
