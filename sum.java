import java.util.Scanner;

public class sum {
    public static void sum(){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         while(n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n=n/10;
         }
         System.out.println("The sum of the digits in the number is: "+sum);

    }
    public static void main(String[] args) {
        sum();
    }
}
