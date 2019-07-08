import java.util.Arrays;
import java.util.Scanner;
/*二分查找 O(logn)*/
public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        if(arr == null || arr.length == 0)
            return -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) >> 1;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数序列，以空格隔开：");
        int[] test = Arrays.stream(sc.nextLine().trim().split(" ")).mapToInt(Integer::valueOf).toArray();
        System.out.println("请输入查询目标：");
        int target = sc.nextInt();
        System.out.print(binarySearch(test, target));
        System.out.println();
    }
}
