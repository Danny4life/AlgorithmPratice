//Your task is to find the nearest square number, nearest_sq(n), of a positive integer n.
//
//        Goodluck :)
//
//        Check my other katas:
//
//        Alphabetically ordered
//
//        Case-sensitive!
//
//        Not prime numbers


public class FindNearestSquareNumber {
    public static void main(String[] args) {
        System.out.println(nearestSq(111));
    }

    public static int nearestSq(final int n) {
       int base = (int) Math.round(Math.sqrt(n));
        return base * base;
   }
}
