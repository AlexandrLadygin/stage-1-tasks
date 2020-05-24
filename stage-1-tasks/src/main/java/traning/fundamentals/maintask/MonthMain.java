//5.Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
package traning.fundamentals.maintask;

import java.util.Scanner;

public class MonthMain {
    public static void main(String[] args) {

        String[] arrayMonth = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int number = scanner.nextInt();

        switch (number) {
            case (1):
                System.out.println(arrayMonth[0]);
                break;
            case (2):
                System.out.println(arrayMonth[1]);
                break;
            case (3):
                System.out.println(arrayMonth[2]);
                break;
            case (4):
                System.out.println(arrayMonth[3]);
                break;
            case (5):
                System.out.println(arrayMonth[4]);
                break;
            case (6):
                System.out.println(arrayMonth[5]);
                break;
            case (7):
                System.out.println(arrayMonth[6]);
                break;
            case (8):
                System.out.println(arrayMonth[7]);
                break;
            case (9):
                System.out.println(arrayMonth[8]);
                break;
            case (10):
                System.out.println(arrayMonth[9]);
                break;
            case (11):
                System.out.println(arrayMonth[10]);
                break;
            case (12):
                System.out.println(arrayMonth[11]);
                break;
            default:
                System.out.println("incorrectly month number!");
                break;


        }
    }
}