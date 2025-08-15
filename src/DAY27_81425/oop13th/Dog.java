package DAY27_81425.oop13th;

/*
 * Dog.java
 * 
 * Concrete subclass of Animal that represents a dog.
 * Implements the abstract method speak() with dog-specific behavior.
 */
public class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("*The dog goes woof!*");
    }
}
