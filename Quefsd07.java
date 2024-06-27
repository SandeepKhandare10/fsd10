import java.util.Scanner;

public class Quefsd07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int[] numarr= new int[n];
        for (int i=0;i< n;i++){
            int newnumarr=sc.nextInt();

            numarr[i]=newnumarr;
            }
        for (int i=0;i<n;i++){
            System.out.println(numarr[i]);
        }
        System.out.println("Enter search number:- ");
        int serchnub= sc.nextInt();
        boolean found=false;
        for (int i=0;i<n;i++){
            if (numarr[i]==serchnub){
                found=true;
                break;
            }
        }
            if (found){
                System.out.println("Element found");
            }else{
                System.out.println("Element not found");
            }

    }
}
