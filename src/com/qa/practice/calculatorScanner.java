package com.qa.practice;

import java.util.Scanner;

public class calculatorScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What form of math would you like to perform");
		System.out.println("add subtract Multiply Divide");
		String input = scan.nextLine();
		
		
		switch(input) {
		    case "add": 
		    	int num1 = scan.nextInt();
		    	int num2 = scan.nextInt();
		    	System.out.println(add(num1, num2));
		    	
			
			    break;
		    case "subtract":
		    	int num3 = scan.nextInt();
		    	int num4 = scan.nextInt();
		    	System.out.println(sub(num3, num4));
			    
			
			    break;
		    case "Multiply":
		    	int num5 = scan.nextInt();
		    	int num6 = scan.nextInt();
		    	System.out.println(mult(num5, num6));
			    
			
			    break;
		
		    case "Divide":
		    	int num7 = scan.nextInt();
		    	int num8 = scan.nextInt();
		    	System.out.println(div(num7, num8));
		    	
			
			    break;
		}
		scan.close();

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mult(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

}
