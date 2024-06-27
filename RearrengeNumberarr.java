public class RearrengeNumberarr {
    public static void main(String[] args) {
        int[] arr ={19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        int n = arr.length;
        int [] newarr=new int[n];
        for (int i = 0; i < n; i++) {
            newarr[i]=-1;
            }
            for (int i=0;i<n;i++){
                if (arr[i] >= 0 && arr[i] <n) {
                    newarr[arr[i]] = arr[i];
            }
            }
            for (int i=0;i<n;i++){
            System.out.print(newarr[i]+" ");
        }
//        System.out.println(arr);
    }
}
