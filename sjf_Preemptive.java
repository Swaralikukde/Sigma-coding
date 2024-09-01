import java.util.Scanner;

public class sjf_Preemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for SJF preemptive scheduling algorithm");
        System.out.println("Roll no: 119");
        System.out.println("Enter the number of processes: ");
        int n = sc.nextInt();

        int[] arrivalTime = new int[n];
        int[] burstTime = new int[n];
        int[] remainingTime = new int[n];
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
            remainingTime[i] = burstTime[i];
        }

        int currentTime = 0;
        int completed = 0;
        while (completed != n) {
            int shortest = -1;
            int shortestBurst = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arrivalTime[i] <= currentTime && remainingTime[i] < shortestBurst && remainingTime[i] > 0) {
                    shortestBurst = remainingTime[i];
                    shortest = i;
                }
            }

            if (shortest == -1) {
                currentTime++;
            } else {
                remainingTime[shortest]--;
                if (remainingTime[shortest] == 0) {
                    completed++;
                    completionTime[shortest] = currentTime + 1;
                    turnaroundTime[shortest] = completionTime[shortest] - arrivalTime[shortest];
                    waitingTime[shortest] = turnaroundTime[shortest] - burstTime[shortest];
                }
                currentTime++;
            }
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
