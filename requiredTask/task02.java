// Пусть дан произвольный список целых чисел, удалить из него четные числа

package requiredTask;

import java.util.LinkedList;
import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> listRandom = newLinkedList(numberOfArrayElements(input));
        oddlinkedList(listRandom);
        input.close();
    }

    static int numberOfArrayElements(Scanner input) {
        while(true) {
            System.out.print("Введите натуральное число: ");
            String line = input.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка ввода, повторите");
            }
        }
    }

    static LinkedList<Integer> newLinkedList(int num) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            list.add((int) (Math.random() * 1000));
        }
        System.out.println(list);
        return list;
    }

    static LinkedList<Integer> oddlinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> sortOdd = new LinkedList<>();
        for (int item : list) {
            if (!(item % 2 == 0)) {
                    sortOdd.add(item);
                }
            }
        System.out.println(sortOdd);
        return sortOdd;
    }
}