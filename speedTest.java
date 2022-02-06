
public class speedTest {
    public static void main(String[] args){
        int[] arr = createArray(1000000);
        int low = 0;
        int high = arr.length - 1;
        int key = 25;
        long begin, end, time;
        //selectionSort.sort(arr);
        begin = System.nanoTime();
        quickSort.sort(arr ,low, high);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Recursive Binary Search took " + time + " nano seconds to run");
    }
    public static int[] createArray(int arrSize){
        int[] arr = new int[arrSize];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
        }
        return arr;
    }

}
