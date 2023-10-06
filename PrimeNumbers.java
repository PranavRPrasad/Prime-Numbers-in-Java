import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long sr, er, cnt = 0; int flag; 
		System.out.println("Enter starting string");
		sr = sc.nextLong();
		System.out.println("Enter ending range");
		er = sc.nextLong();
		System.out.print("Prime numbers between "+sr+" and "+er+" are: ");
		for(long i = sr; i <= er; i++) {
			if(i==0 || i==1)
				continue;
			flag = 1;
			cnt++;
			for(long j = 2; j <= i/2; j++) {
				if(i%j == 0) {
					flag = 0;
					cnt--;
					break;
				}
			}
			if(flag==1)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Number of prime numbers between "+sr+" and "+er+" is "+cnt);
	}
}
