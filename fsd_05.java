import java.util.Scanner;

public class fsd_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean indian=sc.nextBoolean();
        int age =sc.nextInt();
        boolean voter_id=sc.nextBoolean();
        if(age>18){
            if(indian==true){
                if(voter_id==true){

                }
                System.out.println("");
            }
        }
        else {
            System.out.println("You are not Adult");
        }
    }
}
