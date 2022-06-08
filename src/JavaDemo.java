import java.util.Scanner;

public class JavaDemo {

    public static void main(String[] args) {
        int [] num = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i : num) {
            num[i] = in.nextInt();
        }

        for(int i : num) {
            System.out.println(num[i] + "");
        }
    }
}
