package project3;

import java.util.Scanner;

public class MainProject {

	
	public static void main(String[] args) {
	
		System.out.println("Number of elements");
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] arr=new int[n];
		int i;
		
		System.out.println("Enter   " + n +"  values  ");
		System.out.println();
		for(i=0;i<n;i++)
		{ 
		System.out.println();
		 arr[i]=scan.nextInt();
		}
		
		boolean val=false;
		UserMainCode m1=new UserMainCode();
		val=m1.checkTriplets(arr);
		System.out.println(val);

		
		
	}

}