package day3.A;

import java.util.HashMap;
import java.util.Map;

public class ReportCard {
	String name, surname;
	int studentClass;
	Map<String, Pair> subjects = new HashMap<>();
	public ReportCard(String name, String surname, int studentClass) {
		this.name = name;
		this.surname = surname;
		this.studentClass = studentClass;
	}
	public void addSubject(String subject, Pair voteAndJudgment) {
        subjects.put(subject, voteAndJudgment);
    }
	void displayReport() {
		System.out.println("Report Card for "+name+" "+surname);
		System.out.println("Class: "+studentClass);
		System.out.println("Grades and Judgements: ");
		for(Map.Entry<String, Pair> m: subjects.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue().grade+" "+m.getValue().judgement);
		}
	}
}