package lessons;
import java.util.Scanner;

public class aula54ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // how many times to read
		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();   // reading the number typed
			if (num >= 10 && num <= 20) { // checking if number is in the interval
				in++; // counting the numbers on the range 
			} else
				out++; // counting the numbers out the range 
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

}
