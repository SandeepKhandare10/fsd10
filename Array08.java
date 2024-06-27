import java.util.Scanner;

public class Array08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter number");
        int num =sc.nextInt();
        int []array={40,12,25,30,67,8,9,99,56};
        int n=array.length;
        int count = 0;
        int MinEle=array[0];
        for (int i = 0; i < n; i++) {
            if (num==array[i]){
                count++;
            }

//            for (int j = 0; j < n; j++) {
//                if ([i] == [j] && i != j) {
//                    count++;
//                }
//
//            }
//            System.out.println(numberarray[i]);
            System.out.println(count);
        }
    }
}
