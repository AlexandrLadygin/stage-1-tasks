//3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
package traning.fundamentals.maintask;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersMain {

    public static void main(String[] args) {
        int n;
        int[] arr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter quantity of numbers: ");
        n = in.nextInt();
        arr = new int [n];
        for (int i=0;i<arr.length;i++) {
            arr[i] = (int) (Math.random() * n);
        }

        System.out.println("Out with next line:");
       for (int i: arr) {
            System.out.print(i + "\n");
        }
        System.out.println("Out without next line:");
        System.out.println(Arrays.toString(arr));

    }
}
