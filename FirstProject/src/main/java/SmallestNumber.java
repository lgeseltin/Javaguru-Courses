import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {

        System.out.println("Compare three numbers");

        Scanner scanner = new Scanner(System.in);
        String smallest = "The SMALLEST number is";
        String biggest = "The BIGGEST number is";
//        int a = 0;
//        int b = 0;
//        int c = 0;

        System.out.println("Enter first Integer number");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second Integer number");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter third Integer number");
        int c = Integer.valueOf(scanner.nextLine());

        System.out.println("Entered numbers : " + a + " , " + b + " , " + c);

        if ((a < b) && (a < c)) {
            System.out.println(smallest + " first (a) = " + a);
        } else {
            if ((a > b) || (b < c)) {
                System.out.println(smallest + " second (b) = " + b);
            } else {
                if ((a == b) & (b == c)) {
                    System.out.println("The entered numbers are EQUALS");
                } else {
                    System.out.println(smallest + " third (c) = " + c);
                }
            }
        }

        scanner.close();
    }
}


