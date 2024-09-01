import java.util.*;
 public class OddorEven{
//     public static void odd_even(int n){
//       int  bitmask=1;
//       if((n & 1)==0){
//         System.out.println("even no");
//       }else{
//         System.out.println("Odd no");
//       }
//     }

    public static void getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.println("Bit is: 0");
        }else{
            System.out.println("Bit is: 1");
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    getIthBit( n,3);
   // odd_even(n);
    }
 }