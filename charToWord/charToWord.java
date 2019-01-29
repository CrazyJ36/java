import java.util.Scanner;

public class charToWord {
    public static void main(String[] args) {
        char ch[] = {'a','b','c','d','e','f',
            'g','h','i','j','k','l','m',
            'n','o','p','q','r','s','t',
            'u','v','w','x','y','z'};
        System.out.println("Type A character a-z,\n I'll give A word that starts with what you entered.");
        Scanner input = new Scanner(System.in);
        String in = input.next();
        input.close();
        // count letters
        int count = 0;
        for (int num = 0; num < ch.length; num++) {
            count = count + 1;
        }
        System.out.println(count);
        System.exit(0);
    }
    public static void fillCharToWord(String in) {
        
    }
}
