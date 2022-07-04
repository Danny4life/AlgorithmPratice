//Implement String#digit? (in Java StringUtils.isDigit(String)), which should return true if
//        given object is a digit (0-9), false otherwise.


public class RegexPBasic {
    public static void main(String[] args) {

        System.out.println(isDigit("9"));
    }

    public static boolean isDigit(String s) {
        // your code goes here
        return s.matches("[0-9]");
    }
}
