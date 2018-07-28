package project1;

import java.util.Scanner;

import project1.Addition;
import project1.Arithmetic;
import project1.Division;
import project1.Multiplication;
import project1.Subtraction;

public class MainClass {
	public static void main(String[] args) {
		int num1 , num2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" first number");
		num1 = sc.nextInt();
		System.out.println(" second number");
		num2 = sc.nextInt();
		
		Arithmetic[] arra= new Arithmetic[5];
		arra[1] = new Addition(num1, num2);
		arra[2] = new Subtraction(num1, num2);
		arra[3] = new Multiplication(num1, num2);
		arra[4] = new Division(num1, num2);
		
		System.out.println("Enter 1 for additon , 2 for subtraction, 3 for multiplication, 4 for division");
		int choice  = sc.nextInt();
		
		int answer = arra[choice].calculate();
		System.out.println("Answer"+ answer);
		
	
		
	}

}
