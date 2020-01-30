public class multipleClassesOneFile {
    public static void main(String[] args) {
        System.out.println("This string is from multipleClassesOneFile.main()\n");
        new anotherClass().myMessage();
    }
}

class anotherClass {
    public void myMessage() {
	    System.out.println("This string is from anotherClass.class, defined in the same file as\n"
	        + "multipleClassesOneFile.class, but javac still compiles the as it's own class.\n"
	        + "since only one class per file can be public, multipleClassesOneFile is public.\n"
	        + "This method may prove it difficult later to find and edit the source for A class\n"
	        + "if A class is defined inside another .java file.");
    }
}
