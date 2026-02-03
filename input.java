import java.util.Scanner;
/*Problem 1: Print a number entered by the user Task
Take one integer from the user
Print the same number*/

public class input{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("you entered:" +num);
        sc.close();
    }
}
