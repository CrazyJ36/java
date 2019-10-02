import java.util.Scanner;

public class printArrayIndexForDifferentTypeInput {
    public static void main(String args[]) {
        String l[] = {"zero", "one", "two", "three", "four", "five"};
        String inst = "Only enter A number 1 through 6. Ten chances.";
        System.out.println(inst);
;
        Scanner scan = new Scanner(System.in);
        String y = "";
        int x;
        for (int i = 0; i < 10; i++) {
            x = 10;
            try {
                x = scan.nextInt(); // get next integer entered.
            } catch (java.util.InputMismatchException inputMis) {
                System.out.println(inst);
                System.exit(1);
            }
            if (x == 1) y = l[0];
            if (x == 2) y = l[1];
            if (x == 3) y = l[2];
            if (x == 4) y = l[3];
            if (x == 5) y = l[4];
            if (x == 6) y = l[5];

            if (x == 0 || x > 6 ) {
                System.out.println(inst);
                System.exit(1);
            }

            System.out.println(y);
        }

        System.out.println("Done.");
        System.exit(0);
    }

}
