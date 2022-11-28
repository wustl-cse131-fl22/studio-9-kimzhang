package studio9;

import java.util.HashMap;
import java.util.Map;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> persons = new HashMap<>();
	
	public UniversityDatabase() {
		
	}
	
	public void addStudent(String accountName, Student student) {
		persons.put(accountName, student);
	}

	public int getStudentCount() {
		return persons.size();
	}

	public String lookupFullName(String accountName) {
		Student x = persons.get(accountName);
		if(x==null) {
			return null;
		}
		return x.getFullName();
	}

	public double getTotalBearBucks() {
		double sum = 0;
		for(Student x: persons.values()) {
			sum += x.getBearBucksBalance();
		}
		return sum;
	}
}
