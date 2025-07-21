package DAY4_72125;

/*
 * The Math class in Java provides methods for performing basic numeric operations such as
 * exponentiation, logarithms, square roots, and trigonometric functions.
 * It is part of the java.lang package and provides a wide range of mathematical functions.
*/
public class MathClass {
    public static void main(String[] args) {
        // When you need the value of pi there is a built-in constant in the Math class.
        double pi = Math.PI; // This is a constant value of pi.
        System.out.println("\nValue of pi: " + pi);

        // There's also Euler's number (e) which is the base of the natural logarithm.
        double e = Math.E; // This is a constant value of e.
        System.out.println("\nValue of e: " + e);

        // Raise a number to a power using Math.pow(base, exponent)
        double base = 2.0;
        double exponent = 3.0;
        double power = Math.pow(base, exponent); 
        System.out.println("\n" + base + " raised to the power of " + exponent + " is: " + power);

        /*
         * Calculating absolute value using Math.abs(value)
         * Absolute value is the non-negative value of a number without regard to its
         * sign.
         * For example, the absolute value of -10 is 10.
         */
        int negativeNumber = -10;
        int absoluteValue = Math.abs(negativeNumber);
        System.out.println("\nAbsolute value of " + negativeNumber + " is: " + absoluteValue);

        // Calculate the square root of a number using Math.sqrt(value)
        double number = 16.0; 
        double squareRoot = Math.sqrt(number);
        System.out.println("\nSquare root of " + number + " is: " + squareRoot);

        /*
         * Rounding numbers using Math.round(value): use for general rounding
         * Math.round(value) rounds to the nearest whole number.
         *  Math.round(double) returns long, so we store it in a long variable
         */
        double valueToRound = 3.99; 
        long roundedValue = Math.round(valueToRound);
        System.out.println("\nRounded value of " + valueToRound + " is: " + roundedValue);

        /*
         * Ceiling method using Math.ceil(value)
         * Math.ceil(value) always rounds up (e.g., 3.1 → 4.0).
         * Math.round(value) rounds to the nearest whole number (e.g., 3.1 → 3, 3.6 →
         * 4).
         */
        double valueToCeil = 3.99; 
        double ceilingValue = Math.ceil(valueToCeil);
        System.out.println("\nCeiling value of " + valueToCeil + " is: " + ceilingValue);

        /*
         * Floor method using Math.floor(value)
         * Math.floor(value) always rounds down (e.g., 3.9 → 3.0).
         * Math.round(value) rounds to the nearest whole number (e.g., 3.9 → 4, 3.1 →
         * 3).
         */
        double valueToFloor = 3.99; 
        double floorValue = Math.floor(valueToFloor);
        System.out.println("\nFloor value of " + valueToFloor + " is: " + floorValue);

        /*
         * Max between two numbers using Math.max(value1, value2)
         * Math.max(value1, value2) returns the larger of the two values.
         */
        double value1 = 5.5;
        double value2 = 10.2;
        double maxValue = Math.max(value1, value2);
        System.out.println("\nMax value between " + value1 + " and " + value2 + " is: " + maxValue);
        /*
         * Min between two numbers using Math.min(value1, value2)
         * Math.min(value1, value2) returns the smaller of the two values.
         */
        double minValue = Math.min(value1, value2);
        System.out.println("\nMin value between " + value1 + " and " + value2 + " is: " + minValue);

        /*
         * Trigonometric functions using Math.sin(angle), Math.cos(angle), Math.tan(angle)
         * These functions take an angle in radians and return the sine, cosine, and tangent of the angle.
         */
        double angle = Math.toRadians(30); // Convert degrees to radians
        double sinValue = Math.sin(angle);
        double cosValue = Math.cos(angle);
        double tanValue = Math.tan(angle);
        System.out.println("\nTrigonometric values for 30 degrees:");
        System.out.println("Sine: " + sinValue);
        System.out.println("Cosine: " + cosValue);
        System.out.println("Tangent: " + tanValue);
    }
}
