package DAY7_72425;

/*
* A ternary operator is a shorthand way of writing an if-else statement. 
* It takes three operands and returns a value based on a condition.
* It is used to simplify code and make it more readable. 
* 
* ternary operator ? = return 1 of 2 values if a condition is true or false
* variable = (condition) ? valueIfTrue : valueIfFalse;
*/
public class ternaryOperator 
{
    public static void main(String[] args) 
    {
        int score, checkScore, number,hours, income;
        double taxRate;
        score = 70;
        checkScore = 60;
        number = 5;
        hours = 13; // Military time format
        income = 30000;

        String separator, result, parity, timeOfDayString;
        separator = "=".repeat(35);

        // PASS OR FAIL
        // Using if-else statement
        System.out.println(separator);
        System.out.println(score + " is the score");
        System.out.println(separator);
        
        System.out.print("Using if-else statement: ");
        if (score >= checkScore) 
        {
            System.out.println("You passed");
        } 
        else 
        {
            System.out.println("You failed");
        } 
       
        System.out.println(separator);
        
        System.out.print("Using ternary operator: ");
        // Using ternary operator
        result = (score >= checkScore) ? "You passed" : "You failed";
        System.out.println(result);
        
        System.out.println(separator);
        
        System.out.println(number + " is the number");
       
        System.out.println(separator);
        
        // EVERN OR ODD
        // Using if-else statement
        System.out.print("Using if-else statement: ");
        if (number % 2 == 0) 
        {
            System.out.println("Even");
        } 
        else 
        {
            System.out.println("Odd");
        }
        System.out.println(separator);
        
        // Using ternary operator
        System.out.print("Using ternary operator: ");
        parity = (number % 2 == 0 ) ? "Even":"Odd";
        System.out.println(parity);
        
        System.out.println(separator);
        
        System.out.println(hours + " is the hours");
       
        System.out.println(separator);

        // TIME OF DAY AM OR PM
        // Using if-else statement
        System.out.print("Using if-else statement: ");
        if (hours < 12) 
        {
            System.out.printf("%d A.M.%n", hours);
        } 
        else 
        {
            System.out.printf("%d P.M.%n", hours);
        }
        System.out.println(separator);
        // Using ternary operator
        System.out.print("Using ternary operator: ");
        timeOfDayString = (hours < 12) ? String.format("%d A.M.%n", hours) : String.format("%d P.M.%n", hours);
        System.out.print(timeOfDayString);
        System.out.println(separator);
        
        // TAX RATE
        System.out.println(income + " is the income");
        System.out.print("Using ternary operator: ");
        taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.printf("Tax rate is %.2f%n", taxRate);       
    }
}
