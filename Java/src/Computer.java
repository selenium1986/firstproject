
public class Computer implements College {

	@Override
	public void collegeResult() {
		// TODO Auto-generated method stub
		String department = "Computer science";
		System.out.println("good");
		System.out.println("Loyola college department ="+ department);
		
	}

	@Override
	public void percentage() {
		// TODO Auto-generated method stub
		int a = 50;
		int b = 35;
		String name = "jksrinivas";
		System.out.println("Student name is = "+ name);
		System.out.println("Total percentage of marks obtained in computer science="+(a+b));
		
	}

}
