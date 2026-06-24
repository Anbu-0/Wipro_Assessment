package assignment;

import java.util.*;

public class Questwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println((a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))?"Leap Year":"Not a Leap Year");

	}

}
