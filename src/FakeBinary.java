//Given a string of digits, you should replace any digit below 5 with '0'
//        and any digit 5 and above with '1'. Return the resulting string.
//
//        Note: input will never be an empty string
// "45385593107843568" => "01011110001100111"

// use charAt to get the char of each string
// use += to add/push to the end of a number after a loop
public class FakeBinary {
    public static String fakeBin(String numberString) {
        String res = "";
        for(int i = 0; i < numberString.length(); i++) {
            if(numberString.charAt(i) < '5') {
                res += "0";
            } else {
                res += "1";
            }
        }

            return res;
        }




    public static void main(String[] args) {
        System.out.println(fakeBin("456423100034"));
    }
}
