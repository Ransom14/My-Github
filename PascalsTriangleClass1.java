package PascalsTrianglePackage;

import java.math.BigInteger;

public class PascalsTriangleClass1 extends VariableA {

	public static void main(String[] args) {
		float b = 1;
		float a = 2;
		
		while (a < 999999999){
			int x = calculateFactorial(a)/calculateFactorial(b)*calculateFactorial(a-b);
			a =+ 1;
			System.out.println(a);
			
		}
		
		
		while (b < 999999999){
			int x = calculateFactorial(a)/calculateFactorial(b)*calculateFactorial(a-b);
			b =+ 1;
			System.out.println(x);
			System.out.println(b);
		}
		
		
		// int x = calculateFactorial(a)/calculateFactorial(b)*calculateFactorial(a-b);
		
		// System.out.println("The Answer is " + x);
		
		
		
		
	}

	private static int calculateFactorial(float b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
