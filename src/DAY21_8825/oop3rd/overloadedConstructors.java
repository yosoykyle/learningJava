package DAY21_8825.oop3rd;
/*
 * overloadedConstructors.java
 * 
 * This allow class to have multiple construcotrs
 * with different parameter list
 * 
 * Enanble object to be initialized in various ways
 * 
 * why is this used
 * 
 * why is this useful provide some scenarios
 * 
 * notes
 * 
 * in this program this will use a **Class.java** to demonstrate the concept
*/
public class overloadedConstructors {
    public static void main(String[] args) {
        /*
         * With overloaded contractors, we can objects with 
         * varying number arguments
        */
        Users user1 = new Users("kyle");
        Users user2 = new Users("elyk", "elyk@gmail.com");
        Users user3 = new Users("seti", "seti@gmail.com", 20);
        Users user4 = new Users();

        System.out.println("user1");
        System.out.println(user1.userName);
        System.out.println(user1.age);
        System.out.println(user1.email);

        System.out.println();

        System.out.println("user2");
        System.out.println(user2.userName);
        System.out.println(user2.age);
        System.out.println(user2.email);

        System.out.println();

        System.out.println("user3");
        System.out.println(user3.userName);
        System.out.println(user3.age);
        System.out.println(user3.email);

        System.out.println();

        System.out.println("user4");
        System.out.println(user4.userName);
        System.out.println(user4.age);
        System.out.println(user4.email);
    }
}
