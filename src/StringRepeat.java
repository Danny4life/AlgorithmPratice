//Write a function that accepts an integer n and a string s as parameters, and returns a string of s
// repeated exactly n times.
//
//        Examples (input -> output)
//        6, "I"     -> "IIIIII"
//        5, "Hello" -> "HelloHelloHelloHelloHello"

public class StringRepeat {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(repeatStr(5, str));
    }

    public static String repeatStr(final int repeat, final String string) {



        return string.repeat(repeat);
    }
}

// use a loop
