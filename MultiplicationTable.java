import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// Take user input for number
		int n=sc.nextInt();

		//Create and Initialise an array
		int[] table=new int[10];		

		//Multiplication to be stored in array
		for(int i=0;i<table.length;i++){
			table[i]= n * (i+1);		
		}
		
		//Display the tables
		for(int i=0;i<table.length;i++){
			System.out.println(n +" * "+(i+1) +" = " +table[i]);
		}
			
	}
}
