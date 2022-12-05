package requiredTask;

import java.util.ArrayList;
import java.util.Collections;

public class task03 {
    public static void main(String[] args) {
        Integer num = 20;
        ArrayList<Integer> total = newArrayList(num);
        System.out.println("максимальное из списка: " + Collections.max(total));
        System.out.println("минимальное из списка: " + Collections.min(total));
        Integer sumAverage = 0;
        for(int item : total) {
            sumAverage += item;
        }
        System.out.println("среднее из списка: " + sumAverage / total.size());
    }

    static ArrayList<Integer> newArrayList(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add((int) (Math.random() * 1000));
        }
        System.out.println(list);
        return list;
    }
}
