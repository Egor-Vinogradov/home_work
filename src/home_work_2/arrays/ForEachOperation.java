package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ForEachOperation implements IArraysOperation{
    @Override
    public void itemsInOrderToTheConsole(int[] arrayFromConsole) {
        for (int arr: arrayFromConsole) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    @Override
    public void secondItemToConsole(int[] arrayFromConsole) {
        int j = 1;
        for (int arr: arrayFromConsole) {
            if (j % 2 == 0) {
                System.out.print(arr + " ");
            }
            j++;
        }
        System.out.println();
    }

    @Override
    public void reversItemToConsole(int[] arrayFromConsole) {
        for (int arr: ArraysUtils.returnReversArray(arrayFromConsole)) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
