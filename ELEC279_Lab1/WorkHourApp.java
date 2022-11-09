import java.util.Scanner;

public class WorkHourApp {

	public int hoursperday;
	public int numdays;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		WorkHourApp obj = new WorkHourApp();
		//Ask user for input name
		System.out.println("How many hours per day do you work?");
		//Read input from user
		obj.hoursperday = input.nextInt();
		
		System.out.println("How many days do you work?");
		//Read input from user
		obj.numdays = input.nextInt();
		
		
		for (int i = 1; i <= obj.numdays; i++) {
			
			int totalhours = i * obj.hoursperday;

			if(i > 1 && obj.hoursperday <= 1) {
				System.out.println("Day " +i+ ", Total Hours worked = " +i+  " Days * " +obj.hoursperday+ " hour = " +totalhours+ " hours.");
			}
			else if (i <= 1 && obj.hoursperday > 1) {
				System.out.println("Day " +i+ ", Total Hours worked = " +i+ " Day * " +obj.hoursperday+ " hours.");
			}
			else if (i <= 1 && obj.hoursperday <= 1) {
				System.out.println("Day " +i+ ", Total Hours worked = " +i+ " Day * " +obj.hoursperday+ " hour.");
			}
			else {
				System.out.println("Day " +i+ ", Total Hours worked = " +i+ " Days * " +obj.hoursperday+ " hours = " +totalhours+ " hours.");

			}
		
		}

	}
}	
