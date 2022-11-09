import java.util.Scanner;

public class Lab1Task4 {

	public int tablevalue;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Lab1Task4 obj = new Lab1Task4();
		//Ask user for input name
		System.out.println("Input an integer value:");
		//Read input from user
		obj.tablevalue = input.nextInt();
		
		
		for(int i = 1; i <= 20; i++) {
			int multiple = i * obj.tablevalue;
			if (i == 20) {
				System.out.print(+multiple++); //removes comma from last number output

			}
			else {
				System.out.print(+multiple+ ", ");
			}
		}
		
		
		/* Print multiplication table as a 4x5 table
		for(int row = 1; row <= 4; row++) {
			for(int column = 1; column <= 5; column++) {
				int multiple = row * column * obj.tablevalue;
				System.out.print(multiple + "\t"); //print each row
			}
			System.out.println(); //new row
		}
		*/
	}
}



