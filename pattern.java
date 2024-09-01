import java.util.Scanner;

public class pattern {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
    return f;
    }

    public static int binomial(int n,int r){
        int nf=factorial(n);
        int rf=factorial(r);
        int nmrf=factorial(n-r);
        int b=nf/(rf*nmrf);
        return b;

    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
       // int n=sc.nextInt();
        System.out.println("enter value of n: ");
        int n=+sc.nextInt();
        System.out.println("enter value of r: ");
        int r=sc.nextInt();
    
    //    int nf=factorial(n);
    //    int rf=factorial(r);
    //    int nmrf=factorial(n-r);
    System.out.println("The binomial coefficient is: "+binomial(n,r));


    }
}

