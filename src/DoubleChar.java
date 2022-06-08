//Given a string, you have to return a string in which each character (case-sensitive) is repeated once.
//
//        Examples (Input -> Output):
//        * "String"      -> "SSttrriinngg"
//        * "Hello World" -> "HHeelllloo  WWoorrlldd"
//        * "1234!_ "     -> "11223344!!__  "


public class DoubleChar {
    public static String doubleChar(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            newString += s.substring(i, i + 1) + s.substring(i, i + 1);
        }

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
}
