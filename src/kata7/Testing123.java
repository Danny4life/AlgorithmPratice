package kata7;

//Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
//
//        Write a function which takes a list of strings and returns each line prepended by the correct number.
//
//        The numbering starts at 1. The format is n: string. Notice the colon and space in between.
//
//        Examples: (Input --> Output)
//
//        [] --> []
//        ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]

// i will use a for loop
// i will need a number variable to increment and prepend the correct number to the string i.e add it to the front,
// numbering must start at 1
// then add colon and space in between number and string


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Testing123 {
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5"};
        System.out.println(number(List.of(arr)));

    }

    public static List<String> number(List<String> lines) {
        // TODO
        ArrayList<String> result = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < lines.size(); i++) {
           result.add(num++ + ": " + lines.get(i));

        }
        return result;
    }
}
