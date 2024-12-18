
import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String sentence;

        System.out.print("Input some sentence : ");

        while (true) {
            sentence = kb.nextLine();

            if (sentence.endsWith(".")) {
                break;
            } else {
                System.out.print("The sentence must end with full stop point : ");
            }
        }

        System.out.println(); 
        String[] words = sentence.split(" "); 
        for (String word : words) {
            System.out.println(word);
        }

        kb.close();
    }
}