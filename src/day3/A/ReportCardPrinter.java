package day3.A;

import java.util.List;

public class ReportCardPrinter{
	void reportPrint(ReportCard reportCard) {
		reportCard.displayReport();
	}
	void reportPrint(List<ReportCard> reportCards) {
		for(ReportCard rc: reportCards) {
			rc.displayReport();
		}
	}
}