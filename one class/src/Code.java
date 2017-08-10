import java.util.Scanner;

public class Code {
	public static void main (String[] args) {
		int qStandard, qChild, qStudent, qOap, option;	//intialise integer variabes
		
		Scanner user = new Scanner(System.in);
		System.out.println("Welcome to QA Cinema");
		System.out.println("How many Standard tickets would you like?"); //print out statements for user to follow
		qStandard = user.nextInt(); //set variable at the next integer entered
		System.out.println("How many Senior tickets would you like?");
		qOap = user.nextInt();
		System.out.println("How many Childrens tickets would you like?");
		qChild = user.nextInt();
		System.out.println("How many Student tickets would you like?");
		qStudent = user.nextInt();
		System.out.println("If it is Wednesday press 1, if not press 2");
		option = user.nextInt();
		
		double standard;
		standard = 8.00;	
		double oap;
		oap = 6.00;
		double student;
		student = 6.00;
		double child;
		child = 4.00;		//declare the variable for prices of ticket
		double purchaseprice;
		purchaseprice = 0;	
		
		purchaseprice = ((standard * qStandard) + (child * qChild) + (oap * qOap) + (student * qStudent));
		
		if (option == 2) { //if user selects 2 then it is not wednesday and they wont get a discount
			
			
			System.out.println("The price of the tickets is " + purchaseprice);
				
}else {
			System.out.println("You have recieved £2 off, the price of the tickets is" + (purchaseprice -= 2));
	}
	}

}
