public class BubbleSort {
    //时间复杂度O(n^2)
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; ++i){//理论上需要n-1次
            boolean exchange = false;//设置一个交换标志，如果某次没有交换，则说明已经排序完毕
            for (int j = 0; j <= arr.length - 2 - i; ++j){//判断相邻两个元素大小，大的放后面！注意j初始位置是0，并不是i！
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    exchange = true;
                }
            }
            if(!exchange)
                break;
        }
    }

    public static void swap(int [] a, int num1, int num2){
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
    }

    public static void main(String[] args) {
        int [] test = {4,3,8,1,2,6,9};
        bubbleSort(test);
        for (Integer integer: test){
            System.out.print(integer);
        }
        System.out.println();
    }
}
