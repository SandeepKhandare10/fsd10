import java.util.Scanner;

public class Array07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter number for rotet");
        int num = sc.nextInt();
        int []array={40,12,25,30,67,8,9,99,56};
        int n=array.length;

        for (int j=0;j<num;j++) {
            int FisEle = array[0];

            for (int i = 0; i < n-1; i++) {
                array[i] = array[i + 1];
            }
            array[n - 1] = FisEle;
        }
        for (int i=0;i<n;i++){
            System.out.print(" "+array[i]);
        }


    }
}

