
public class SmallestElement {

    public static int findMinimun(int [] arr, int n)
    {
        int min = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {5,2,3,4,1,6,7};
        int n = arr.length;

        int result = findMinimun(arr, n);
        System.out.println(result);
        
    }
}
