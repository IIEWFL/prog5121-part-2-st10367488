/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog5121.project;

/**
 *
 * @author Maseo Junior
 */
public class Login {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    // Code Attributes
    // I found code in Stack Overflow
    //https://stackoverflow.com/questions/72061438/how-do-i-run-a-method-boolean-checkusername-this-method-ensures-that-any-use
    //Author: Will
    //https://stackoverflow.com/users/1727416/will
    

    public static boolean checkUserNameValid(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    public static boolean checkPasswordComplex(String password) {

        boolean hasDigit = false;
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }

        }
        if (password.length() >= 8 && hasDigit && hasUppercase && hasLowercase) {
            return true;
        }

        return hasDigit && hasUppercase && hasLowercase;
    }


    
    public static String registerUser(String username, String password) {
        String result;
        boolean userNameValid = false;
        boolean passwordComplex = false;
        if (!checkUserNameValid(username)) {
            result= "Username is incorrectly formatted, Please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        else if (!checkPasswordComplex(password)) {
            result= "Password is not correctly formatted, Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        }
        else{
        result = "Both are successful";
        }
        
        return result;
    }
    
    //Code Attributes
    // I modified code from tutorialspoint
    //https://www.tutorialspoint.com/java-program-to-demonstrate-how-user-authentication-is-done#:~:text=equals()%20method%20of%20java,the%20corresponding%20message%20is%20displayed.
    //Pranay Arora
    //https://www.tutorialspoint.com/authors/pranay-arora
    

    public static boolean loginUser(String username, String password) {

        String Username = "jnr_123";
        String Password = "ST10367488@vc";

        boolean loginSuccessful = username.equals(Username) && password.equals(Password);

        if (loginSuccessful) {
            System.out.println("Verification successful!");
        } else {
            System.out.println("Verification failed.");
        }

        return loginSuccessful;
    }

    public static String returnLoginStatus(boolean loginStatus, String firstName, String lastName) {
        if (loginStatus) {
            return "welcome" + firstName + ", " + lastName + ", it is great to see you again.";
        } else {
            return "Username or Password incorrect, please try again.";
        }

    }
}
