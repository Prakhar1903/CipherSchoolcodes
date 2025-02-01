import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        String longestWord = "";
        int maxLength = 0;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }

        System.out.println("Longest word: " + longestWord);

        sc.close();
    }
}
