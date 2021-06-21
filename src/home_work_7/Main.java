package home_work_7;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String file1 = "Война и мир_книга.txt";
        String file2 = "test.txt";

        ReaderFile size = new ReaderFile(file2);
        size.printSizeSet();
        size.printRatingWord();
    }
}
