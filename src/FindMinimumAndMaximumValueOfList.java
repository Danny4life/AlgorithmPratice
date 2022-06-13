//Your task is to make two functions (max and min, or maximum and minimum, etc.,
//        depending on the language) that receive a list of integers as input and return,
//        respectively, the largest and lowest number in that list.
//
//        Examples (Input -> Output)
//        * [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
//        * [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
//        * [42, 54, 65, 87, 0]             -> min = 0, max = 87
//        * [5]                             -> min = 5, max = 5
//        Notes
//        You may consider that there will not be any empty arrays/vectors.

// use a for loop to check through each number
// check if the number is largest return it if not pass
// check if the number is lowest return it if not pass

public class FindMinimumAndMaximumValueOfList {

    public static void main(String[] args) {
        int[] arr = {14,6,2,1,9,63,-134,566};

        System.out.println("Min = " + min(arr));
        System.out.println("Max = " + max(arr));
    }

    public static int min(int[] list) {
        int min = list[0];
        for(int i = 1; i < list.length; i++) {
            if (min > list[i]) {
                min = list[i];
            }
        }
        return min;
    }

    public static int max(int[] list) {

        int max = list[0];
        //int[] arr = {4,6,2,1,9,63,-134,566};

        for (int i = 1; i < list.length; i++) {
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }


}
