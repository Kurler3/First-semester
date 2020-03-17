package learning;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6,7,8,9,10};
		Scanner scanner= new Scanner(System.in);
		/*for(int i=0;i<10;i++) {
			System.out.print("Enter a number for " + (i+1) + " number of array: ");
			x[i]=scanner.nextInt();
		    System.out.println(x[i]);
		}*/
		
		//for each statement
		for(int temp : x) {
			System.out.println(temp);
		}

	}

}
