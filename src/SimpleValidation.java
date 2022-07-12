//Write a simple regex to validate a username. Allowed characters are:
//
//        lowercase letters,
//        numbers,
//        underscore
//        Length should be between 4 and 16 characters (both included).
//


public class SimpleValidation {
    public static void main(String[] args) {
        System.out.println(validateUsr("regh"));
    }

    public static boolean validateUsr(String s) {
        //glhf:)


       return s.matches("[a-z_\\d]{4,16}");

    }
}
