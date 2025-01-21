package day3.A;

import java.util.*;

class Pair{
	char grade;
	String judgement;
	Pair(char grade, String judgement){
		this.grade = grade;
		this.judgement = judgement;
	}
}

class ReportCardPrinter{
	void reportPrint(ReportCard reportCard) {
		reportCard.displayReport();
	}
	void reportPrint(List<ReportCard> reportCards) {
		for(ReportCard rc: reportCards) {
			rc.displayReport();
		}
	}
}
class ReportCard {
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
		System.out.println("Subject and Judgements: ");
		for(Map.Entry<String, Pair> m: subjects.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue().grade+" "+m.getValue().judgement);
		}
	}
}
public class StudentReportCard{
	public static void main(String[] args) {
		ReportCardPrinter reportprinter = new ReportCardPrinter();
		char num = 'a';
		System.out.println("Enter y for continuing the process");
		Scanner sc = new Scanner(System.in);
		List<ReportCard> reportCardList = new ArrayList<>();
		while((num=sc.next().charAt(0))=='y') {
			ReportCard report = new ReportCard("Ishita", "Kumari",10);
			
			System.out.print("Enter subject: ");
			String subject = sc.next();
			
			System.out.print("Enter grade: ");
			char grade = sc.next().charAt(0);
			System.out.print("Enter judgement: like downperformed, bad, average, good, excellent, outperformed");
			String judgement = sc.next();
			Pair gradeJudgements = new Pair(grade, judgement);
			
			report.addSubject(subject,gradeJudgements);
			reportCardList.add(report);
			System.out.println("Want to print report, y/n");
			String temp = sc.next();
			if(temp.charAt(0)=='y') {
				reportprinter.reportPrint(report);
			}
			System.out.println("\n ************************************************************");
			System.out.print("Want to enter new report: y/n");
		}
		System.out.println("Want to print all the reports, y/n");
		String choice = sc.next();
		if(choice.charAt(0)=='y') {
			reportprinter.reportPrint(reportCardList);
		}
		
	}
	
}

