import java.util.Scanner;

public class TableSix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Take user input for number
		int n=sc.nextInt();

		//Create and Initialise an array
		int[] table=new int[4];		

		//Multiplication to be stored in array
		for(int i=6;i<=9;i++){
			table[i-6]= n * i;		
		}
		
		//Display the tables
		for(int i=6;i<=9;i++){
			System.out.println(n +" * "+i +" = " + table[i-6]);
		}
			
	}
}
