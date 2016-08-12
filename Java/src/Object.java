
public class Object extends Employee {

	public Object(String address) {
		super(address);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		Test t = new Test("srini",12);
		//t.display();
		
		Employee e = new Employee("caledon");
		//e.display_address();
		
	/*	Computer can = new Computer();
		System.out.println(College.collegename);
		System.out.println(College.collegename + "myname");
		can.collegeResult();
		can.percentage();
		
		College ca = new Mechanical();
		System.out.println(College.collegename);
		System.out.println(College.cutoff_marks);
		System.out.println(College.location);
		ca.collegeResult();
	    ca.percentage();
	*/
	/*	Cow a = new Cow();
		a.eat("eating");
		a.makeNoise();
		a.milk();
	*/
		try{
		int a = 50/0;
		//System.out.println("Before execution :" + a);
		}catch(Exception z){
		System.out.println(z);}
		//finally{
		System.out.println("all");
		System.out.println("After execution");
		next(61);
		
	
	
			
		}
		public static void next(int age){
			if (age < 60)
			throw new ArithmeticException("not valid for pension");
			else
				System.out.println("valid for pension");
			
			}
		}
		
		
		
		
		
		
		
		
		

		
	


