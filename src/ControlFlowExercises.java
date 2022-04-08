import java.util.Scanner;

public class ControlFlowExercises {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
////            i = i + 2;
//            i+=2;
//        } while(i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while(i >= -10);

//        long i = 2L;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while(i < 1000000L);

//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        for (long i = 2L; i < 1000000L; i*=i) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//
//        System.out.println("Here is your table:");
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInt; i++) {
//            System.out.printf("%-6d | %-7d | %-6d%n", i, i * i, i * i * i);
//        }

        boolean anotherGrade = true;
        do {
            System.out.println("Enter an integer: ");
            int userInt = scanner.nextInt();

            if (userInt >= 88) {
                System.out.println("A");
            } else if(userInt >= 80) {
                System.out.println("B");
            } else if(userInt >= 67) {
                System.out.println("C");
            } else if(userInt >= 60) {
                System.out.println("D");
            } else {
                System.out.println("Failure");
            }

            System.out.println("Would you like to continue? (y/n)");
            String userResponse = scanner.next();

            if (!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }
        } while (anotherGrade);
    }
}
