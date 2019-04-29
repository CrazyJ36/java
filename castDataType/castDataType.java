public class castDataType {
     public static void main(String args[]) {
         System.out.println("Covert double to string as:\ndouble x = (int) 5;");
         // (going to be double) x = (is int) 5
         double x = (int) 5; // or double x = (double) 5; // or int(5) as int can already be double
         System.out.print("output: ");
         System.out.print(x+"\n");

         System.out.println("Convert int to String as: Integer.toString(my_int);\n");
         int y = 4;
         String yAsStr = Integer.toString(y);
         System.out.println(yAsStr + "\n");
         System.exit(0);
     }
}
