import java.util.Scanner;

public class QueFsd04 {
    public static void main(String[] args) {
//        You're tasked with creating a program to calculate the total bill for customers at a
//        restaurant. Implement a Java program using if-else statements to calculate the bill based
//        on the items ordered and their prices. The program should also apply any applicable
//        discounts or service charges.
//        Consider the following menu:
//        Starter: $5.00
//        Main Course: $10.00
//        Dessert: $4.50
//        Drinks: $2.50
//        Additional rules:
//        If the total bill is above $50, apply a 10% discount.
//                If the customer orders a dessert, offer a 20% discount on the dessert if they also order a
//        main course
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Starter Quantity:-");
        int starter= sc.nextInt();
        System.out.print("Enter Main_Course Quantity:-");
        int Main_Course=sc.nextInt();
        System.out.print("Enter Dessert Quantity:-");
        int Dessert= sc.nextInt();
        System.out.print("Enter Drinks Quantity:-");
        int Drinks= sc.nextInt();
        int Tstarter=starter*5;
        int TMain_Course=Main_Course*10;
        float TDessert=Dessert*4.5f;
        float TDrinks = Drinks*2.5f;
        float Total_bill=Tstarter+TMain_Course+TDessert+TDrinks;
        System.out.println("Total bill:-"+Total_bill);
//        float Discount_amount=

        if(Dessert>=1&& Main_Course>=1){
            System.out.println("You got 20% Discount:- "+Total_bill*20/100);
            System.out.println("Final Total Bill="+(Total_bill-Total_bill*20/100));
        }


        else if (Total_bill>=50){
            System.out.println("You got 10% Discount"+Total_bill*10/100);
            System.out.println("Final Total Bill="+(Total_bill-Total_bill*10/100));
        }
        else {
            System.out.println("Thank you Visit Again");
        }

    }
}
