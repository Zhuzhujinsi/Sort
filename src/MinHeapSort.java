import java.util.Arrays;

public class MinHeapSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,7,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        for(int i = arr.length/2 - 1; i >= 0; --i){
            adjustHeap(arr, i, arr.length - 1);
        }

        for (int i = arr.length - 1; i > 0; --i){
            swap(arr, 0, i);
            adjustHeap(arr, 0, i - 1);
        }
    }

    public static void adjustHeap(int[] arr, int i, int end){
        for (int k = 2 * i + 1; k <= end; k = 2 * k + 1){
            if(k + 1 <= end && arr[k + 1] < arr[k])
                ++k;

            if(arr[k] < arr[i]){
                swap(arr, k, i);
                i = k;
            }else
                break;
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
