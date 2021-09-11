import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Реализует фильтрацию и сортировку числе в списке без использования Collection API и Stream API
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(
                Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4)
        );
        filterPositive(intList);
        sort(intList);
        for (Integer num : intList) {
            System.out.print(num + " ");
        }
    }

    /**
     * Удаляет из списка отрицательные, 0 и нечетные положительные числа
     *
     * @param list - список чисел
     */
    public static void filterPositive(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num <= 0 || num % 2 != 0) {
                iterator.remove();
            }
        }
    }

    /**
     * Сортирует список без использования Collection API и Stream API
     *
     * @param list - список чисел
     */
    public static void sort(List<Integer> list) {
        Integer[] arr = new Integer[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            list.set(i, arr[i]);
        }
    }
}
