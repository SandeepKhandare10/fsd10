import java.util.Scanner;

public class fsd_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int user_id =sc.nextInt();
        int password=sc.nextInt();

        if(user_id==123 ){
            if (password==321){
                System.out.println("Log in Successful");
            }else {
                System.out.println("Wrong user password");
            }

        }
        else {
            System.out.println("Wrong user id");
        }
    }
}
