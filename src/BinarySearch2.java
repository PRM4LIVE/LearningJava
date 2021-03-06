public class BinarySearch2 {
    public static int recursiveBinarySearch
            (int arr[], int firstElement, int lastElement, int elementToSearch){
        if (lastElement >= firstElement){
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (arr[mid] == elementToSearch)
                return mid;
            if(arr[mid] > elementToSearch)
                return recursiveBinarySearch(arr, firstElement, mid -1, elementToSearch);
            return recursiveBinarySearch(arr, mid + 1, lastElement, elementToSearch);
        }
        return -1;
    }
    public static int binarySearch ( int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;
        }
        return -1;
    }
}
