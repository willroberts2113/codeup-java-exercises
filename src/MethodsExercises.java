package solved_exercises;

import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println(addition(3, 2));
//        System.out.println(subtraction(3, 2));
//        System.out.println(division(3, 0));
//        System.out.println(multiplication(3, 2));
//        System.out.println(multiplyByAdd(5, 5));
//        System.out.println(mod(3, 2));

//        System.out.println(getInteger(1, 10));
//        boolean continueRunningApp = true;
//        do {
//            System.out.println(factorial(getInteger(1, 23)));
//            continueRunningApp = userContinue();
//
//        } while (continueRunningApp);

        rollDice(getSidesOfDice());


    }


    public static int addition (int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static double division(double x, double y) {
        if (x == 0 || y ==0) {
            System.out.println("You can't divide with zero!");
            return 0;
        }
        return x / y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int mod (int x, int y) {
        return x % y;
    }

    public static int multiplyByAdd (int x, int y) {

//        int sum = 0;
//        for (int i = 1; i <= y; i++) {
//            sum += x;
//        }
//        return sum;

//        RECURSIVE EXAMPLE

//        HOW TO STOP
        if (x == 0 || y == 0) {
            return 0;
        }

//        HOW TO PROCEED
        return (x + multiplyByAdd(x, y - 1));
    }

    public static int getInteger(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max + ":");
        int userInput = sc.nextInt();
        if (userInput < min || userInput > max) {
            System.out.println("That's outside the range!");
            return getInteger(min, max);
        }
        return userInput;
    }

    public static long factorial(int n) {

//        THIS WONT WORK WITH METHOD DEFINITION FOR RECURSIVE SOLUTION
//        long fact = 1;
//        String result = userInt + "! = ";
//
//        for (int i = 1; i <= userInt; i++) {
//            if (!(i == userInt)) {
//                result += i + " x ";
//            } else {
//                result += i + "";
//            }
//            fact *= i;
//        }
//        result += "  = " + fact;
//        System.out.println(result);

//        RECURSIVE EXAMPLE
//        HOW TO STOP
        if (n < 2) {
            return 1;
        }

        return (n * factorial(n -1));

    }

    public static boolean userContinue() {
        System.out.println("Would you like to continue?");
        String userInput = sc.next();
        return userInput.equalsIgnoreCase("y");
    }

    public static int getSidesOfDice() {
        System.out.println("Enter the number of sides for your dice:");
        int userInput = sc.nextInt();
        return userInput;
    }

    public static void rollDice(int sides) {
        int diceOne = getRandomDiceResult(sides);
        int diceTwo = getRandomDiceResult(sides);
        System.out.println("Your die rolled " + diceOne + " and " + diceTwo + "!");
    }

    public static int getRandomDiceResult(int sides) {
        return (int)Math.floor(Math.random()*(sides-1+1)+1);
    }

}


