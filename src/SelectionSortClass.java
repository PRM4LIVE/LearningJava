import java.util.Arrays;

public class SelectionSortClass {
    public static void main(String[] args) {
         int [] arr = {5, 3, 10, 6, 9};
        System.out.println(Arrays.toString(arr));
         for (int i = 0; i < arr.length; i++) {
            int max = 0;
            int maxIndex = 0;
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] > arr[maxIndex]) {
                    max = arr[j];
                    maxIndex = j;
                }
                int a = arr[arr.length - 1];
                arr[arr.length - 1 -i] = max;
                arr[maxIndex]=a;
            }
             System.out.println(Arrays.toString(arr));
        }
    }
}
