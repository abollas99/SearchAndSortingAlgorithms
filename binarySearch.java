public class binarySearch {
    public static int search(int[] sortedArray, int key) {
        int high = sortedArray.length-1;
        int low = 0;
        while(low <= high){
            int mid = (high + low) / 2;
            if(sortedArray[mid] == key){
                return mid;
            }
            else if(key > sortedArray[mid]){
                low = mid + 1;
            }
            else if(key < sortedArray[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int rSearch(int[] sortedArray, int key, int low, int high)
    {
        int ret = -1;
        if(low <= high && low <= sortedArray.length-1){
            int mid = (int)((low + high) / 2);
            if(sortedArray[mid] < key){
                ret = rSearch(sortedArray, key, mid+1, high);
            }
            else if(sortedArray[mid] > key){
                ret = rSearch(sortedArray, key, low, mid-1);
            }
            else if(sortedArray[mid] == key){
                ret = mid;
            }
        }
        return ret;
    }

    
}
