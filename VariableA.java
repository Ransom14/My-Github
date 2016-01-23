package PascalsTrianglePackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class VariableA {

	public static void main(String[] args) {
		double A = 1;
		calculateFactorial(5);
		
	}
	

	public static void calculateFactorial(int n) {
		BigInteger result = BigInteger.ONE;
			for (int i=1; i<=n; i++) {
				result = result.multiply(BigInteger.valueOf(i));
		        }
			System.out.println("Answer is " + result);

		
	
		
		
		
	}

}
