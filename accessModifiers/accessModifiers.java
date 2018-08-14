class accessModifiers {
  /* 'public' is an access modifier,
     used to set the level of access. Access Modifiers can be used on
     classes, attributes, and methods.
     default(left blank) specifically makes this class, methods(functions), variables
     only accessible in this, my package.

     For classes, the available modifiers are public or default(package-private, left blank).
     public - The class is accessable by any other class.
     default - The class is accessible only by classes in the same package.

     For attributes and methods:
     default - A variable or method declared with no access control modifier is available to
     any other class in the same package.
     public - var or method is accessible from any other class
     protected - provides the same access as the default access modifier, with the addition that subclasses
     can access protected methods and variables of the superclass.
     private - accessible only within the declared class itself.

     It's best practice to keep the variables within a class private. They can then be accessed
     and modified using getters and setters.
     */

  // These two variable type definitions cannot be in main()(due to access level)
  // This is only accessible in this class
  private String someText;

  /* This variable can access protected methods and variables of the superclass(class above it,
     which only gets to accessModifiers in this case */
  protected int aNum;

  public static void main(String[] args) {

  }
}
