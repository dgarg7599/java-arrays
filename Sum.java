import java.util.Scanner;

public class Sum{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		double[] arr = new double[10];
		
		//Initialise total sum to 0
		double total = 0.0;
		//Array index initialised to 0
		int idx=0;
		
		// Infinite while loop to take user input
		while(true){
			System.out.print("Enter a number (0 or negative to stop): ");
            		double n = sc.nextDouble();

			// Break if input is 0 or negative
            		if (n <= 0) {
                		break;
            		}
			// Break if array size limit is reached
            		if (idx == 10) {
                		break;
        		}	
			arr[idx]=n;
			idx++;			
		}
		for(int i=0;i<idx;i++){
			total+=arr[i];
		}
		System.out.println(total);
	}

}
