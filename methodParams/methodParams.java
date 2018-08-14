public class methodParams {
    public static void main(String[] args) {
        // Running the below methods with custom parameter arguements(Can be anything)
	sayHello("you");
	sayHello("me");
        twoParams("text", 2);
    }
    /* new method with A parameter argument as (String name). When using this method,
       it must be run with A string parameter. */
    public static void sayHello(String name) {
	System.out.println("Hello" + name);
    }
    // Another method with two parameter arguments
    public static void twoParams(String txt, int num) {
	System.out.println(txt +  num);
    }
}
