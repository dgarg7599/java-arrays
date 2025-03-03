import java.util.*;

public class VoteCheck {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Create and Initialise an array
		int[] studentsAge = new int[10];

		//Add elements to array using for loop
		System.out.println("Enter the ages of all 10 students: ");
		for(int i=0;i<10;i++){
			studentsAge[i] = sc.nextInt();
		}
		
		//  Checking whether the student can vote or not
		for(int i=0;i<studentsAge.length;i++){
			if(studentsAge[i]>=18){
				System.out.println("The student with the age " + studentsAge[i] + " can vote");
			}
			else if(studentsAge[i]<0){
				System.err.println("Invalid age");
			}
			else{
				System.out.println("The student with the age " + studentsAge[i] + " cannot vote");
			}
		}
	}
}
