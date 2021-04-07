package home_work_2.arrays;

public class ForOperation implements IArraysOperation{
    @Override
    public void itemsInOrderToTheConsole(int[] arrayFromConsole) {
        int i;
        for (i = 0; i < arrayFromConsole.length; i++) {
            System.out.print(arrayFromConsole[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void secondItemToConsole(int[] arrayFromConsole) {
        for (int i = 1; i < arrayFromConsole.length; i += 2) {
            System.out.print(arrayFromConsole[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void reversItemToConsole(int[] arrayFromConsole) {
        for (int i = arrayFromConsole.length; i > 0; i--) {
            System.out.print(arrayFromConsole[i - 1] + " ");
        }
        System.out.println();
    }
}
