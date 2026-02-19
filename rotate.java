
public class rotate{

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();

        int temp = num;
        int a;
        int divisor = 1;
        int multiplyer = 1;
        

        while(temp>0){
            temp = temp / 10;        
            a++;
    }
          k = k % a;
}
        for(int i = 1; i<=a; i++){
            if(i>=k){
                divisor = divisor * 10;
            }
            else{
                multiplyer = multiplyer * 10;
            }
        }
            int last = num % divisor;
            int first = num / divisor;

            int result = last * multiplyer + first;

            System.out.println("result"+result);
    }
            