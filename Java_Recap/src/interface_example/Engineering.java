package interface_example;

public class Engineering implements Student{

	@Override
	public void displayName() {
		System.out.println("Hi, we are from Engineering Department.");
		
	}

	@Override
	public void getStudentNumber() {
		System.out.println("We have 100 students.");
		
	}

	@Override
	public void getStandard() {
		System.out.println("We are from ED.");
		
	}
	
	public void getUniversity() {
		System.out.println("University name is " + Student.university + ".");
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}

}
