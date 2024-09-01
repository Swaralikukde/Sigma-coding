import java.util.*;
public class Sorting {

    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length; turn++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println("The swaps in " + turn + " turn are: " + swap);
        }
    }

    public static void selectionsort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int minPos = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j; 
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    

    public static void insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 7, 3, 6, 2, 9};
        // bubblesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
      // Arrays.sort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
