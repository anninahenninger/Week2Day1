/**
 * Create a class Person
 *
 *     As given through the live coding, with givenName and famillyName properties and corresponding get/set methods.
 *
 *     Create method getFullName() and call it on several Person objects. Improve your initial printing method to get
 *     some nice table-like formatting.
 *
 *     INTERMEDIATE: Improve this implementation! Learn in Internet about the String method toUpperCase( )
 *     and improve your getFullName, so it prints the person name in Format Givenname FAMILYNAME (like John DOE)
 */
public class A000 {

    public static void main(String[] args) {

            Person p1 = new Person();
            Person p2 = new Person();
            Person p3 = new Person();

            p1.setFullName("Simon", "Blaha");
            p2.setFullName("Annina", "Henninger");
            p3.setFullName("Klaus", "Kolumbus");

            System.out.println(p1.getFullName());
            System.out.println(p2.getFullName());
            System.out.println(p3.getFullName());


    }
}
