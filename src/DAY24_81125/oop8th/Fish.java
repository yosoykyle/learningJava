package DAY24_81125.oop8th;

/*
 * Fish.java
 * 
 * Subclass of Animal that overrides the `move()` method.
 * 
 * Why use `@Override` annotation?
 *    - Makes it clear to other developers that the method 
 *      is replacing the parent's implementation.
 *    - Helps catch typos or mismatches — for example, if 
 *      you wrote `moves()` instead of `move()`, the compiler 
 *      would throw an error.
 */
public class Fish extends Animal {

    @Override
    void move() {
        System.out.println("This animal is swimming!");
    }
}
