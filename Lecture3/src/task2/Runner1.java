package task2;

import java.util.Random;

public class Runner1 {
	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		Random generator = new Random();
		
		a = generator.nextInt(899) + 100;
		b = generator.nextInt(899) + 100;
		c = generator.nextInt(899) + 100;
		
		String astr = Integer.toString(a);
		String bstr = Integer.toString(b);
		
		String abstr = astr + bstr;
		 Integer ab = Integer.valueOf(abstr);
		   
		System.out.println(ab - c);
	}
}
