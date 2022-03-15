import java.util.Scanner;

public class PasswordComplexity {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String userPassword = scanner.nextLine();
        System.out.println("Is the password entered("+userPassword+") complex? "+isPasswordCompex(userPassword));
    }

    public static boolean isPasswordCompex(String password){

        if(password.length() < 6) return false;

        boolean hasLowerCaseLetter = false;
        boolean hasUpperCaseLetter = false;
        boolean hasNumber = false;

        for(int i=0; i<password.length() || (!hasLowerCaseLetter && !hasUpperCaseLetter && !hasNumber); i++){

            char currentChar = password.charAt(i);

            if(Character.isDigit(currentChar)){
                hasNumber = true;
            }else if(Character.isLowerCase(currentChar)){
                hasLowerCaseLetter = true;
            }else if(Character.isUpperCase(currentChar)){
                hasUpperCaseLetter = true;
            }
        }

        return hasNumber && hasLowerCaseLetter && hasUpperCaseLetter;
    }

    public static boolean isPasswordCompexOptimized(String password){

        return password.length() >= 6 &&
                password.matches(".*\\d.*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }
}
