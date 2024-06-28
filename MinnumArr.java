//public class MinnumArr {
//    public static void main(String[] args) {
//        int arr[]={10,12,35,56,15,12,32,2};
//        int n =arr.length;
//        int Minnum=arr[0];
//        int Maxnum =arr[0];
//        for (int i=0;i<n;i++){
//            if (arr[i]<Minnum ){
//                Minnum=arr[i];
//            }
//            else if(arr[i]>Maxnum){
//                Maxnum=arr[i];
//            }
//        }
//        System.out.println(Minnum+" "+Maxnum);
//    }
//}
import java.util.Scanner;

public class MinnumArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            int newarr=sc.nextInt();
            arr[i]=newarr;
        }
        int Minnum=arr[0];
        int Maxnum =arr[0];
        for (int i=0;i<n;i++){
            if (arr[i]<Minnum ){
                Minnum=arr[i];
            }
            else if(arr[i]>Maxnum){
                Maxnum=arr[i];
            }
        }
        System.out.println(Minnum+" "+Maxnum);
    }
}


