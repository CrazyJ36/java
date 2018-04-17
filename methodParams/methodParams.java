public class methodParams {
    public static void main(String[] args) {
	sayHello("you");
	sayHello("me");
        twoParams("text", 2);
    }
    public static void sayHello(String name) {
	System.out.println("Hello" + name);
    }
    public static void twoParams(String txt, int num) {
	System.out.println(txt +  num);
    }
}
