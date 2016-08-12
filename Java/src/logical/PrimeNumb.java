package logical;

public class PrimeNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit = 10;
		System.out.println(limit);
		for (int i = 1;i<limit;i++){
			 boolean isPrime = true;
			 
			 for(int j = 2; j<i;j++){
				 if(i%j == 0){
					 isPrime = false;
					 break;
				 }
			 }
				 if(isPrime)
				 System.out.println(i);
			 }
		}

	}


