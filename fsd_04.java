import java.util.Scanner;

public class fsd_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks= sc.nextInt();
        if(marks<100){
            System.out.println("Plase Enter Valid number");
        }
        if (marks<=91 && marks>=100){
            System.out.println("Your Gred is A+");
        }
        else if(marks>=81 && marks<=90){
            System.out.println("Your Gred is A");
        }
        else if(marks>=71 && marks<=80){
            System.out.println("Your Gred is B+");
        }
        else if(marks>=61 && marks<=70){
            System.out.println("Your Gred is B");
        }
        else if(marks>=51 && marks<=60){
            System.out.println(" Your Gred is C");
        }
            else {
            System.out.println("Fail \nBetter Luck Next Time");
        }
    }
}
