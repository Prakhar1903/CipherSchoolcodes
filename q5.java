import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current permissions (0-15): ");
        int permissions = sc.nextInt();

        System.out.print("Enter the bit position to toggle (0-3): ");
        int bitPosition = sc.nextInt();

        System.out.println("Original permissions: " + String.format("%4s", Integer.toBinaryString(permissions)).replace(' ', '0'));

        int updatedPermissions = permissions ^ (1 << bitPosition);

        System.out.println("Updated permissions: " + String.format("%4s", Integer.toBinaryString(updatedPermissions)).replace(' ', '0'));

        sc.close();
    }
}
