public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(arr == null || arr.length <= 1)
            return;
        int pivotKey = arr[low];
        int start = low;
        int end = high;
        while (start < end){
            while (end > start && arr[end] >= pivotKey){
                --end;
            }
            if(end > start) {
                swap(arr, end, start);
                if (start + 1 <= high)//如果不交换，表明有序了（end == start），就不要再进行比较了，start也就不用后移了
                    ++start;
            }

            while (start < end && arr[start] <= pivotKey){
                ++start;
            }
            if(start < end) {
                swap(arr, start, end);
                if (end - 1 >= low)//如果不交换，表明有序了（start == end），就不要再进行比较了，end也就不用前移了
                    --end;
            }

        }
        if(start - 1 > low){
            quickSort(arr, low, start - 1);
        }

        if(end + 1 < high){
            quickSort(arr, end + 1, high);
        }
    }

    public static void swap(int[] arr, int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args) {
        //int[] a = {3,2,6,1,5};
        //int[] a = {1,2,8,3,5,6,7,9,11,23};
        int[] a = {0,0,0,0,0};
        quickSort(a, 0, a.length - 1);
        for(int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
