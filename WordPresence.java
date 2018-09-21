public class WordPresence {
    public static void main(String[] args) {
        boolean contains = false;

        /*Inputting the sentence*/
        java.util.Scanner scn = new java.util.Scanner(System.in);

        System.out.println("Input the sentence");
        String s = scn.nextLine();
        String[] lstarr = s.split(" ");

        /*Inputting the string*/
        java.util.Scanner scn2 = new java.util.Scanner(System.in);

        System.out.println("Input the word to be searched");
        String s2 = scn.nextLine();
        String[] explst = s2.split(" ");

        /*searching the input word */
        if(s.contains(s2)){
            contains = true;
            System.out.println("is " + s2 +" here? True");
        }

        else{

            System.out.println("is " + s2 + " here? False");
        }
    }
}

