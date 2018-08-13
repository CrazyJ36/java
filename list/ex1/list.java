import java.util.Arrays;

class list {
    public static void main(String[] args) {
        // define attay[] name = new type[num elements] or {"items", "items"};
        //specifically this is an array literal(no new instantiation
        String[] stuff = { "one", "two", "three"}; // new string array of 3 strings named stuff
        // predefined with items already instead of desired number of elements
        // only predefine either number of items[] or items thereselfs, not both (illegal)

	/* use 'Arrays.toString()' to put whole list into one object */
        String stringList = Arrays.toString(stuff);
        System.out.println(stringList);
        System.out.println(stuff[1]); // print 2nd index item
    }
}
