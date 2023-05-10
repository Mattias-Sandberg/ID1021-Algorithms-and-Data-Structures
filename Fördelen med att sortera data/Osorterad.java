import java.util.Random;

public class Osorterad
{


        public static boolean search_unsorted(int[] array, int key) {
        for (int index = 0; index < array.length ; index++) {
            if (array[index] == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
            int[] OrigArray = new int[] {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
            int key = 1;
            int newnum = 10;
            Random random = new Random();

            for (int array = 0; array < 10; array++) {
                search_unsorted(OrigArray, key);
                int[] newArray = new int[OrigArray.length * 2];
                System.arraycopy(OrigArray, 0, newArray, 0, OrigArray.length);
                OrigArray = newArray;
                long t0 = System.nanoTime();
                boolean test = search_unsorted(OrigArray,key);
                long t1 = System.nanoTime() - t0;
                System.out.println(OrigArray.length + " | " + key + " | " + test + " | " + t1);
                key *= 2;
                for (int fill = newnum; fill < (OrigArray.length - newnum); fill++) {
                    OrigArray[random.nextInt(OrigArray.length - newnum)] += newnum;
                    newnum++;
                }
            }
        }

}

  /*public static void main (String[] args){
  int [] x = {1,2,3,4,5};
  long t0 = System.nanoTime();
  System.out.println(binary_search(x,5));
  long t1 = System.nanoTime() - t0;
  System.out.println(t1);
}*/
