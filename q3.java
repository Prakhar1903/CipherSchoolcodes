import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your monthly income: ");
        double income = scanner.nextDouble();

        System.out.print("Do you have pending dues (true/false): ");
        boolean pendingDues = scanner.nextBoolean();

        String eligibility = (age >= 18 && income >= 30000 && !pendingDues) ? 
                             "You are eligible for premium membership." : 
                             "You are not eligible for premium membership.";

        System.out.println(eligibility);
        scanner.close();
    }
}
