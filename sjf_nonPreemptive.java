import java.util.Scanner;

public class sjf_nonPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for SJF non-preemptive scheduling algorithm");
        System.out.println("Roll no: 119");
        System.out.println("Enter the number of processes: ");
        int n = sc.nextInt();

        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];
        int[] completionTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        // Input process details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Process " + (i + 1) + ":");
            System.out.print("Arrival Time: ");
            arrivalTime[i] = sc.nextInt();
            System.out.print("Burst Time: ");
            burstTime[i] = sc.nextInt();
        }

        // Sort processes based on arrival time (Bubble Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arrivalTime[j] > arrivalTime[j + 1]) {
                    int temp = arrivalTime[j];
                    arrivalTime[j] = arrivalTime[j + 1];
                    arrivalTime[j + 1] = temp;

                    temp = burstTime[j];
                    burstTime[j] = burstTime[j + 1];
                    burstTime[j + 1] = temp;
                }
            }
        }

        // Calculate completion time, waiting time, and turnaround time
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            if (currentTime < arrivalTime[i]) {
                currentTime = arrivalTime[i];
            }
            completionTime[i] = currentTime + burstTime[i];
            turnaroundTime[i] = completionTime[i] - arrivalTime[i];
            waitingTime[i] = turnaroundTime[i] - burstTime[i];
            currentTime = completionTime[i];
        }

        // Calculate average waiting time and average turnaround time
        double avgWaitingTime = 0;
        double avgTurnaroundTime = 0;
        for (int i = 0; i < n; i++) {
            avgWaitingTime += waitingTime[i];
            avgTurnaroundTime += turnaroundTime[i];
        }
        avgWaitingTime /= n;
        avgTurnaroundTime /= n;

        // Print results
        System.out.println("\nProcess\t\t Arrival Time\t\t Burst Time\t\t Completion Time\t Waiting Time\t Turnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t\t" + arrivalTime[i] + "\t\t\t" + burstTime[i] + "\t\t\t" + completionTime[i] + "\t\t\t" + waitingTime[i] + "\t\t\t" + turnaroundTime[i]);
        }
        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }
}
