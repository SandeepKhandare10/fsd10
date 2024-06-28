import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();

        int[] numberarray = new int[n];

        for (int i = 0; i < n; i++) {
            int newnumarr = sc.nextInt();
            numberarray[i] = newnumarr;
        }

//        Arrays.stream(numberarray).min();
        int l = numberarray.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numberarray[i] == numberarray[j]&& i !=j) {
                    count++;
                }

            }
            System.out.println(numberarray[i]);
            System.out.println(count);
        }

    }
}
