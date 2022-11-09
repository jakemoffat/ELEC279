package lab5;

import java.util.ArrayList; // for intArray
import java.util.Random; // for raindom values in intArray
import java.util.Collections;
import java.util.Date;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Step 3.1: create an ArrayList of type Integer with an initial capacity of 5 and name it intArray
		ArrayList<Integer> intArray = new ArrayList<Integer>(5);
		Random rand = new Random(); 
		
		// Step 3.2
		for (int i=0; i<10; i++) {
			int nextVal = rand.nextInt(100);
			intArray.add(nextVal);
		}
		
		//print ArrayList
		System.out.println("Integer Array:");
		System.out.println(intArray);
		
		//Step 3.3 a
		ArrayList<Integer> revIntArray = new ArrayList<Integer>(intArray.size());
		
		//Step 3.3 b
		for (int num : intArray) {
			revIntArray.add(0,num); // Step 3.3 c
		}
		
		//Step 3. 4: print reversed ArrayList
		System.out.println("");
		System.out.println("Reversed Integer Array:");
		System.out.println(revIntArray);
		
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");

		// In step 3 - need to finish the following steps
		
		
		//ArrayList of HourlyEmployee with initial capacity of 100
		ArrayList<HourlyEmployee> hourlyEmployeeArray = new ArrayList<HourlyEmployee>(100);
		
		//adding object to ArrayList
		HourlyEmployee Jake = new HourlyEmployee("Jake",new Date(100,2,3), 15.00, 2.0);
		hourlyEmployeeArray.add(Jake);
		//adding object to hourlyEmployeeArray
		HourlyEmployee Kieran = new HourlyEmployee("Kieran",new Date(97,4,15), 16.00, 15.0);
		hourlyEmployeeArray.add(Kieran);
		//adding object to hourlyEmployeeArray
		HourlyEmployee Lucas = new HourlyEmployee("Lucas",new Date(93,11,9), 30.00, 30.0);
		hourlyEmployeeArray.add(Lucas);
		//adding object to hourlyEmployeeArray
		HourlyEmployee Kirby = new HourlyEmployee("Kirby",new Date(87,4,25), 45.00, 40.0);
		hourlyEmployeeArray.add(Kirby);
		
		//print ArrayList
		System.out.println("Hourly Employee Array:");
		System.out.println(hourlyEmployeeArray);
		//printing size of ArrayList
		System.out.println("Size of Hourly Employee Array: ");
		System.out.print(hourlyEmployeeArray.size());
		System.out.println("");
		
		//trimming ArrayList capacity to size
		hourlyEmployeeArray.trimToSize();
		
		//replacing first object in ArrayList with new object
		hourlyEmployeeArray.set(0, new HourlyEmployee("Brian",new Date(101,1,2), 30.0, 45.0));
		
		//printing ArrayList
		System.out.println("After changing first element:");
		System.out.println(hourlyEmployeeArray);
		
		//removing third element in ArrayList
		hourlyEmployeeArray.remove(2);
		//printing ArrayList
		System.out.println("");
		System.out.println("After removing third element:");
		System.out.println(hourlyEmployeeArray);
		
		/*----------------------------------------------------------------------------------------*/

		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");

		
		//creating new Pair object
		Pair<String> couple1 = new Pair<String>("Andrew Garfield", "Emma Stone");
		//creating new Pair object
		Pair<String> couple2 = new Pair<String>("Peter Parker", "Gwen Stacy");
		//creating new Pair object
		Pair<String> couple3 = new Pair<String>("Andrew Garfield", "Emma Stone");
		
		//printing variables of Pair object
		String strp1 = couple1.toString();
		System.out.println("Couple 1:");
		System.out.println(strp1);
		//printing variables of Pair object
		String strp2 = couple2.toString();
		System.out.println("Couple 2:");
		System.out.println(strp2);
		//printing variables of Pair object
		String strp3 = couple3.toString();
		System.out.println("Couple 3:");
		System.out.println(strp3);
		
		System.out.println("");
		
		//comparing two Pair objects to check if they are the same
		System.out.print("Comparing couple 1 and couple 2: ");
		if(couple1.equals(couple2)) {
			System.out.println("Identical names");
		}
		else {
			System.out.println("Unidentical names");
		}
		
		//comparing two Pair objects to check if they are the same
		System.out.print("Comparing couple 1 and couple 3: ");
		if(couple1.equals(couple3)) {
			System.out.println("Identical names");
		}
		else {
			System.out.println("Unidentical names");
		}
		
		//comparing two Pair objects to check if they are the same
		System.out.print("Comparing couple 2 and couple 3: ");
		if(couple3.equals(couple2)) {
			System.out.println("Identical names");
		}
		else {
			System.out.println("Unidentical names");
		}
		
		System.out.println("");
		System.out.println("-------------------------------------");
		System.out.println("");

		
		//creating new Triple object
		Triple<String, Double> trip1 = new Triple<String, Double>("Toronto", 547.0, "Montreal");
		//creating new Triple object
		Triple<String, Double> trip2 = new Triple<String, Double>("Toronto", 264.5, "Kingston");
		//creating new Triple object
		Triple<String, Double> trip3 = new Triple<String, Double>("Toronto", 547.0, "Montreal");
		
		//printing variables of Triple object
		String strT1 = trip1.toString();
		System.out.println("Trip 1:");
		System.out.println(strT1);
		//printing variables of Triple object
		String strT2 = trip2.toString();
		System.out.println("Trip 2:");
		System.out.println(strT2);
		//printing variables of Triple object
		String strT3 = trip3.toString();
		System.out.println("Trip 3:");
		System.out.println(strT3);
		
		System.out.println("");
		
		//comparing two Triple objects to check if they are the same
		System.out.print("Comparing trip 1 and trip 2: ");
		if(trip1.equals(trip2)) {
			System.out.println("Trips are identical");
		}
		else {
			System.out.println("Trips are not identical");
		}
		
		//comparing two Triple objects to check if they are the same
		System.out.print("Comparing trip 1 and trip 3: ");
		if(trip1.equals(trip3)) {
			System.out.println("Trips are identical");
		}
		else {
			System.out.println("Trips are not identical");
		}
		
		//comparing two Triple objects to check if they are the same
		System.out.print("Comparing trip 2 and trip 3: ");
		if(trip3.equals(trip2)) {
			System.out.println("Trips are identical");
		}
		else {
			System.out.println("Trips are not identical");
		}


		}

		
}

