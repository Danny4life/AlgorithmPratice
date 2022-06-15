package kata7;

//Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
// for the development and functioning of living organisms.
//
//        If you want to know more: http://en.wikipedia.org/wiki/DNA
//
//        In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
//        Your function receives one side of the DNA (string, except for Haskell);
//        you need to return the other complementary side. DNA strand is never empty or there is no DNA at all
//        (again, except for Haskell).
//
//        More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)
//
//        Example: (input --> output)
//
//        "ATTGC" --> "TAACG"
//        "GTAT" --> "CATA"

public class ComplementaryDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("TAACG"));
    }

    public static String makeComplement(String dna) {
        //Your code
        char[] chars = dna.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getCompliment(chars[i]);
        }

        return new String(chars);
    }

    private static char getCompliment(char c) {
        switch (c) {
            case 'A' : return 'T';
            case 'T' : return 'A';
            case 'C' : return 'G';
            case 'G' : return 'C';
        }
        return c;
    }
}
