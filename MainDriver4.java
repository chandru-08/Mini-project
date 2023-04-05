import java.util.Scanner;
class MainDriver4{
	static Scanner sc = new Scanner(System.in);
	static boolean data = true;
	static Curd Curd;
	public static void main(String [] args){
		do{
			System.out.println("select your choice ");
			System.out.println("----------------- ");
			System.out.println("1. Mini Project Phase1 ");
			System.out.println("2. Mini Project Phase2 ");
			System.out.println("3. Exit! ");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1 :{
					System.out.println("Mini Project 1 Selected");
					Phase1.phase();
				}break;
				case 2 :{
					System.out.println("Mini Project 2 Selected");
					Phase2.phase();
				}break;
				case 3 :{
					data = false;
					System.out.println("Thank you Come Again");
				}break;
				default :{
					System.out.println("Enter numbers between 1 to 3");
				}break;
			}
		}while(data);
		
	}
		
		
		public static void curd(){
			 boolean data = true;
			do{
			 System.out.println("select your choice !");
			 System.out.println("--------------------");
			 System.out.println("1.create !");
			 System.out.println("2.read   !");
			 System.out.println("3.update !");
			 System.out.println("4.delete !");
			 System.out.println("5.exit !");
			 int choice= sc.nextInt();
			 
			 switch(choice){
				 case 1 :{
					 Curd = new Curd();
					 System.out.println("Creation done");
				}break;
				 case 2 :{
					 Curd.displayCurd();
					 System.out.println("Read operation done");
				 }break;
				 case 3 :{
					 details();
					 System.out.println("Updation done");
				 }break;
				 case 4 :{
					 Curd = null;
					 System.out.println("Delete done");
				 }break;
				 case 5 :{
					 data = false;
					 System.out.println("Thank you ");
				 }break;
				 default :{
					 System.out.println("select valid choice");
				           }break;
			    }
	        }while(data);
		}	
	
	
	
	    public static void details(){
			System.out.println("Enter ID");
			int id =sc.nextInt();
            Curd.id=id;			
			System.out.println("Enter NAME");
			String name= sc.next();
			Curd.name=name;
			System.out.println("Enter MAIL ID");
			String mailid= sc.next();
			Curd.mailid=mailid;
			System.out.println("Enter CONTACT NUMBER");
			long contactnumber= sc.nextLong();
			Curd.contactnumber=contactnumber;
		}
		
		
		
	    
}