public class changeVar {
	public static void main(String [] args) {
		System.out.println("the first time a variable is initialized, type shoud be set, like: int x = 1;");
		int x = 1;
		System.out.println("int x = " + x);
		System.out.println("when changing the same variable name, the type doesn't need to be");
		System.out.println("declared, as that would throw an \"already defined\" type error anyway");
		System.out.println("so now typing: int x = 2;\nshows error: variable x is already defined in method main");
		// int x = 2;
		x = 2;
		System.out.println("but typing: x = 2; is allowed as were simple changing the value of an already defined int\n" + x);
	}
}