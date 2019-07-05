public class DirectingInsert {
//直接插入排序时间复杂度O(n^2)
    public static void directingInsert(int [] arr){
        if(arr == null || arr.length <= 1)
            return;
        int j;
        for(int i = 1; i <= arr.length - 1; ++i){
            int temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; --j){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;//因为循环过后进行了自减操作！
        }
    }

    public static void main(String[] args) {
        int [] test = {3,1,6,2,5};
        directingInsert(test);
        for (Integer integer: test){
            System.out.print(integer);
        }
        System.out.println();
    }
}
