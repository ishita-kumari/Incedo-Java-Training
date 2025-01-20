package day2;

public class UserValidation {
    static boolean isValidUser(){
        if(!NameValidation.isValidName()){
            System.out.println("Please enter valid name");
            return false;
        }
        if(!DOBValidation.isValidDOB()){
            System.out.println("Please enter valid DOB");
            return false;
        }
        if(!EmailValidation.isValidEmail()){
            System.out.println("Please enter valid email");
            return false;
        }
        System.out.println("User validated successfully!!");
        return true;
    }
    public static void main(String[] args){
    	
        System.out.println("Enter name, DOB, email one by one: ");
        isValidUser();
        
    }
}
