//Given an integer x, return true if x is palindrome integer.
//
//        An integer is a palindrome when it reads the same backward as forward.
//
//        For example, 121 is a palindrome while 123 is not.
//
//
//        Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
//        Therefore it is not a palindrome.
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//
//        Constraints:
//
//        -231 <= x <= 231 - 1
//
//
//        Follow up: Could you solve it without converting the integer to a string?


public class PalidromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(121 % 10);
    }

    public static boolean isPalindrome(int x) {
        // Get the number to check for palidrome
        // hold the number in temporary variable
        // reverse the number
        // compare the temporary number with reversed number
        // if same return true
        // else return false

        int tempNum = x;
        int reversedNum = 0;
        int remainder;

        while (x != 0) {
            remainder = x % 10; //1
            reversedNum = reversedNum * 10 + remainder; //1
            x /= 10;
        }
        if (tempNum == reversedNum) {
            return true;
        } else {
            return false;
        }
    }
}
