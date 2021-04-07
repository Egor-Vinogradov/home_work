package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void itemsInOrderToTheConsole(int[] arrayFromConsole) {
        int j = 0;
        do {
            System.out.print(arrayFromConsole[j++] + " ");
        } while (j < arrayFromConsole.length);
        System.out.println();
    }

    @Override
    public void secondItemToConsole(int[] arrayFromConsole) {
        int j = 1;
        do {
            System.out.print(arrayFromConsole[j] + " ");
            j += 2;
        } while (j < arrayFromConsole.length);
        System.out.println();
    }

    @Override
    public void reversItemToConsole(int[] arrayFromConsole) {
        int j = arrayFromConsole.length;
        do {
            System.out.print(arrayFromConsole[--j] + " ");
        } while (j > 0);
        System.out.println();
    }
}
