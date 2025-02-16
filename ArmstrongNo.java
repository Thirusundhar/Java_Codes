/*package workout;

import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		isArmstrong(n);
	}
	public static void isArmstrong(int n) {
		int original=n;
		int temp=0;
		int digit=0;
		temp=n;
		while(n>0) {
			n=n/10;
			digit++;
		}
		System.out.println("Number of digits present is "+ digit);
		
		int sum=0;
		temp=n;
		while(temp>0) {
			int lastdigit = n%10;
			sum=(int) (sum+Math.pow(lastdigit, digit));
			temp=temp/10;
		}
		
		
		if(sum==temp) {
			System.out.println(n +" is a armstrong number");
		}
		else {
			System.out.println(n+" is not a armstrong number");
		}
	}
}*/

