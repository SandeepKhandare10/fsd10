public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        int n=arr.length;
        boolean[] ripited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!ripited[i]) {
                System.out.print(arr[i] + " ");
                ripited[i] = true;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        ripited[j] = true;
                    }
                }
            }
        }
    }
}

