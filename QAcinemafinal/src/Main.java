

public class Main {
	public static void main(String args[]) {
		
		double standard;
		standard = 8.00;
		double oap;
		oap = 6.00;
		double student;
		student = 6.00;
		double child;
		child = 4.00;
		double purchaseprice;
		purchaseprice = 0;
		
		usersys userObject = new usersys();
		userObject.userSystem();
		
		mathmethod mathObject = new mathmethod();
		mathObject.calculation();
		
		wednesday wedObject = new wednesday();
		wedObject.isWednesday();
		
	}

}
