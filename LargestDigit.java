import java.util.Scanner;

public class LargestDigit {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		final int maxDigit = 10;
		int[] digits = new int[maxDigit];
		int idx = 0;

		// Extract digits and store in array
		while(n!=0 && idx<maxDigit){
			digits[idx] = n % 10;
			// Remove the last digit
			n /= 10;
			idx++;
		}

		if(idx == 0){
			System.out.println("No digits were entered.");
		}

		// Find largest and second largest digits
		int largest = 0;
		int secondLargest = 0;

		for(int i=0;i<idx;i++){
			if(digits[i] > largest){
				secondLargest = largest;
				largest = digits[i];
			}
			else if(digits[i] > secondLargest && digits[i] != largest){
				secondLargest = digits[i];
			}
		}

		// Display results
 		System.out.println("Largest digit: " + largest);
        	System.out.println("Second largest digit: " + secondLargest);
	}
}
