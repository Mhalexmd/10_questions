import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] candidates = new int[5];
        int blankVotes = 0;
        int totalVoters = 25;

        System.out.println("Voting System - 5 Candidates (1-5)");
        System.out.println("Enter 0 for blank vote");

        for (int i = 1; i <= totalVoters; i++) {
            System.out.print("Voter " + i + " - Enter your choice (0-5): ");
            int vote = scanner.nextInt();

            while (vote < 0 || vote > 5) {
                System.out.print("Invalid input. Please enter 0-5: ");
                vote = scanner.nextInt();
            }

            if (vote == 0) {
                blankVotes++;
            } else {
                candidates[vote-1]++;
            }
        }

        System.out.println("\nVoting Results:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Candidate " + (i+1) + ": " + candidates[i] + " votes");
        }
        System.out.println("Blank votes: " + blankVotes);

        int maxVotes = 0;
        int winner = -1;
        for (int i = 0; i < 5; i++) {
            if (candidates[i] > maxVotes) {
                maxVotes = candidates[i];
                winner = i+1;
            }
        }

        System.out.println("\nWinner: Candidate " + winner + " with " + maxVotes + " votes");
    }
}