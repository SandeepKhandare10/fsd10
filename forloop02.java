import java.util.Scanner;

public class forloop02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        double n=sc.nextDouble();
//        long n=sc.nextLong();
        int i = 1;
        while (i <= 10) {
            System.out.println(i * n);
            i++;
        }


    }
}
