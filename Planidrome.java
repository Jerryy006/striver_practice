import java.util.*;

public class Planidrome{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt;

        int original = number;
        int reverse = 0;

        while(number !=0){

            int digit = number % 10;

            reverse = number * 10 + digit;

            number = reverse / 10;
        }

        if(number == reverse){
            System.out.println("palindrome")
        }
        else{
            System.out.println("not palindrome");
        }
    }
}