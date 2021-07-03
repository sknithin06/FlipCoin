package Java;
import java.util.Random;
import java.util.Scanner;
public class flipToss {
	public static void main(String[] args) {
		System.out.println("Welcome To Flip Coin");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a number times to flip a coin:"); 
		int n = sc.nextInt();
		int head = 0;
		int tail = 0;
		for (int i =0; i <n; i++) {
			Random random = new Random();
			double p = random.nextDouble();
			double  x =Math.round(p * 10) / 10.0;
			System.out.println("Rolling the dice we get:"+x);
			if (x < 0.5) {
				System.out.println("head is the winner");
				head = head + 1;
			}
			else {
				System.out.println("tail is the winner");
				tail = tail + 1;
			}
		}
		System.out.println("Number of times the Head wins is:"+head);
		System.out.println("Number of times the tail wins is:"+tail);
		double a = (double) head / n * 100;	
		double b = (double) tail / n * 100;
		System.out.println("Winning Percentage Heads is:"+a);
		System.out.println("Winning Percentage Tails is:"+b);
	}
}