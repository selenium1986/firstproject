package logical;

import java.util.Random;

public class RandonNumber {

	public static void main(String[] args) {
		int check;
		Random rn = new Random();
		
		for (check = 1;check<=5;check++){
			System.out.println(rn.nextInt(200));
		}

	}

}
