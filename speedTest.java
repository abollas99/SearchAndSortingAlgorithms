
public class speedTest {
    public static void main(String[] args){
        int[] arr = createArray(10000);
        long begin, end, time;
        begin = System.nanoTime();
        selectionSort.sort(arr);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Program took " + time + " nano seconds to run");
    }
    public static int[] createArray(int arrSize){
        int[] arr = new int[arrSize];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100 * (Math.random() > 0.5 ? 1 : -1));
        }
        return arr;
    }

}
