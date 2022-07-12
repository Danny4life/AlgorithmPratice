//Complete the function which converts a binary number (given as a string) to a decimal number.



public class ConvertBinToDecimal {
    public static void main(String[] args) {
        System.out.println(binToDecimal("1001001"));
    }

    public static int binToDecimal(String inp){
        // your code here
        int decimal = Integer.parseInt(inp, 2);
        return decimal ;

    }
}
