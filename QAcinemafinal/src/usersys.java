import java.util.Scanner;
public class usersys {
	public void userSystem() {
		
	int qStandard, qChild, qStudent, qOap, option;	
	
	Scanner user = new Scanner(System.in);
	System.out.println("Welcome to QA Cinema");
	System.out.println("How many Standard tickets would you like?");
	qStandard = user.nextInt();
	System.out.println("How many Senior tickets would you like?");
	qOap = user.nextInt();
	System.out.println("How many Childrens tickets would you like?");
	qChild = user.nextInt();
	System.out.println("How many Student tickets would you like?");
	qStudent = user.nextInt();
	System.out.println("If it is Wednesday press 1, if not press 2");
	option = user.nextInt();
	
	
}
}	