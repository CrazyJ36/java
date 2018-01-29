class calc {
public static void main(String args[]) {
    //if [arg1] = "/"://
    int n0 = 0;
    int n1 = 1;
    try {
        n0 = Integer.parseInt(args[0]);
        n1 = Integer.parseInt(args[1]);
    }
    catch (NumberFormatException nfe) {
        System.out.println("Only type Numbers");
        System.exit(1);
    }
        double div = ((double)n0) / n1;
        System.out.println(div);
        // A new n0 and n1 //
    }
}
