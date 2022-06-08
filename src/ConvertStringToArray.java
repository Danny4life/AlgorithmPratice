//Write a function to split a string and convert it into an array of words.
//
//        Examples (Input ==> Output):
//        "Robin Singh" ==> ["Robin", "Singh"]
//
//        "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

//SOLUTION
public class ConvertStringToArray {
       public static String[] stringToArray(String s) {

           return s.split(" ");
    }


    public static void main(String[] args) {


        System.out.println(stringToArray("Robin Singh"));





    }
}