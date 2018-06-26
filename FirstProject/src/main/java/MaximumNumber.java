import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String B = "The Big num is: ";
//        int n = 0;
//
//        System.out.println("Enter first number:");
//        int numberPrevious = Integer.valueOf(scanner.nextLine());
//
//        while (n < 1) {
//            System.out.println("Enter number to compare");
//            int numberCurrent = Integer.valueOf(scanner.nextLine());
//            if (numberPrevious > numberCurrent) {
//                System.out.println(B + "   234   " + numberPrevious);
//
//            } else {
//                System.out.println(B + "222    " + numberCurrent);
//            }
//            numberPrevious = numberCurrent;
//        }
//
//        scanner.close();
//    }



    int input;
    int counter = 0;
    int sum = 0;
    int max = 0;

        System.out.print("Enter numbers. To break enter 0: ");
                Scanner scanner = new Scanner(System.in);

                while ((input = scanner.nextInt()) != 0) {
                if (input != 0)
                sum = input + sum;
                counter++;

                if (input > max)
                max = input;
                }

                if (counter > 0) {
                System.out.println("The MAX integer is: " + max);
                System.out.println("Total number of integers is:" + counter);
                } else {
                System.out.println("Wrong input.");
                }
}
}