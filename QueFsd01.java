import java.util.Scanner;

public class QueFsd01 {
    public static void main(String[] args) {
//        You're creating a program to evaluate job applicants based on their qualifications and
//        experience. Implement a Java program using if-else statements to assess the eligibility of
//        each applicant for a job position.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Qualification:-");
        char Qualification=sc.next().charAt(0);
//        char Experience=sc.next().charAt(0);
        System.out.println("Enter Your Years of Experiance:-");
        int yearofexp= sc.nextInt();
        boolean btech = true;
        boolean Fresher=true;
//        int yearofexp=2;
        boolean one_year=true;

        if (btech==true && yearofexp==2){
            System.out.println("You can apply as senior Devloper");
        }
        if (btech==true && yearofexp==0){
            System.out.println("You can apply as junior Devloper");
        }
        else if (btech==true && yearofexp==5){
            System.out.println("You can apply as senior Devloper");
        }
        else if (btech==true && yearofexp==7){
            System.out.println("You can apply as Team Lead");
        }
        else {
            System.out.println("Sorry You can't Apply");
        }

    }
}
