package traning.collections.optionaltask2;

//2.Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTask2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int k =0;
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        try {
            k = scanner.nextInt();
        } catch (InputMismatchException fg)
        {
            System.out.print("It's not a number!" );
        }
        char [] numbers = String.valueOf(k).toCharArray();
        for(char num : numbers){
            stack.push(num);}
        while(!stack.empty())
        {
            char stackNum;
            stackNum = (Character)stack.pop();
            System.out.print(stackNum);
        }
    }
    }