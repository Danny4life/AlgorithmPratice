package kata7;
//You are given an array (which will have a length of at least 3,
// but could be very large) containing integers. The array is either
// entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
// Write a method that takes the array as an argument and returns this "outlier" N.
//
//        Examples
//        [2, 4, 0, 100, 4, 11, 2602, 36]
//        Should return: 11 (the only odd number)
//
//        [160, 3, 1719, 19, 11, 13, -21]
//        Should return: 160 (the only even number)

public class FindOutliers {
    public static void main(String[] args) {
        int []arr = {2, 4, 0, 100, 4, 11, 2602, 36};
        System.out.println(find(arr));
    }

    public static int find(int[] integers) {
        int odd = 0;
        int even = 0;
        int cycle = 0;

        for (Integer value : integers) {
            if (value % 2 == 0) {
                cycle++;
                even = value;
            } else {
                odd = value;
            }
        }
        return (cycle > 1) ? odd : even;

    }

    }



