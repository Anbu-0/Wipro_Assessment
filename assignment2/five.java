package assignment2;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<a; i++) {
			if(a%i == 0 ) {
				sum =sum + i;
			}
		}
			System.out.println(sum == a?"Perfect number":"Not a perfect number");

	}

}
