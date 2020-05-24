package traning.fundamentals.optionaltask;

/*Для успешного выполнения задания достаточно реализовать 2-4 пункта.
        Задание. Ввести n чисел с консоли.
        +1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        +2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        +3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
        6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.*/

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[]{125689, 20000, 30000, 100, 211, 30450, 10001, 20, 300, 100000};

        Methods methods = new Methods();

        int theShortestNumber = methods.findTheShortest(myArray);
        int theLongestNumber = methods.findTheLongest(myArray);
        int theShortestValueOfLength = Integer.toString(theShortestNumber).length();
        int theLongestValueOfLength = Integer.toString(theLongestNumber).length();
        double averageLength = methods.findTheAverage(myArray);
        System.out.println("THE SHORTEST ELEMENT IS: " + theShortestNumber + " HAS LENGTH: " + theShortestValueOfLength);
        System.out.println("THE LONGEST ELEMENT IS: " + theLongestNumber + " HAS LENGTH: " + theLongestValueOfLength);
        System.out.println("THE AVERAGE LENGTH OF ELEMENTS IS: " + averageLength);
        System.out.println("THE ELEMENTS THAT SHORTER AVERAGE: ");
        methods.findElementsThatShorterAverage(averageLength, myArray);
        System.out.println("THE ELEMENTS THAT LONGER AVERAGE:");
        methods.findElementsThatLongerAverage(averageLength, myArray);

        Arrays.sort(myArray);
        System.out.println("SHORT IN ASCENDING ORDER:");
        System.out.println(Arrays.toString(myArray));

        Integer [] integerArray = IntStream.of(myArray).boxed().toArray(Integer []::new);
        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println("SHORT IN DESCENDING ORDER:");
        System.out.println(Arrays.toString(integerArray));

    }
}

