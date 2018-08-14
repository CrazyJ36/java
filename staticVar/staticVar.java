public class staticVar {
    // Class attribute
    private static String a = "Test";

    public static void main(String[] args) {
        useA();
        /* "b" is accessed in only this method*/
        String b = "Test2";
        System.out.println(b);

    }

    public static void useA() {
    /* Stating "a" as static makes it available
       to whole class, not just main(). So it
       can be used in any method. And A static method
       can be used in any class of the package.
       Also, A static method or variable means
       you would not have to create A (new) intance
       of the whole class containing the main method
       just to use the variable or method in the same
       file or package.*/

       System.out.println(a);
    }
}
