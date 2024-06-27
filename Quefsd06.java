import java.util.Scanner;

public class Quefsd06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arry =new int[6];
        for (int i=0;i<6;i++){
            int userarry = sc.nextInt();
            arry[i]=userarry;
//            System.out.println(arry[i]);
        }
        for (int i=0;i<6;i++){
//            System.out.println(arry[i]);
            if (i%2==0){
                System.out.println("Even number of array "+arry[i]);
            }
        }



    }
}
