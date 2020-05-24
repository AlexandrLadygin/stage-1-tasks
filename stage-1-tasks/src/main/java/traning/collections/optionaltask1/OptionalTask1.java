package traning.collections.optionaltask1;

//1.Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the path to file for reading ( D://text.txt    as example): ");
        Scanner scanner = new Scanner(System.in);
        String directory = scanner.nextLine();
        FileReader fr= new FileReader(directory);
        Scanner scan = new Scanner(fr);
        ArrayList<String> list = new ArrayList();
        int i = 1;
        while (scan.hasNextLine()) {
            list.add(new String(scan.nextLine()));
            i++;
        }
        fr.close();
        System.out.println(list);
        System.out.println("Enter the path to file for writing ( D://text.txt    as example): ");
        String directory1 = scanner.nextLine();
        FileWriter fw = new FileWriter(directory1);
        Collections.reverse(list);
        fw.write(String.valueOf(list));
        fw.close();
    }
}
