package assignment2;
import java.util.*;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i=1; i<a; i=i+2) {
			sum = sum+i;
		}
		System.out.println(sum);

	}

}
