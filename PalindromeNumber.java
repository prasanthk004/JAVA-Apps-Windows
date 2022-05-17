package Java.basics;

import java.util.Scanner;

 
public class PalindromeNumber {
	public static void main(String[] args) {
		PalindromeNumber p = new PalindromeNumber();
		int num;		
		/* Getting Manual inputs from user
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("\n Enter the Number : "); 
		 * num=sc.nextInt();		 */
		num = 12521;
		p.FindPalindrome(num); // Calling Palindrome function by passing Number
	}
	private void FindPalindrome(int num) {
		// TODO Auto-generated method stub
		int n = num;
		int rev = 0;
		while (n > 0) { 
           rev = rev * 10 +  n % 10;
			n /= 10;
	}
		// Checking if given Number & Reversed Number is same 
		if (num == rev) {
			System.out.printf("\n  Number %d is Palindrome Number", num);
		} else {
			System.out.printf("\n  Number %d is Not a Palindrome Number", num);
		}
	}
}

