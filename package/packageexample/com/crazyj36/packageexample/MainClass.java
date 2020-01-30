/* This project shows how to use one of your classes in A main class. */

package com.crazyj36.packageexample;

/* You could import the MainClass1, then use it's methods, though this is not needed as it's found in the package. */
// import com.crazyj36.packageexample.MyClass1;

/* If you want to use classes that are not in you package, or in another directory,
   just import them compile your program that uses them by telling javac where those classes are
   by the --classpath flag when compiling with javac.
*/

class MainClass {
    public static void main(String args[]) {
        System.out.println("MainClass().main()");

        MyClass1.print();

        /* Instead of using importing of MyClass1 like above, you could call it by instantiating it's constructor. */
        // MyClass1 myClass1 = new MyClass1();
        // myClass1.print();
    }
}
