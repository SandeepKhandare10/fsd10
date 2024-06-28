import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int[] numberarray=new int[n];
        for (int i=0;i<n;i++){
            int newnumarr= sc.nextInt();
            numberarray[i]=newnumarr;
        }
        int l=numberarray.length;
        Arrays.sort(numberarray);
        System.out.println(numberarray[0]+"  "+numberarray[l-1]);
//        System.out.println("max"+numberarray[l-1]);
//        System.out.println(l);


    }
}
