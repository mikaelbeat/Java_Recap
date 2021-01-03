package encapsulation_example;

public class BankLoan {
	
	private String name;
	private int age;
	private int amount;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age>=17 && age<=100) {
			this.age = age;
		} else {
			System.out.println("Age must be between 18 and 100");
		}
	}
	
	public void setAmount(int amount) {
		if(amount>=10 && amount<=1000) {
			this.amount = amount;
		}else {
			System.out.println("Amount must be between 10 and 1000.");
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getAmount() {
		return this.amount;
	}

}
