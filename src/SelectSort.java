public class SelectSort {

    public static void selectSort(int [] arr){
        if(arr == null || arr.length <= 1)
            return;
        for (int i = 0; i < arr.length - 1; ++i){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
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
        int [] test = {3,1,6,2,5};
        selectSort(test);
        for (Integer integer: test){
            System.out.print(integer);
        }
        System.out.println();
    }
}
