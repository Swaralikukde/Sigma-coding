import java.util.Scanner;

class operators {
 public static boolean isEven(int n){
    boolean result;
    if(n%2==0){
        result=true;
    }else{
        result=false;
    }
    return result;
 }
 public static void main(String[] args) {
    System.out.println(isEven(11));
 }
}
