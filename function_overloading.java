public class function_overloading {
    public static int sum(int a ,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String args[]) {
        int p=sum(5,6);
        int q=sum(4,5,6);
        //System.out.println("The sum of the two numbers is: "+p);
            System.out.println("The sum of two numbers is: "+p);
        System.out.println("The sum of three numbers is: "+q);

    }
    
}
