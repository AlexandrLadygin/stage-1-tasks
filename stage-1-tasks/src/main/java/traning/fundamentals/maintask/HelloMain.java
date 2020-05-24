//1.Приветствовать любого пользователя при вводе его имени через командную строку.

package traning.fundamentals.maintask;

import java.util.Scanner;

public class HelloMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name and push the <enter>:");
        String name = scanner.nextLine();
        System.out.println("Your name is " + "<<" + name + ">>");
        System.out.println("Hello, " + name + "!");

    }
}
