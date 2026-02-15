import java.util.*;

public class countno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();

        System.out.println("Enter the digit to count:");
        int digit = sc.nextInt();

        int count = 0;
        int temp = number;

        while (temp != number) {
            int rem = temp % 10;

            if (rem == digit) {
                count++;
            }

            temp = temp / 10;   // VERY IMPORTANT
        }

        System.out.println("Digit " + digit + " appears " + count + " times.");
        sc.close();
    }
}
