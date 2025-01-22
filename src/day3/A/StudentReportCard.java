package day3.A;

import java.util.*;

public class StudentReportCard{
	public static void main(String[] args) {
		ReportCardPrinter reportprinter = new ReportCardPrinter();
		char num = 'a';
		System.out.println("Enter y for continuing the process");
		Scanner sc = new Scanner(System.in);
		List<ReportCard> reportCardList = new ArrayList<>();
		while((num=sc.next().charAt(0))=='y') {
			
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter surname: ");
			String surname = sc.next();
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

