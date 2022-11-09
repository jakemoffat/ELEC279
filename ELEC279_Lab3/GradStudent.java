package lab3;

public class GradStudent extends Student {
	
	private int commMembers; 
	private int examsTaken;
	private String[] examNames = new String[20];
	private String[] examResults = new String[20];
	private static final int maxAttempts = 6;
	
	public GradStudent(String name, String address, int idNum) {
		super(name, address, idNum);
		// TODO Auto-generated constructor stub
	}
	
	public void setCommitteeNum(int numMembers) {
		commMembers = numMembers;
	}
	
	public int getCommitteeNum() {
		return commMembers;
	}
	
	public void addGrade(String examName, String examGrade) {
		examNames [examsTaken] = examName;
		examResults [examsTaken] = examGrade;
		examsTaken++;
	}
	
	public String toString() {
		return ("Grad " + super.toString() + "\n");
	}
	
	public void printExamGrades() {
		for (int i = 0; i < maxAttempts; i++) {
			if (examNames[i] == null) {
				break;
			}
			else {
				System.out.println(examNames[i] + ": " + examResults[i]);
			}
		}
	}
	
	
}
