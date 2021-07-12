import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1{
    public static void main(String[] args) {
        int[] array = new int[128];
        for (int i = 0, j = 1; i < 128; i++, j++) {
            array[i] = j;
        }
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array2));
        /*Scanner scanner = new Scanner(System.in);
        int ets = scanner.nextInt();
        int index = BinarySearch2.binarySearch(array, ets);
        System.out.println("binarySearch==> " + ets + " in index: " + index);
        int index2 = BinarySearch2.recursiveBinarySearch(array, 0,129,ets);
        System.out.println("recursiveBinarySearch==> " + ets + " in index: " + index2);
        //for(int i: array)
        //System.out.println(i);*/
        int smallIndex = FindSmallest1.findSmallest(array2);
        System.out.println(smallIndex);
    }
}
