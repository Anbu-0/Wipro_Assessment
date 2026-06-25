package assignment2;
import java.util.*;

public class two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int large = 0;
		while (a > 0) {
            int digit = a % 10;

            if (digit > large) {
                large = digit;
            }

            a = a / 10;
        }
		System.out.println(large);
		sc.close();

	}

}
