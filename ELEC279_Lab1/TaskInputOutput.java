import java.util.Scanner;

public class TaskInputOutput {

	public int int1;
	public int int2;
	public int product;
	public int sum;
	
	public static void main(String args[]) {		
		//Create an object of the Scanner class
		Scanner input = new Scanner(System.in);
		TaskInputOutput obj = new TaskInputOutput();
		//Ask user for input name
		System.out.println("Enter an integer:");
		//Read input from user
		obj.int1 = input.nextInt();
		
		System.out.println("Enter another integer:");
		//Read input from user
		obj.int2 = input.nextInt();
		
		
		//Close the input stream
		input.close();
		
		obj.product = obj.int1 * obj.int2;
		obj.sum = obj.int1 + obj.int2;
		
		//Output to user
		System.out.println("The product of " +obj.int1 + " and " +obj.int2 + " is: " +obj.product);
		//System.out.println("The product is: " +obj.product);
		System.out.println("The sum is: " +obj.sum);
		
		
	}
	
}
