import java.util.Scanner;

public class QueFsd05 {
    public static void main(String[] args) {
//        0. You're tasked with creating a program to calculate the fine for overdue library books.
//        Implement a Java program using if-else statements to determine the fine based on the
//        number of days the book is overdue.
//                Rules:
//        If the book is returned within 7 days of the due date, there is no fine.
//                If the book is returned between 8 and 30 days after the due date, the fine is $1.00 per day.
//        If the book is returned more than 30 days after the due date, the fine is $2.00 per day
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Due Day : ");
        int dueDay = sc.nextInt();

        if (dueDay <= 7) {
            System.out.println("No fine");
        }else if(dueDay >8 && dueDay<30){
            System.out.println("Fine is " + (dueDay - 7));
        } else if (dueDay > 30) {
            System.out.println("Fine is " + (dueDay-7) * 2);
        }
    }
}
