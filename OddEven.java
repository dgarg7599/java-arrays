import java.util.*;

public class OddEven {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Declaration and Initialisation of an array
		int[] numArray = new int[5];
		System.out.println("Enter the elements of an array: ");
		for(int i=0;i<5;i++){
			numArray[i] = sc.nextInt();
		}

		// Checking the number is positive, negative or zero
		for(int i=0;i<numArray.length;i++){
			if(numArray[i] > 0){
				// Check for odd and even
				if(numArray[i] %2 == 0){
					System.out.println(numArray[i] + " is Positive and Even.");
				}
				else{
					System.out.println(numArray[i] + " is Positive and Odd.");
				}
			}
			else if(numArray[i] < 0){
				System.out.println(numArray[i] + " is negative.");
			}
			else{
				System.out.println(numArray[i] + " is zero.");
			}
		}

		// Comparing the first and last element of the array and display if they equal, greater or less

		if(numArray[0] > numArray[numArray.length - 1]){
			System.out.println(numArray[0] + " is greater than " + numArray[numArray.length-1]);
		}
		else if(numArray[0] < numArray[numArray.length - 1]){
			System.out.println(numArray[0] + " is less than " + numArray[numArray.length-1]);
		}
		else{
			System.out.println(numArray[0] + " is equal to " + numArray[numArray.length-1]);
		}
	}
}
