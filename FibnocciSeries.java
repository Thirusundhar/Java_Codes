package workout;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int n1=0;
		int n2=1;
		
		for(int i=0; i<n; i++) {
			System.out.print(n1 +" ");
			int n3=n2+n1;
			n1=n2;
			n2=n3;
		}
	}
}
