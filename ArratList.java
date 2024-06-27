import java.util.Scanner;
public class ArratList {
    public static void main(String[] args) {
//        int[] markarr={640,560,325,187,185,895,985,};
//        int stnum=markarr.length;
////        markarr[3]=400;
//
//        for (int i=0;i<stnum;i++){
//
//            System.out.println((i+1)+" "+markarr[i]);
//
//        }
//
//        for (int i=2;i<stnum;i++){
//            System.out.println((i+1)+" "+markarr[i]);
//        }
//        System.out.println("Deleting second Element");
//        for(int i=2;i<stnum-1;i++){
//            markarr[i]=markarr[i+1];
//
//        }
//        for (int i=0;i<stnum-1;i++){
//
//            System.out.println((i+1)+" "+markarr[i]);}
        Scanner sc =new Scanner(System.in);
//        int n =sc.nextInt();
//        int[] markarr=new int[n];
//        for (int i=0;i<markarr;i++){
//            int st
//        }
        System.out.println("Enter the no of Student : = ");
        int n = sc.nextInt();

        int[] newArray = new int[n];
        System.out.println("Enter marks of Student : = ");

        for (int i = 0; i < n; i++) {
            int studentMarks = sc.nextInt();
            newArray[i] = studentMarks;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(newArray[i]);
        }
    }
}