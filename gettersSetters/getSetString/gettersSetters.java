public class gettersSetters {

  /* Using getters and setters protects your data(code).
     Particularly when creating classes.

     For each method in the file, the get() method returns it's value,
     making the methods values usable elsewhere(in other methods of the same class, etc..).
     The set() method sets the values(eg. change a value in this class file from other classes).

     getters/setter methods start with get, followed be variable name, with the first
     letter of the variable name capitalized. eg. getMyVar(), setMyVar2.
  */

  // private to this class, not package, nor other files.
  // static(available) to whole file, so 'name' can be used in get, set methods.
  private static String name = "text";

  public static void main(String[] args) {
    // get variable
    System.out.println(name);  // from variable
    System.out.println(getString());  // returned from getName()
    gettersSetters.setString("New Text");
    System.out.println(name); // get name after set using original name, newName is A "dangling",
   // unused variable in this case, only used during setString operation.
  }
  public static String getString() {
    // return value of name
    return name;
  }
  public static void setString(String newName) {
    // init new variable, assigns value to name.
    gettersSetters.name = newName; // 'this' was not available to use here because it was static...
    // rule: if you can't use 'this', use class name.
    // 'this' refers to current object this.name is the name attribute of current object.

  }

}
