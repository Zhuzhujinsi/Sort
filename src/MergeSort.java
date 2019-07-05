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

        int index = left;
        for (int i = 0; i < right - left + 1; ++i){
            a[index++] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] b = {3,2,6,1,5};
        mergeSort(b, 0, 4);
        for (Integer integer : b){
            System.out.println(integer);
        }
    }
}
