package lab5;

public class Triple <T,U> {

	private T departureCity;
	private U distance;
	private T arrivalCity;
	
	public Triple() {
		departureCity = null;
		distance = null;
		arrivalCity = null;
	}
	
	public Triple(T depart, U dist, T arrive) {
		departureCity = depart;
		distance = dist;
		arrivalCity = arrive;
	}
	
	public boolean equals(Triple<T, U> otherTrip) {
		return(departureCity.equals(otherTrip.departureCity) &&
				 distance.equals(otherTrip.distance)&&
				  arrivalCity.equals(otherTrip.arrivalCity));
	}
	
	public String toString() {
		return("Travelling from " + departureCity + " to " + arrivalCity + ".\tDistance: " + distance);
	}
}