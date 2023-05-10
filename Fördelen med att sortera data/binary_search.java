import java.util.Random;

public class binary_search{

  public static boolean binary_search(int[] array, int key) {
    int min = 0;
    int max = array.length-1;

while (true) {
// jump to the middle int index = ....... ;
int mid = ((max - min)/2) + min;
if (array[mid] == key) {
  // hmm what now?
    //System.out.println("true");
    return true;
      }
      if (array[mid] < key && mid < max) {
        max = mid - 1;
        continue;
// The index position holds something that is less than
// what we're looking for, what is the first possible page? first = ...... ;
      }
      if (array[mid] > key && mid > min) {
// The index position holds something that is larger than // what we're looking for, what is the last possible page? last = ...... ;
          max = mid - 1;
          continue;
}
      // Why do we land here? What shoudl we do?
      break;
  }
    //System.out.println("false");
    return false;
  }
  public static void main(String[] args) {
          int[] OrigArray = new int[] {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10};
          int key = 1;
          int newnum = 10;
          Random random = new Random();

          for (int array = 0; array < 10; array++) {
              binary_search(OrigArray, key);
              int[] newArray = new int[OrigArray.length * 4];
              System.arraycopy(OrigArray, 0, newArray, 0, OrigArray.length);
              OrigArray = newArray;
              long t0 = System.nanoTime();
              boolean test = binary_search(OrigArray,key);
              long t1 = System.nanoTime() - t0;
              System.out.println(OrigArray.length + " | " + key + " | " + test + " | " + t1);
              key *= 4;
              for (int fill = newnum; fill < (OrigArray.length - newnum); fill++) {
                  OrigArray[random.nextInt(OrigArray.length - newnum)] += newnum;
                  newnum++;
              }
          }
      }
}
