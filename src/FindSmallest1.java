public class FindSmallest1{
     public static int findSmallest (int[] arr) {
         int smallest = arr[0];
         int smallestIndex = 0;
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] < smallest) {
                 smallestIndex = i;
                 smallest = arr[smallestIndex];

             }

         }
         return smallest;
     }
}
