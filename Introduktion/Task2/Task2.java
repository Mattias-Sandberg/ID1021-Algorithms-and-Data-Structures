import java.util.Random;


public class Task2 {

    private static double search(int n, int k, int m) {

        int sum = 0;
        long t_total = 0;
        Random rnd = new Random();
        int[] keys = new int[m];
        int[] array = new int[n];

        for (int j = 0; j < k; j++) {
            // fill the keys array with random number from 0 to 10*n
            for (int i = 0; i < m; i++) {
                keys[i] = 1;
            }
            // fill the array with with random number from 0 to 10*n
            for (int i = 0; i < n; i++) {
                array[i] = rnd.nextInt(10 * n);
            }
            long t0 = System.nanoTime();
            for (int ki = 0; ki < n; ki++) {
                int key = keys[ki];
                for (int i = 0; i < n; i++) {
                    if (array[ki] == keys[i]) {
                        sum++;
                        break;
                    }
                }
            }

            t_total += (System.nanoTime() - t0);
        }
        return ((double) (t_total)) / ((double) k *(double) n);

    }
    public static void main(String[] args){
        System.out.println(search(10000,10000,2000));
    }
}
