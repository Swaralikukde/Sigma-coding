public class JavaBasics {
    public static void pairs(int numbers[]) {
        int tp = 0, sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    // System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k]; // Fix this line
                    System.out.print(numbers[k] + " ");
                }
                tp++;
                System.out.println("= " + sum);
                sum = 0; // Reset sum for the next subarray
            }
            System.out.println();
        }
        System.out.println("Total subarrays=" + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        pairs(numbers);

        System.out.println();
    }
}
