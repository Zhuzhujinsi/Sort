public class SelectSort {
//选择排序时间复杂度O(n^2)
    public static void selectSort(int [] arr){
        if(arr == null || arr.length <= 1)
            return;
        for (int i = 0; i <= arr.length - 2; ++i){
            int minIndex = i;//最小元素的下标
            for (int j = i + 1; j < arr.length; ++j){//j初始值设为"i+1"而不是i，是处于优化的角度!
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);//每次选出最小值和第i个位置的元素交换，一次排序只交换两个元素的位置，与冒泡排序区别开！
        }
    }

    public static void swap(int [] a, int num1, int num2){
        if(num1 == num2)
            return;
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
    }

    public static void main(String[] args) {
        //int [] test = {3,1,6,2,5};
        //int [] test = {1,2,3,4,5};
        int [] test = {5,4,3,2,1};
        selectSort(test);
        for (Integer integer: test){
            System.out.print(integer);
        }
        System.out.println();
    }
}
