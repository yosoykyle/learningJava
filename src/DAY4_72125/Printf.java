package DAY4_72125;

/*
* printf is a method in Java used to print formatted output to the console.
* It allows you to control the appearance of the output by specifying format specifiers.
* 
* printf ();
* %[flags][width][.precision][specifier-character]
* Whenever you need to insert a variable use: 
* %s for strings, 
* %d for integers, 
* %f for floating-point numbers 
* %c for character
* %b for boolean
* %n for newline (platform-indipendent)
*/

public class Printf {
    public static void main(String[] args) {
        String name = "Spongebob";
        char initial = 'S';
        int age = 20;
        double height = 60.5;
        boolean isEmployed = true;

        /*
         * With the printf statement, you need to manually insert the newline character
         * (\n or %n) at the end of the string.
         * The %n is a platform-independent newline character, which is preferred over
         * \n for portability.
         */

        // Using printf to format the output
        System.out.printf("Hello, %s! With an initial of '%c' %n", name, initial, isEmployed);
        System.out.printf("with age of %d, and a height of %.1f inch.%n", age, height);
        System.out.printf("Is employed: %b%n", isEmployed);

        /*
         * precision is used to control or to limit the number of digits after the
         * decimal point for floating-point numbers.
         */
        // precision example
        double price1, price2, price3;
        price1 = 9.90;
        price2 = 19.990;
        price3 = 29.9990;

        System.out.printf("Price 1: %.2f%n", price1);
        System.out.printf("Price 2: %.3f%n", price2);
        System.out.printf("Price 3: %.4f%n", price3);

        /*
         * width is used to control the minimum number of characters to be printed.
         * If the value has fewer characters than the specified width, it will be
         * padded with spaces.
         */
        String greetings = "Hello!";
        int userId = 5953;
        System.out.printf("output: |%10s|%n", greetings); //number only: space as padding
        System.out.printf("output: |%010d|%n", userId);
        // %10 is the width
        int id1, id2, id3, id4, id5;
        id1 = 9;
        id2 = 90;
        id3 = 990;
        id4 = 9990;
        id5 = 99990;
        //zero as padding
        System.out.printf("%n|%05d|%n", id1);
        System.out.printf("|%05d|%n", id2);
        System.out.printf("|%05d|%n", id3);
        System.out.printf("|%05d|%n", id4);
        System.out.printf("|%05d|%n", id5);

        //- as padding
        System.out.printf("%n|%-5d|%n", id1);
        System.out.printf("|%-5d|%n", id2);
        System.out.printf("|%-5d|%n", id3);
        System.out.printf("|%-5d|%n", id4);
        System.out.printf("|%-5d|%n", id5);

        /*
         * flags
         * 
         * + = output a plus
         * , = comma grouping separator
         * ( = negative numbers are enclosed in ()
         * space = display a minus if negative, soace if positive
         */
        double price4, price5, price6, price7, price8;
        price4 = -9.90;
        price5 = 19000.990;
        price6 = -29.9990;
        price7 = 39.99990;
        price8 = -49.999990;

        System.out.printf("%nPrice 4: %+.2f%n", price4); // adds + sign on positive values
        System.out.printf("Price 5: %,.3f%n", price5); // comma grouping separator for any Ks place
        System.out.printf("Price 6: %(.4f%n", price6); // left parentheses, negative numbers appear in ( ) instead of using a minus sign
        System.out.printf("Price 7: % .5f%n", price7); // space, postive are preceded with a space
        System.out.printf("Price 8: % .6f%n", price8); // space, nagetive are preceded with a - sign
    }
}
