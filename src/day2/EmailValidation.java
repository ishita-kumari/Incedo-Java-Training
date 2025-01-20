package day2;

import java.util.*;

import java.util.regex.*;

public class EmailValidation {
    static boolean isValidEmail(){
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        scanner.close();
        if(email.equals("")) return false;
        String regex = "^[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Entered email is valid");
            return true;
        }
        return false;
    }
}
