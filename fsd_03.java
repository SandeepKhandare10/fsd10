import java.util.Scanner;

public class fsd_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First_Num:-");
        int First_Num= sc.nextInt();
        System.out.println("Enter B:-");
        int Second_Num= sc.nextInt();
        System.out.println("Enter Third_Num:-");
        int Third_Num= sc.nextInt();
        if (First_Num>Second_Num && First_Num>Third_Num){
            System.out.println("A is greater");
        }
        else if(Second_Num>First_Num && Second_Num>Third_Num){
            System.out.println("B is greater");
        }
        else {
            System.out.println("Third_Num is greater");
        }
    }
}
