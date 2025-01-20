package day2;
import java.util.*;

public class DOBValidation {
    static boolean isLeapYear(int year){
        //divisible by 4
        // if divisible by 100, then must be divisible by 400
        if(year%100 == 0){
            if(year%400 == 0)return true;
            return false;
        }
        return year%4 == 0;
    }

    static boolean isDateLessThanOrEqualToCurrentDate(String dob, int day, int month, int year){
        Calendar currDate = Calendar.getInstance();
        int currDay = currDate.get(Calendar.DAY_OF_MONTH);
        int currMonth = currDate.get(Calendar.MONTH)+1;
        int currYear = currDate.get(Calendar.YEAR);

        if(year < currYear)return true;
        if(year==currYear){
            if(month < currMonth)return true;
            if(day<=currDay)return true;
        }
        return false;
    }
    static boolean isValidDOB(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter DOB in form of dd/mm/yyyy: ");
        String dob = scanner.next();
        
        
        int year  = Integer.parseInt(dob.substring(6));
        int month = Integer.parseInt(dob.substring(3,5));
        int day = Integer.parseInt(dob.substring(0,2));
        
        if(dob.charAt(2)!='/' || dob.charAt(5)!='/' || dob.length()!=10){
            System.out.println("Please enter DOB in form of dd/mm/yyyy ");
            return false;
        }
        if (!isDateLessThanOrEqualToCurrentDate(dob, day, month, year)) {
            System.out.println("The date is in the future. Please enter valid DOB !!");
            return false;
        }
        
        
        if(month > 12){
            System.out.println("Please enter valid month!");
            return false;
        }
        
        if(day>31){
            System.out.println("Please enter valid day!");
            return false;
        }
        //leap year checking
        if(month==2){
            //leap
            if(isLeapYear(year)){
                if(day>29){
                    System.out.println("In given month, this day is not possible");
                    return false;
                }
            }
            
            //non leap
            else if(day>28){
                System.out.println("In given month, this day is not possible");
                return false;
            }
            
        }
        
        // 31-1,3,5,7  8,10,12
        if((month==4 || month==6 || month==9 || month==11) && day==31){
            System.out.println("In given month, this day is not possible");
            return false;
        }
        System.out.println("Entered DOB is valid");
        return true;
        
        
        
    }
    
}
