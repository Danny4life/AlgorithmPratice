//Implement a function which convert the given boolean value into its string representation.
//
//        Note: Only valid inputs will be given.

public class ConvertBooleanToString {
    public static void main(String[] args) {
        System.out.println(convert(false));
    }

    public static String convert(boolean b) {
        String str = Boolean.toString(b);


        return str;
    }
}
