public class selectionSort {
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){ 
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void rSort(int[] arr){


         //       if (arr[j] < arr[i]){
           //         int temp = arr[i];
             //       arr[i] = arr[j];
               //     arr[j] = temp;
                //}


    }
}
