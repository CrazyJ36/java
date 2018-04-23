public class staticVar {

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
       can be used in any method.*/

       System.out.println(a);
    }
}
