import java.util.*;
public class Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int operations = min(X, Y);
            System.out.println("Min Operations:- "+operations );
        }
    }
    public static int min(int X, int Y) {
        int operations = 0;
        while (X != Y) {
            if (X < Y) {
                X = X + 1;
            } else {
                Y = Y + 2;
            }
            operations++;
        }
        return operations;
    }
}
