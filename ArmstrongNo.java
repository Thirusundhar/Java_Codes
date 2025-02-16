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


package workout;

import java.util.Scanner;

public class ArmstrongNo {
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = scan.nextInt();
        printArmstrongNumbers(N);
        scan.close();
    }

    public static void printArmstrongNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int temp = n;
        int digit = 0;
        
        // Counting the number of digits
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        
        int sum = 0;
        temp = n;
        
        // Calculating the Armstrong sum
        while (temp > 0) {
            int lastdigit = temp % 10;
            sum = (int) (sum + Math.pow(lastdigit, digit));
            temp = temp / 10;
        }
        
        // Returning whether the number is Armstrong
        return sum == n;
    }*/
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printArmstrongNo(n);
		scan.close();
	}
	public static boolean isArmstrong(int n) {
		int original=n;
		int temp=n;
		int digit=0;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		//System.out.println("Number of digit is present: "+ digit);
		temp=n;
		int sum=0;
		while(temp>0) {
			int lastdigit=temp%10;
			sum=(int)(sum+Math.pow(lastdigit, digit));
			temp=temp/10;
		}
		return sum==n;
	}
	public static void printArmstrongNo(int n) {
		for(int i=1; i<=n; i++) {
			if(isArmstrong(i)) {
				System.out.println(i+" ");
			}
		}
	}
}




