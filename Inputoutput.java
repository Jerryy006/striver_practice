/*Complete the function printNumber which takes an integer 
input from the user and prints it on the screen.*/

import java.util.Scanner;

class Inputoutput {
    public void printNumber(Scanner sc) {
        System.out.print("Enter the number: ");  
        int n = sc.nextInt();                     
        System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inputoutput obj = new Inputoutput();
        obj.printNumber(sc);
    }
}
