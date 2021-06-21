package home_work_3_dop;

public class HanoyTowers {
    // переменная для количество стержней. По условию задачи она постоянная и равна 3
    private final int NUMBER_OF_RODS = 3;

    // переменная для количества колец
    private int numberOfRings;


    private int[][] arr;
    // переменная для режима игры
    private int mode = 0;

    public HanoyTowers(int numberOfRings) {
        this.numberOfRings = numberOfRings;
        // создаем первоначальный массив и выводим на печать
        getFirstArr(numberOfRings);
        /*
        Делаем ход и создаем новый массив с выводом на печать
         */
    }

    public int[][] getArr() {
        return arr;
    }

    private int[][] getFirstArr(int number) {
        int[][] arr = new int[number][NUMBER_OF_RODS];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = i + 1;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] == 0 ? "*" : arr[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
        return this.arr = arr;
    }
}
