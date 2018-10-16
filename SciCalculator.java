import java.util.Scanner;
import java.lang.Math;

public class SciCalculator {
    public static void main(String[] args) {
        //initializes variables and scans the user input to the calculator program and displays strings that prompt the user to input the values
        double answer = 0;
        Scanner myScanner = new Scanner(System.in);
        double totalAnswer = 0;
        int numCalculations = 0;
        int count = 0;
        double average;

            System.out.println("Current Result: " + answer);
            System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");

        while (1 == 1) {
            count = count + 1;
            answer = answer + totalAnswer;
            System.out.println("\n" + "Enter Menu Selection:");
            String response03 = myScanner.next();
            // switch statement that checks which operator the user would like to run and runs it with the
            // numbers which were inputted
            switch (response03) {
                case "0":
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(0);
                    break;
                case "1":
                    numCalculations = numCalculations +1;
                    System.out.print("Enter first operand: ");
                    double response01 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double response02 = myScanner.nextDouble();
                    answer = response01 + response02;
                    System.out.print("\n" + "Current Result: " + answer);
                    totalAnswer = totalAnswer + answer;
                    System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");
                    break;
             // if option 2 is chosen, the first and second number is asked and subtraction in performed. The result is printed as the current result.
                case "2":
                    numCalculations = numCalculations +1;
                    System.out.print("Enter first operand: ");
                    double response04 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double response05 = myScanner.nextDouble();
                    answer = response04 - response05;
                    System.out.print("\n" + "Current Result:  " + answer);
                    totalAnswer = totalAnswer + answer;
                    System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");
                    break;
                // if option 3 is chosen, the first and second number is asked and multiplication in performed. The result is printed as the current result.
                case "3":
                    numCalculations = numCalculations +1;
                    System.out.print("Enter first operand: ");
                    double response07 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double response08 = myScanner.nextDouble();
                    answer = response07 * response08;
                    System.out.print("\n" + "Current Result:  " + answer);
                    totalAnswer = totalAnswer + answer;
                    System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");
                    break;
                // if option 3 is chosen, the first and second number is asked and division in performed.
                // The result is printed as current result.
                // the calculator menu appears again
                case "4":
                    numCalculations = numCalculations +1;
                    System.out.print("Enter first operand: ");
                    double response09 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double response00 = myScanner.nextDouble();
                    answer = response09 / response00;
                    System.out.print("\n" + "Current Result:  " + answer);
                    totalAnswer = totalAnswer + answer;
                    System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");
                    break;
                // if option 5 is chosen, the first and second number is asked and exponentiation  in performed.
                // the first number is the base and the second is the exponent
                // The result is printed as current result
                // the calculator menu appears again
                case "5":
                    numCalculations = numCalculations +1;
                    System.out.print("Enter first operand: ");
                    double response1 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double response2 = myScanner.nextDouble();
                    answer = Math.pow(response1, response2);
                    System.out.print("\n" + "Current Result: " + answer);
                    totalAnswer = totalAnswer + answer;
                    System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");
                    break;
                // if option 6 is chosen, the first and second number is asked and logarithm in performed
                // the first number is the base, the second is the yield
                // The result is printed as current result
                // the calculator menu appears again
                case "6":
                    numCalculations = numCalculations +1;
                    System.out.print("Enter first operand: ");
                    double response3 = myScanner.nextDouble();
                    System.out.print("Enter second operand: ");
                    double response4 = myScanner.nextDouble();
                    answer = (Math.log(response4)/Math.log(response3));
                    System.out.print("\n" + "Current Result: " + answer);
                    totalAnswer = totalAnswer + answer;
                    System.out.println("\n" + "Calculator Menu\n" + "---------------\n" + "0. Exit Program\n" + "1. Addition\n" + "2. Subtraction\n" + "3. Multiplication\n" + "4. Division\n" + "5. Exponentiation\n" + "6. Logarithm\n" + "7. Display Average" + "");
                    break;
                // if option 7 is chosen, the average of calculations is shown by divided the total answers over the number of calculations
                // if no calculations are performed yet, an error is printed out
                case "7":
                   if (numCalculations < 1){
                      System.out.println("Error: No calculations yet to average! ");
                   }
                   else {
                       count = count - 1;
                       average = totalAnswer / count;
                       String strDouble = String.format("%.2f", average);
                       System.out.println("Sum of calculations: " + totalAnswer);
                       System.out.println("Number of calculations: " + count);
                       System.out.println("Average of calculations: " + strDouble);
                   }
                    break;
                // the default occurs only when all other cases fail to initialize
                default:
                    System.out.print("\n" + "Error: Invalid selection! ");

            }

        }

    }
}