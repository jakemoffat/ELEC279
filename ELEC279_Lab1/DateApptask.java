import java.util.Date;
public class DateApptask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date todaysdate = new Date();
		
		int min = 10, max = 20, average = 5; //initialize
		String myrole = "Driver";
		byte myfirstByte = 22;
		double pi = 3.14159;
		char mychar = 'N'; //variable type char
		
		int count = 1; //our counter variable
		
		while(count <= 10) {
			System.out.println(todaysdate);
			count = count + 1; //increment count
		}
		
		for(int counter = 1; counter <= 25; counter++) {
			System.out.println(todaysdate);
		}
		
		for(int row = 1; row <= 5; row++) {
			for(int column = 1; column <= 10; column++) {
				System.out.print(row * column + "\t"); //print each row
			}
			System.out.println(); //new row
		}
		
		
		//System.out.println(todaysdate);
		
		System.out.println("I am now the " +myrole); //print integer
		System.out.println("Our minimum score is " +min); //print string
		System.out.println("We have a byte " +myfirstByte); //print byte
		System.out.println("And double type is " +pi); //print double
		System.out.println("A char looks like " +mychar); //print character
		
		
	}

}
