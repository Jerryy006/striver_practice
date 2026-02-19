/*palindrome */

import java.util.*;

public class practice{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while(number != 0){

            int digit = number % 10;       

            reverse = reverse * 10 + digit;

            number = number / 10;
        }

        if(reverse == original){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}

/*take a variable of original number and take a reverse variabl.
after that run the while loop .
in that loop add the digit will be equal to the number % 10 this will provide the the last digit of the original number
then take reverse which will get multiplied with 10 and add digit in the reverse.
then take number which will bw equal to number/10, when we devide we cut the last digit. 
now take a if block add condition, if reverse == original number then only print the palindrome if the reverce is not equal to 
original number then print not palindrome. */
