/* This example demonstrates what happens when
no access modifier is defined for the class file.
(line 1, class Name {})
Java then defaults to the default class access level:
package-private,
Making the class visible to only its own package.
Similar to non-open-source, this make this particular
programs functionality(classes, attributes, and methods)
not available to add or usein other
packages with 'javac --classpath'.

No modifier defined or package private =
granted access level: class, package
denied access: subclasses, world
*/
class AcessLevelModifiers {
    public static void main(String[] args) {
        System.out.println("public ran");
    }
}
