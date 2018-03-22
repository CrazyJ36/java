import java.util.Arrays;
class list {
    public static void main(String[] args) {
        String[] stuff = new String[] { "one", "two", "three" };
	/* must use 'Arrays.toString()' or a wierd coding
	 for 'arrays as an object', not actual text, will print. */
        String stringList = Arrays.toString(stuff);
        System.out.println(stringList);
    }
}
