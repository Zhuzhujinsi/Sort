public class MergeSort {
    //二路归并算法，两个排好序的子序列合并为一个子序列
    public static void merge(int[] a, int left, int mid, int right){
        int length = right - left + 1;
        int[] temp = new int[length];
        int p1 = left;//指向左面数组的第一个元素
        int p2 = mid + 1;//指向右面数组的第一个元素
        int k = 0;
        while (p1 <= mid && p2 <= right){//小数先放在辅助数组内，直到左数组或右数组其中一个全部放入辅助数组内
            if(a[p1] < a[p2]) {
                temp[k++] = a[p1++];
            }else{
                temp[k++] = a[p2++];
            }
        }

        while (p1 <= mid){//如果右数组已经全部放入辅助数组内，将左数组剩下部分放入辅助数组内
            temp[k++] = a[p1++];
        }
        while (p2 <= right){//如果左数组已经全部放入辅助数组内，将右数组剩下部分放入辅助数组内
            temp[k++] = a[p2++];
        }

        for(int i = 0; i < length; ++i){//将辅助数组内的值，拷贝到原数组中
            a[left++] = temp[i];
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
        for(Integer integer : b){
            System.out.println(integer);
        }
    }
}
