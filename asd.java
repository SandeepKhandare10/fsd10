//import java.util.Scanner;
//
//public class asd {
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        int num= sc.nextInt();
//
//        int[]arr =new int[num];
//        for (int i=0;i<arr.length;i++){
//            int newarr= sc.nextInt();
//            arr[i]=newarr;
//        }
//
//        int Maxnum=arr[0];
//        int n=arr.length;
//        for (int i=0;i<n;i++){
//            if (Maxnum<arr[i])
//            {
////                Maxnum=arr[i];
////                System.out.println(Maxnum);
//                System.out.println(arr[i]);
//            }
//        }
//    }
//}
import java.util.Scanner;

public class asd {
    public static int main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr={1,1,1,2,1,1,1};
        int n = arr.length;

//        int[] arr = new int[n];
        int s = 1;
        int e = n - 1;
        while (s < e) {
            int mid = s + (s - e) / 2;
//            mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        System.out.println(s);
        System.out.println(arr[s]);
        return s;


}
}