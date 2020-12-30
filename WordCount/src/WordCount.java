import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.print("Enter a filename: ");
        File file = new File(new Scanner(System.in).next());
        if (!file.exists()) {
            System.out.println(file + " doesn't exist");
            System.exit(1);
        }
        String buffer = "";
        int[] letterCount = new int[26];
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                buffer = input.nextLine();
                for (char ch : buffer.toCharArray()) {
                    ch = Character.toUpperCase(ch);
                    if (isLetter(ch)) {
                        letterCount[ch - 'A']++;
                    }
                }

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < letterCount.length; i++) {
            System.out.println("Number of "+(char)(i + 'A') + "'s : " + letterCount[i]);
        }
    }
    private static boolean isLetter(char ch) {

        return (ch >= 'A' && ch <= 'Z');
    }
}
