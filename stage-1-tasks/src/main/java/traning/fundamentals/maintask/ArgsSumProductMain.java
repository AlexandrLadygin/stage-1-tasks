//4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
package traning.fundamentals.maintask;

import java.util.Arrays;

public class ArgsSumProductMain {
    public static void main(String[] args) {

        int Sum = 0;
        int Product = 1;

        System.out.println("Array of args:");
        System.out.println(Arrays.toString(args));

        for (int i = 0; i < args.length ; i++) {
            int num = Integer.parseInt(args[i]);
            Sum +=num;
            Product = Product*num;
        }

        System.out.println("Sum: " + Sum);
        System.out.println("Product: " + Product);

    }
}
