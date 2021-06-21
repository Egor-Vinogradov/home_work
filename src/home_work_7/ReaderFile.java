package home_work_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class ReaderFile {
    /*
    Паттерн для удаления переноса строк и знаков пунктуации
     */
    private static final String PATTERN = "[\\p{Punct}\\n]";

    private String path;
    private int numberValues;

    private String[] arr;

    /**
     * Конструктор. Принимает значение пути к файлу.
     * Инициализирует метод преобразования файла к строке
     * Инициализирует заполнение массива слов
     * @param path путь типа String
     */
    public ReaderFile(String path) {
        this.path = path;
        readerToString(path);
        fillingArrayString();
    }

    /**
     * Конструктор. Принимает значение пути к файлу и количество строк, которые нужно вывести
     * для печати рейтинга
     * Инициализирует метод преобразования файла к строке
     * Инициализирует заполнение массива слов
     * @param path путь типа String
     * @param numberValues количество строк для печати
     */
    public ReaderFile(String path, int numberValues) {
        this.path = path;
        this.numberValues = numberValues;
        readerToString(path);
        fillingArrayString();
    }

    /**
     * Метод читает файл из пути, переданный в него, и возвращает строки
     * @param path путь к файлу типа String
     * @return строки из прочитаного файла типа String
     */
    private String readerToString(String path) {
        Path pathFile = Path.of(path);
        String result = "";

        try {
            result = Files.readString(pathFile);
        } catch (IOException e) {
            System.out.println("Ошибка с файлом");;
        }

        return result;
    }

    /**
     * Метод возвращает массив слов в тексте. Убирает знаки препинания и переход на новую строку
     * Слова ищет по пробелам
     * @return возвращает массив слов
     */
    private String[] fillingArrayString() {
        String[] arr = readerToString(this.path).replaceAll(PATTERN, "").split("\\s");
        return this.arr = arr;
    }

    private Set<String> fillingSet() {
        Set<String> set = new HashSet<>();

        for (String s : this.arr) {
            set.add(s);
        }

        return set;
    }

    private List<String> fillingList() {
        List<String> list = new ArrayList<>();

        for (String s : this.arr) {
            list.add(s);
        }
        return list;
    }

    private Map<String, Integer> fillingMap() {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = fillingList();

        //  !!!!!!!!!! переписать !!!!!!!!!!!
        for (String s : this.arr) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (s.equals(list.get(i))) {
                    count++;
                }
            }
            map.put(s, count);
        }
        return sortedMap(map);
    }

    private Map<String, Integer> sortedMap(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                /*
                В следующей строке отнимаем второе значение от первого, чтобы была сортировка
                в обратном порядке. Реверс
                 */
                return b.getValue() - a.getValue();
            }
        });

        /*
        Записываем значения в LinkedHashMap, чтобы соблюсти порядок заполнения
         */
        Map<String, Integer> mapNew = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: list) {
            mapNew.put(entry.getKey(), entry.getValue());
        }

        return mapNew;
    }

    public void printSizeSet() {
        int size = fillingSet().size();
        System.out.println("Количество уникальных слов в переданом файле: " + size);
    }

    public void printRatingWord() {
        int size = fillingList().size();
        System.out.println("Количество всех слов в переданом файле: " + size);
//        System.out.println(fillingMap().size());
        Map<String, Integer> map = fillingMap();
        for (Map.Entry<String, Integer> integerEntry : map.entrySet()) {
            System.out.println(integerEntry);
        }
    }
}
