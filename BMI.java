import java.util.Scanner;

public class BMI{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		//Take user input for number of people to consider
		System.out.print("Enter the number of persons: ");
		int n=sc.nextInt();

		//Create necessary arrays to store height and weight of each person.
		double[] height = new double[n];
        	double[] weight = new double[n];

		//Create arrays to store calculated bmi value and then status of each individual
        	double[] bmi = new double[n];
        	String[] status = new String[n];

		//Take user input for height and weight of each person
		System.out.println("Height(in meter) array: ");
		for(int i=0;i<n;i++){
			height[i]=sc.nextDouble();
		}

		System.out.println("Weight(in kg) array: ");
		for(int i=0;i<n;i++){ 
                        weight[i]=sc.nextDouble();
                }
		
		//Calculate bmi value of each person and determine the status
		for(int i=0;i<n;i++){
			bmi[i] = weight[i] / (height[i] * height[i]);
			if (bmi[i] <= 18.4) {
                		status[i] = "Underweight";
            		} 
			else if (bmi[i]>=18.5 && bmi[i] <= 24.9) {
                		status[i] = "Normal";
            		} 
			else if (bmi[i]>=25.0 && bmi[i] <= 39.9) {
                		status[i] = "Overweight";
            		} 
			else {
                		status[i] = "Obese";
            		}
		}
		
		//print the height, weight, BMI, and weight status of each person
		System.out.println("\nHeight(m)\tWeight(kg)\tBMI\tStatus");
		for(int i=0;i<n;i++){
			System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", height[i], weight[i], bmi[i], status[i]);
		}		
	}
}
