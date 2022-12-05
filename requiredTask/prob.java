package requiredTask;

import java.util.Arrays;

public class prob {

    public static void main(String[] args) {
        int[] input = { 24, 2, 45, 20, 56};
        int[] temp = new int[input.length];
        mergeSort(input, temp, 0, input.length - 1);
        System.out.println(Arrays.toString(input));
    }

    private static void mergeSort(int[] array, int[] temp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, temp, start, mid);
            mergeSort(array, temp, mid + 1, end);
            merge(array, temp, start, end, mid);
        }
    }

    private static void merge(int[] array, int[] temp, int start, int end, int mid) {
        for (int i = start; i <= end; i++) {
            temp[i] = array[i];
        }
        int i = start;
        int j = mid + 1;
        int current = start;
        while (i <= mid && j <= end) {
            if (temp[i] <= temp[j]) {
                array[current] = temp[i];
                i++;
            } else {
                array[current] = temp[j];
                j++;
            }
            current++;
        }
        int remaining = mid - i;
        for (int k = 0; k <= remaining; k++) {
            array[current + k] = temp[i + k];
        }
    }
}