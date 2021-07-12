import java.util.Arrays;
public class Test{
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(arr));
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            int temp = 0;
            int smallest = arr[0];
            int smallestIndex = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < smallest) {
                    smallestIndex = j;
                    smallest = arr[smallestIndex];
                }
            }

            if (arr[i]<arr[smallestIndex]){ System.out.println("Continue"); newArr[i]=arr[i]; continue;}
            newArr[i]=arr[smallestIndex];
            if (arr[i]>arr[smallestIndex]){
            temp = arr[i];
            arr[i]=smallest;
            arr[smallestIndex]=temp;}
            newArr[i]=arr[smallestIndex];

            System.out.println("Проход - "+ (i+1) + " arr: " + Arrays.toString(arr)+" newArr: " + Arrays.toString(newArr));
        }
    }
}

