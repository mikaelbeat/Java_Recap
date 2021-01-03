package interface_example;

public class Medical implements Student{

	@Override
	public void displayName() {
		System.out.println("Hi, we are from Medical Department.");
		
	}

	@Override
	public void getStudentNumber() {
		System.out.println("We have 50 students.");
		
	}

	@Override
	public void getStandard() {
		System.out.println("We are from MD.");
		
	}
	
	public void getUniversity() {
		System.out.println("University name is University Of London.");
	}
	
	public static void main(String[] args) {
		
		Engineering eng = new Engineering();
		Medical md = new Medical();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
		
		System.out.println("**********************************");
		
		md.displayName();
		md.getStandard();
		md.getStudentNumber();
		md.getUniversity();
		
	}

	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}

}
