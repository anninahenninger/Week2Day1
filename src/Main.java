public class Main {

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
