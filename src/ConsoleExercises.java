import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);
        System.out.println("Hey user, enter an integer please:");

        int userInt = scanner.nextInt();

        System.out.println("Hey user, enter three words one at a time:");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.printf("Your words are: %n%s%n%s%n%s%n", firstWord, secondWord, thirdWord);
        System.out.println("Enter a sentence:");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);
        System.out.println("Enter a length:");

        int userLength = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter a width:");

        int userWidth = Integer.parseInt(scanner.nextLine());

        System.out.println("Classroom area: " + (userLength * userWidth));
        System.out.println("Classroom perimeter: " + ((2 * userWidth) + (2 * userLength)));


    }


}
