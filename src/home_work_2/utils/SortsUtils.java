package home_work_2.utils;

public class SortsUtils {
    /**
     * Пузырьковая сортировка
     * @param arr входной параметр массив типа int
     * @return возвращает отсортированный массив
     */
    public static int[] sortArray(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }

    /**
     * Шейкерная сортировка. Проход по два символа в обоих направлениях с заменой числа большего на меньшее
     * @param arr входной параметр массив типа int
     * @return возвращает отсортированный массив
     */
    public static int[] cocktailSort(int[] arr){
        boolean swapped;// переменная для подтверждения окончания цикла
        do {
            // проходим вперед
            swapped = false;
            for (int i = 0; i <=  arr.length - 2; i++){
                if (arr[i] > arr[i + 1]){
                    // если первый элемент больше второго, тогда меняим их местами
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1]= temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            // проход в обратном направлении
            swapped = false;
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        return arr;
    }
}
