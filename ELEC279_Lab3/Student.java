package lab3;

public class Student extends Person {
	
	private int numCourses;
	private String courseCodes[] = new String[20];
	private int[] grades = new int[20];
	private static int maxCourses = 20;
	
	
	public Student(String name, String address, int idNum) {
		super(name, address, idNum);
		// TODO Auto-generated constructor stub
	}
	
	public void addGrade(String courseName, int grade) {
		courseCodes [numCourses] = courseName;
		grades [numCourses] = grade;
		numCourses++;
	}
	
	public void printGrade() {
		for (int i = 0; i < maxCourses; i++) {
			if (courseCodes[i] == null) {
				break;
			}
			else {
				System.out.println(courseCodes[i] + ":" + grades[i]);
			}
		}
	}
	
	public String toString() {
		return ("Student: " + super.toString());
	}
	
}
