package DAY21_8825.oop3rd;
/*
 * Users.java
 * 
 * this is used by overloadedConstructors.java
 * 
 * This Class demonstrate a senario where an overloaded construtor might be used
 * 
*/
public class Users {
    String userName;
    String email;
    int age;

    // Constructor for no arguments
    public Users () {
        this.userName = "guess";
        this.email = "not provided";
        this.age = 0;
    }
    // Constructor for when an object passed only a username
    public Users (String userName) {
        this.userName = userName;
        this.email = "not provided";
        this.age = 0;
    }

    // Constructor for when an object passed a username and an email
    public Users (String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.age = 0;
    }

    // Constructor for when an object passed a username and an email and their age
    public Users (String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }
}
