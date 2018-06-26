import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {

        System.out.println("Compare three numbers");

        Scanner scanner = new Scanner(System.in);
        String biggest = "The BIGGEST number is";
//        int a = 4;
//        int b = 4;
//        int c = 4;

        System.out.println("Enter first Integer number");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter second Integer number");
        int b = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter third Integer number");
        int c = Integer.valueOf(scanner.nextLine());

        System.out.println("Entered numbers : " + a + " , " + b + " , " + c);

        if ((a > b) && (a > c)) {
            System.out.println(biggest + " first (a) = " + a);
        } else {
            if ((a < b) && (b > c)) {
                System.out.println(biggest + " second (b) = " + b);
            } else {
                if ((a == b) & (b == c)) {
                    System.out.println("The entered numbers are EQUALS");
                } else {
                    System.out.println(biggest + " third (c) = " + c);
                }
            }
        }

        scanner.close();
    }

}
