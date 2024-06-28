import java.util.Scanner;

public class QueFsd02 {
//    . You're developing a weather recommendation program that suggests activities based
//    on the current temperature. Implement a Java program using if-else statements to
//    provide recommendations as follows:
//    If the temperature is below 10°C, recommend skiing.
//    If the temperature is between 10°C and 20°C (inclusive), recommend hiking.
//    If the temperature is between 20°C and 30°C (inclusive), recommend cycling.
//    If the temperature is above 30°C, recommend swimming.

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Weather");
            int weather= sc.nextInt();
            if(weather<10){
                System.out.println("In this Weather you choose skiing");
            }
            else if (weather>=10 && weather<=20){
                System.out.println("In this Weather you choose hiking");
            }
            else if(weather<=30 && weather>20){
                System.out.println("In this Weather you choose cycling");
            }
            else if(weather>30){
                System.out.println("In this Weather you choose swimming");
            }
            else {
                System.out.println("not Valid");
            }
        }
    }

