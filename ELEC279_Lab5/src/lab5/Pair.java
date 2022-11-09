package lab5;

public class Pair <T> {
	
	private T first;
	private T second;
	
	public Pair() {
		first = null;
		second = null;
	}
	
	public Pair(T firstItem, T secondItem) {
		first = firstItem;
		second = secondItem;
	}
	
	public boolean equals(Pair<T> otherPair) {
		return(first.equals(otherPair.first) && second.equals(otherPair.second));
	}
	
	public String toString() {
		return ("First: " + first + "\tSecond: " + second);
	}
}