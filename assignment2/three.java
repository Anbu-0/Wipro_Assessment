package assignment2;

import java.util.*;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		while (a > 0) {
            int digit = a % 10;

            if (digit%2==0) {
                count++;
            }

            a = a / 10;
        }
		System.out.println(count);
		sc.close();

	}

}
