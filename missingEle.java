import java.util.Scanner;

public class missingEle {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.println(" Enter number");
//        int num =sc.nextInt();
        int []array={11,12,13,15,16,17,18,19};
        int diff=1;
        int n=array.length;
        for (int i=0;i<n-1;i++){
            if(array[i+1]-array[i]!=1){
                System.out.println(array[i]+1);
            }
        }
    }
}
