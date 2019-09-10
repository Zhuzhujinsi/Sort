import java.util.Arrays;
//https://blog.csdn.net/qq_36186690/article/details/82505569
public class MaxHeapSort {
    public static void main(String[] args) {
        int[] arr = {8,9,6,10,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        //1.构建大顶堆
        for (int i = arr.length/2 - 1; i >= 0; --i){
            //从第一个非叶子节点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length - 1);
        }

        //2.调整堆结构+交换堆顶元素与末尾元素
        for (int j = arr.length - 1; j > 0; --j){
            swap(arr, 0, j);
            adjustHeap(arr, 0, j - 1);//缩短一个长度，对堆进行调整。
        }
    }

    public static void adjustHeap(int[] arr, int i, int end){
        for(int k = 2 * i + 1; k <= end; k = 2 * k + 1){//从i结点的左子节点开始，也就是"2*i + 1"处开始
            if(k + 1 <= end && arr[k + 1] > arr[k])//如果左子节点小于右子节点，k指向右子节点
                k++;

            if(arr[k] > arr[i]) {//如果最大子节点大于父节点，交换父子节点
                swap(arr, k, i);
                i = k;//再去判断调整后的子节点
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
