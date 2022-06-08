public class Algorithm {
 //   KATA 8.1
//    Note: This kata is inspired by Convert a Number to a String!. Try that one too.
//
//    Description
//    We need a function that can transform a string into a number. What ways of achieving this do you know?
//
//    Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
//
//    Examples
//"1234" --> 1234
//        "605"  --> 605
//        "1405" --> 1405
//        "-7" --> -7

    //SOLUTION

    public class StringToNumber {
        public static int stringToNumber(String str) {
            //TODO: Convert str into a number

            int result = Integer.parseInt(str);

            return result;
        }
    }

    // KATA 8.2

//    Given an array of integers.
//
//    Return an array, where the first element is the count of positives numbers and the second element is
//    sum of negative numbers. 0 is neither positive nor negative.
//
//    If the input is an empty array or is null, return an empty array.
//
//            Example
//    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

    //SOLUTION

    public class Kata
    {
        public static int[] countPositivesSumNegatives(int[] input)

        {
            if (input == null || input.length == 0) return new int[] {};

            int count = 0;
            int sum = 0;

            for (int i : input) {
                if (i > 0) {
                    count++;
                }

                if (i < 0) {
                    sum += i;
                }
            }

            return new int[] {count, sum};


        }


    }


    // KATA 3
//    The code provided is supposed replace all the dots . in the specified String str with dashes -
//
//    But it's not working properly.
//
//    Task
//    Fix the bug so we can all go home early.
//
//    Notes
//    String str will never be null.

    // SOLUTION
    public class Dinglemouse {

        public static String replaceDots(final String str) {

            return str.replace(".", "-");
        }

    }

    //KATA 4

//    Complete the function that calculates the area of the red square, when the length of
//    the circular arc A is given as the input. Return the result rounded to two decimals.
//
//            Graph
//
//    Note: use the π value provided in your language (Math::PI, M_PI, math.pi, etc)

    //SOLUTION

    public class Geometry{
        public static double squareArea(double A){
            //your code;
            // find length of circular arc
            double l = (2 * A) / Math.PI;
            // calculate area of square
            double x = l * l;
            // round to two decimal place
            double y = Math.round(x * 100) * 0.01d;

            return y;

        }
    }


    //KATE 5

//    Create a function that takes an integer as an argument and returns
//    "Even" for even numbers or "Odd" for odd numbers.

    public class EvenOrOdd {
        public static String even_or_odd(int number) {
            //Place code here
            //return Even for even numbers
            //return Odd for odd numbers

            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }

        }
    }


}
