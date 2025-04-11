import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int s = 2;
        int N = 1000;
        int n[] = new int[s+1];
        double p[] = new double[s+1];
        int k;
        for (int i = 0; i < N; i++) {
            k = rnd.nextInt(s)+1;
            n[k]++;
        }
        System.out.format("Results of flipping a coin %d times\n", N);
        for (int j = 1; j < s+1; j++) {
            p[j]=(double)n[j]/N;
            System.out.format("p%d = %d/%d = %.2f%%\n",j ,n[j] ,N ,100*p[j] );
        }
    }
}