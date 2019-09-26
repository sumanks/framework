package Java_Programs;

import java.util.Scanner;

public class addtwonumbers {

	public static void main(String[] args) {
		int a= 10,  b=15 ,  sum;
		
		sum = a+b;
		System.out.println("Sum of two number is :" + sum);
		
		
		addtwonumbers add = new addtwonumbers();
		add.addTwoNumber();

	}
	
	public void addTwoNumber()
	{
		
		System.out.println("Please Enter the Value :" );
		Scanner sc = new Scanner(System.in);
		
		int sum;
		
		
		int a = sc.nextInt();
		
		System.out.println("Please Enter the Value for A : " + a   );
		
		int b = sc.nextInt();
		
		System.out.println("Please Enter the Value for B : " + b   );
		
		sum = a+b;
		
		System.out.println("Sum of two number  :" + sum );
		
	}

}
