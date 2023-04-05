import java.util.Scanner;
class Phase2{
	 static Scanner sc = new Scanner(System.in);
	public static void phase(){
		System.out.println("Mini Project Phase 2");
		System.out.println("--------------------");
		System.out.println("1.University");
		System.out.println("2.College");
		System.out.println("3.Department");
		System.out.println("4.Student");
		System.out.println("5.Project");
		System.out.println("6.Exit !");
		int choice = sc.nextInt();
		
		switch(choice){
			case 1 :{
				System.out.println("university selected");
				MainDriver4.curd();
			}break;
			case 2 :{
				System.out.println("college selected");
				MainDriver4.curd();
			}break;
			case 3 :{
				System.out.println("Department selected");
				MainDriver4.curd();
			}break;
			case 4 :{
				System.out.println("Student selected");
				MainDriver4.curd();
			}break;
			case 5 :{
				System.out.println("Project selected");
				MainDriver4.curd();
			}break;
			case 6 :{
				System.out.println("Exit");
			}break;
			default :{
					System.out.println("invaild choice ");
			         }
			 break;
			
		}
	}
}