package com.Lesson_2;

import java.util.InputMismatchException;
import java.util.Scanner;

// specify anticipated exceptions your program is likely to have here
// also you can have a comma separated listing of anticipated exceptions

public class DivisionWithExceptionHandling {
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException
    {
        return numerator / denominator;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try {
                System.out.println("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.println("Please enter an integer denominator");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            }catch (InputMismatchException inputMismatchException ) {
                System.err.printf("%nException: %s%n ", inputMismatchException);
                scanner.nextLine();
                System.out.printf("You must enter integers. Please try again. %n%n");
            }catch (ArithmeticException arithmeticException) {

                System.err.printf("%nException %s%n", arithmeticException.getMessage());
                scanner.nextLine();
                System.out.printf("Zero is an invalid denominator. Please try again. %n%n");

            }catch (Exception exception) {
                System.out.printf("%nException %s%n", exception);

                // obtain the stack-trace information
                StackTraceElement [] traceElements = exception.getStackTrace();
                for(StackTraceElement element : traceElements) {
                    System.out.printf("%nException : %s%n", element.getClassName());

                }
            }
            finally {
                System.out.println("Try . . . catch executed to finally. . . Will always appear");
            }
        }
        while (continueLoop);
    }
}
