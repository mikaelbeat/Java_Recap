package encapsulation_example;

public class ICICIBankLoan {

	
	public static void main(String[] args) {
		
		BankLoan loan = new BankLoan();
		
		loan.setAge(15);
		loan.setName("Test");
		loan.setAmount(5);
		
		
		System.out.println("Name is " + loan.getName() + ".");
		System.out.println("Age is " + loan.getAge());
		System.out.println("Amount is " + loan.getAmount() + ".");
	}
}
