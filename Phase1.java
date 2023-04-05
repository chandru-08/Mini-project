import java.util.Scanner;
class Phase1{
	static Scanner sc = new Scanner(System.in);
	static boolean data = true;
	public static void phase(){
		do{
		System.out.println("Mini Project Phase 1");
		System.out.println("--------------------");
		System.out.println("1.Company");
		System.out.println("2.Branch");
		System.out.println("3.Department");
		System.out.println("4.Employee");
		System.out.println("5.Project");
		System.out.println("6.Exit !");
		int choice = sc.nextInt();
		
	 	switch(choice){
			case 1 :{
				System.out.println("Company selected");
	            MainDriver4.curd();
			}break;
			case 2 :{
				System.out.println("Branch selected");
				MainDriver4.curd();
			}break;
			case 3 :{
				System.out.println("Department selected");
				MainDriver4.curd();
			}break;
			case 4 :{
				System.out.println("Employeet selected");
				MainDriver4.curd();
			}break;
			case 5 :{
				System.out.println("Project selected");
				MainDriver4.curd();
			}break;
			case 6 :{
				data = false;
				System.out.println("Exit");
			}break;
			default :{
					System.out.println("invaild choice ");
			         }
			 break;
		             }
		}while(data);
	}
}