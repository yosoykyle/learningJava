package DAY27_81425.oop13th;

/*
 * Cat.java
 * 
 * Concrete subclass of Animal that represents a cat.
 * Implements the abstract method speak() with cat-specific behavior.
 */
public class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("*The cat goes meow!*");
    }
}
