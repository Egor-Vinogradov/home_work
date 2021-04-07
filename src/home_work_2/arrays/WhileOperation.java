package home_work_2.arrays;

public class WhileOperation implements IArraysOperation{
    @Override
    public void itemsInOrderToTheConsole(int[] arrayFromConsole) {
        int j = 0;
        while (j < arrayFromConsole.length) {
            System.out.print(arrayFromConsole[j] + " ");
            j++;
        }
        System.out.println();
    }

    @Override
    public void secondItemToConsole(int[] arrayFromConsole) {
        int j = 1;
        while (j < arrayFromConsole.length) {
            System.out.print(arrayFromConsole[j] + " ");
            j += 2;
        }
        System.out.println();
    }

    @Override
    public void reversItemToConsole(int[] arrayFromConsole) {
        int j = arrayFromConsole.length;
        while (j > 0) {
            System.out.print(arrayFromConsole[j - 1] + " ");
            j--;
        }
        System.out.println();
    }
}
