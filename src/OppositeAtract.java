//Timmy & Sarah think they are in love, but around where they live, they will only know once they pick
// a flower each.
//        If one of the flowers has an even number of petals and the other has an odd number of petals it means
//        they are in love.
//
//        Write a function that will take the number of petals of each flower and return true if they are in love
//        and false if they aren't.

public class OppositeAtract {
    public static void main(String[] args) {
        System.out.println(isLove(0, 1));
    }

    public static boolean isLove(final int flower1, final int flower2) {

        if (flower1 % 2 == 1 && flower2 % 2 == 0) {
            return true;
        } else if (flower1 % 2 == 0 && flower2 % 2 == 1){
            return true;
        } else if (flower1 % 2 == 0 && flower2 % 2 == 0) {
            return false;
        } else if (flower1 % 2 == 1 && flower2 % 2 == 1) {
            return false;
        } else {
            return false;
        }
    }
}
