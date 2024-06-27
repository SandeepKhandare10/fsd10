import java.util.Scanner;

public class src {
    public static int main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int s = 1;
        int e = n - 1;
        for (int i=0;i<n;i++){
            int newarr=in.nextInt();
            arr[i]=newarr;
        }

        while (s < e) {
            int mid = s + (s - e) / 2;
//            mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;

            } else {
                e = mid-1;
            }
        }
        System.out.println(s);
        System.out.println(arr[s]);
        return s;

    }
}
