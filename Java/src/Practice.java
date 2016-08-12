
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 32; // 32 bit interger value can only be stored 
		long b = 64; // 64 bit long value can be stored in this data type
		double c = 64.65; // 64 bit decimal vaules can only be stored in this datatype
		char d = 'j';  // Char is useful to store single character
		boolean e = true;   // boolean data type is useful to store true of false
		
		String j = "Hello world i m new to java";
		String k = "It is raining now in london";
//		System.out.println(j.equals(k));  // String equals compares string with given object and return boolean value
	//	System.out.println(j.charAt(1));
//		System.out.println(j.length());
	//	System.out.println(j.indexOf("e"));
	//	System.out.println(j.indexOf("world"));
	//	System.out.println(j.concat(k));
	//	System.out.println(k);
	//	System.out.println(j.substring(5));
//		String plit[] = j.split("Hello");
//		System.out.println(plit[1]);
		
//		int z = 10;
//		String value = String.valueOf("z");
//		System.out.println("Value of z = " + z);
////		
//		String o = "125";
//		int mik = Integer.parseInt(o);
//		System.out.println(o);
		
//		int q = 0;
//		while(q<=3){
//			System.out.println(q);
//			q = q+1;
//		}
		
		int q = 0;
		do{System.out.println("Value of q ="+ q);
		q = q+1;
		}
		while(q>4);
		
		
		
		
	
		for(int i =0;i<= 3; i++)
			System.out.println("value of i = "+ i);
		
		int p = 0;
		int n = 200;
		for( p = 3; p>= 0; p--)
			System.out.println("value of p = "+ p);
		 n = n-10;
		
		
	System.out.println();
		System.out.println("value of = " + n);
		
		
		String ar[][]= new String[3][2];
		ar[0][0]= "user1";
		ar[1][0]= "user2";
		ar[2][0]= "user3";
		ar[0][1]= "pass1";
		ar[1][1]= "pass3";
		ar[2][1]= "pass4";
		
		for (int r = 0;r<ar.length;r++){
			for (int m = 0;m<ar[r].length;m++){
				System.out.println(ar[r][m]);
			}
		}

	}

}
