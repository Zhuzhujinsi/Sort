public class MergeSort {
    public static void merge(int[] a, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int p1 = left;
        int p2 = mid + 1;
        int k = 0;
        while (p1 <= mid && p2 <= right){
            if(a[p1] < a[p2]){
                temp[k++] = a[p1++];
            }else {
                temp[k++] = a[p2++];
            }
        }
        while (p1 <= mid){
            temp[k++] = a[p1++];
        }
        while (p2 <= right){
            temp[k++] = a[p2++];
        }

        int index = 0;
        for (int i = left; i <= right; ++i){
            a[i] = temp[index++];
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end) >> 1;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        //int[] b = {3,2,6,1,5};
        //int[] b = {0,0,0,0,0};
        int[] b = {1,2,66,33,91,0,2,3};
        //int[] b = null;
        if(b == null)
            return;
        mergeSort(b, 0, b.length - 1);
        for (Integer integer : b){
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
