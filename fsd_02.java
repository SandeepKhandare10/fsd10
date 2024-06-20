import java.util.*;

public class fsd_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:-");
        int age=sc.nextInt();
        System.out.println("You have Voter Id:-");
        boolean voter_id=sc.nextBoolean();

        if(age>18 && voter_id==true) {
            System.out.println("You can Vote");
        }
        else{
            System.out.println("You can't vote");
        }
    }
}
