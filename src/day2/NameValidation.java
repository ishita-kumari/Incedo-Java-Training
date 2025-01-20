
package day2;
import java.util.*;

public class NameValidation {

    static boolean isValidName(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(char ch:name.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
        }
        System.out.println("Entered name is valid");
        return true;
    }
}
