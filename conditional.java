
class conditional{
    public static void main(String[]args){

        int marks=60;

        if (marks>90){
           System.out.println("excellent");
        }
        else if (marks<=90&&marks>80) {
            System.out.println("good");
        }
        else if (marks<=80&&marks>70){
            System.out.println("fair");
        }
        else if (marks<=70&&marks>=40){
            System.out.println("meets expectation");
        }
        else{
            System.out.println("bellow percentage");

        }
        
        }
    }
    
    

