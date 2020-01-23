/* This demonstrates the use of java.util.ArrayList
   and it's usability when used to manage lists.
*/

import java.util.ArrayList;

public class arrayListsUsage {
    public static void main(String[] args) {

        System.out.println("Making an ArrayList with:\n"
            + "ArrayList list = new ArrayList();\n"
            + "\nThis doesn't include A <ClassType>, and compiler gives\n"
            + "unchecked types warnings but the list types, which can\n"
            + "be any, are still known and code will work.\n");

        ArrayList list = new ArrayList();

        System.out.println("Adding string, string, int to list using ArrayList.add()\n");
        list.add("one");
        list.add("two");
        list.add(1);

        System.out.println("Printing list\n");
        System.out.println(list);

        System.out.println("\nMaking new ArrayList with:\n"
            + "ArrayList<Double> list2 = new ArrayList<Double>();\n");

        ArrayList<Double> list2 = new ArrayList<Double>();

        System.out.println("Adding two Doubles to list2\n");
        list2.add(1.5);
        list2.add(2.1);

        System.out.println("Printing list2");
        System.out.println(list2);

        System.out.println("\nRemoving second item from list2, with item value:\n"
            + "list2.remove(2.1)");
        list2.remove(2.1);

        System.out.println("\nPrinting list2");
        System.out.println(list2);

        System.out.println("\nYou can't use item index positions with ArrayList,\n"
            + "use .add() or .remove()");

        System.out.println("Done. Exiting");
        System.exit(0);
    }
}
