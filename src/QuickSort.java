public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(arr == null || arr.length <= 1)
            return;
        int pivotKey = arr[low];
        int start = low;
        int end = high;
        while (start < end){
            while (arr[end] >= pivotKey && start < end){
                --end;
            }
            swap(arr, end, start);
            while (arr[start] <= pivotKey && start < end){
                ++start;
            }
            swap(arr, start, end);
        }
        if(start - 1 > low){
            quickSort(arr, low, start - 1);
        }

        if(end + 1 < high){
            quickSort(arr, end + 1, high);
        }
    }

    public static void swap(int[] arr, int num1, int num2){
        if(num1 == num2)
            return;
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3,2,6,1,5};
        quickSort(a, 0, 4);
        for(int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
    }
}
