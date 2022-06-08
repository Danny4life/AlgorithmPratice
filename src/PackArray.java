//Given an array of 2k integers (for some integer k, which will be betwen 0 and 5 inclusive),
// perform the following operations until the array contains only one element:
//
//        On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
//        On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
//        After the algorithm has finished, there will be a single element left in the array. Return that element.
//
//        Specification
//        Challenge.packArray(arr)
//        Parameters
//        arr: Integer[] - An array of integers to be packed
//
//        Return Value
//        Integer - The final product
//
//        Constraints
//        arr.length == 2k
//
//        0 ≤ k ≤ 5
//
//        -9 ≤ arr[i] ≤ 99
//
//        Example
//        For arr = [1, 2, 3, 4, 5, 6, 7, 8], the output should be 186.
//
//        We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.
// [3,7,11,15] [21, 165] [186].

public class PackArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(arr);
    }

    public static long packArray(int[] arr) {

        int iteration = 1;

        while (arr.length > 1) {
            int[] res = new int[arr.length / 2];
            if (iteration % 2 == 1) {
                int pos = 0;
                for (int i = 0; i < arr.length; i += 2) {
                    res[pos] = arr[i] + arr[i + 1];
                    pos++;
                }
                arr = res;
            } else {
                int pos = 0;
                for (int i = 0; i < arr.length; i += 2) {
                    res[pos] = arr[i] * arr[i + 1];
                    pos++;

                }
                arr= res;



            }
            iteration++;

        }
        return arr[0];
    }
}





//    public static long packArr(int[] arr){
//        int iteration = 1;
//        while(arr.length > 1){
//            int [] res = new int[arr.length/2];
//            if(iteration % 2 == 1){
//                //for odd
//                int pos = 0;
//                for(int i = 0; i < arr.length; i+=2){
//                    res[pos] = arr[i] + arr[i+1];
//                    pos++;
//                }
//                arr = res;
//            }else{
//                //for even
//                int pos = 0;
//                for(int i = 0; i < arr.length; i+=2){
//                    res[pos] = arr[i] * arr[i+1];
//                    pos++;
//                }
//                arr = res;
//            }
//            iteration++;
//        }
//
//        return arr[0];
