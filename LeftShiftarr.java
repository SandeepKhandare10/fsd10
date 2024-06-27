public class LeftShiftarr {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 0, 4, 5};
        int n = arr.length;
        int j = n - 1;
        for (int i = j; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j--;
            }
        }
        for (int i = 0; i <= j; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
