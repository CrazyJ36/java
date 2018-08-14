public class useClass {
    public static void main(String[] args) {
        /* myClass objOrMyClassAsName = new myClass();
           when writing like above, you can see that myClass() is considered a type,
           and objOrMyClassAsName is a object.
           Thus making obvious that:
           'myClass.doStuff();'
           uses the same algorithm as:
           'int x;'
           where in 'int x = 1', 1 is 'int x's method.
        */
	myClass.main(args); // must use at least (args) as parameter to run a classes main()
        myClass.doStuff();
	myClass.doMoreStuff();
    }
}
