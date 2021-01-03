package method_overriding;

public class CalculateInterest {

	public static void main(String[] args) {
	
		AmericanExpress am = new AmericanExpress();
		BankOfAmerica ba = new BankOfAmerica();
		
		System.out.println("American Expess interest " + am.getInterest() + "%.");
		System.out.println("Bank Of America interest " + ba.getInterest() + "%.");

	}

}
