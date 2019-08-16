public class FullSort {
    public static void fullSort(int[] arr, int start, int end){
        //递归终止条件
        if(start == end){
            for(Integer integer: arr){
                System.out.print(integer);
            }
            System.out.println();
            return;
        }
        for(int i = start; i <= end; ++i){
            swap(arr, i, start);//用i去换start，注意顺序！
            fullSort(arr, start + 1, end);//注意一定不能写成++start,否则，递归回到这层时，第14行代码的start也加1了！
            swap(arr, start, i);
        }
    }

    public static void swap(int[] a, int num1, int num2){
        if(num1 == num2)//出于优化的考虑，添加这一部分判断！
            return;

        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
    }

    public static void main(String[] args) {
        int[] test = {1,2,3};
        fullSort(test, 0, 2);
    }
}
