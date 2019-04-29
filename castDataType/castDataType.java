public class castDataType {
     public static void main(String args[]) {

         /* Double (though double is normally fraction):
            (going to be double) x = (is int) 5
            or double x = (double) 5;
            or int(5) as int can already be double */
         System.out.println("Covert double to string"
             + " by cast as:\ndouble x = (int) 5;");

         double x = (int) 5;
         System.out.println("output: " + x + "\n");

         /* Integer: */
         System.out.println("Convert int to String as:\n"
             + "Integer.toString(4);");

         int y = 4;
         String yAsStr = Integer.toString(y);
         System.out.println("output: " + yAsStr);
         System.exit(0);
     }
}
