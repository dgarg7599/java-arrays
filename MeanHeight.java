import java.util.*;
public class MeanHeight {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Create and Initialise an array that stores the height of 11 players

		double[] heights = new double[11];

		System.out.println("Enter the height of players: ");

		for(int i=0;i<11;i++){
			heights[i] = sc.nextDouble();
		}

		//Initial total sum to 0
		double total = 0.0;
		for(int i=0;i<heights.length;i++){
			total += heights[i];
		}

		double mean = total/11;
		System.out.println("The mean height is: " + mean);
	}
}
