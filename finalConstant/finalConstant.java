public class finalConstant {

    /* declaring A variable 'final' makes it constant, immutable, unchangable,
       viewable to whole class. It can then be used in other
       methods inside main(). Do not reassign A final variable.
       Methods and classes can be marked final as well, so that methods
       can't be overridden, and so classes can't be made subclasses.*/

   // "preprocessed"
   final static String text = "hello";

    public static void main(String[] args) {
	System.out.println(text);
    }

}
