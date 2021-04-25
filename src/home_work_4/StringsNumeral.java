package home_work_4;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class StringsNumeral {

    public String toString(int number) {
        // константа количества разрядов
        final int DG_POWER = 3;

        // массив названия и склонения разрядов
        String[][] a_power = new String[][]{
                {"0", ""            , ""             ,""              },  // 1
                {"1", "тысяча "     , "тысячи "      ,"тысяч "        },  // 2
                {"0", "миллион "    , "миллиона "    ,"миллионов "    },  // 3
        };

        // массив названия и склонения чисел
        String[][] digit = new String[][] {
                {""       ,""       , "десять "      , ""            ,""          },
                {"один "  ,"одна "  , "одиннадцать " , "десять "     ,"сто "      },
                {"два "   ,"две "   , "двенадцать "  , "двадцать "   ,"двести "   },
                {"три "   ,"три "   , "тринадцать "  , "тридцать "   ,"триста "   },
                {"четыре ","четыре ", "четырнадцать ", "сорок "      ,"четыреста "},
                {"пять "  ,"пять "  , "пятнадцать "  , "пятьдесят "  ,"пятьсот "  },
                {"шесть " ,"шесть " , "шестнадцать " , "шестьдесят " ,"шестьсот " },
                {"семь "  ,"семь "  , "семнадцать "  , "семьдесят "  ,"семьсот "  },
                {"восемь ","восемь ", "восемнадцать ", "восемьдесят ","восемьсот "},
                {"девять ","девять ", "девятнадцать ", "девяносто "  ,"девятьсот "}
        };

        // дополнительная переменная для расчета
        int mny;

        // инициализируем StringBuilder с начальным пустым значением
        StringBuilder result = new StringBuilder("");

        // переменная делителя
        double divisor = 1;

        // Проверяем входной параметр на заданный задачей диапазон и инициализируем основную рабочую переменную
        if (number <= -999999999 || number >= 999999999) {
            System.out.println("Число не входит в диапазон!");
            return "";
        }
        int psum = number;

        // переменные для выбора колонки массива разряда для склонения
        int one  = 1;
        int four = 2;
        int many = 3;

        // переменные для выбора колонки массива названия числа для склонения
        int hun  = 4;
        int dec  = 3;
        int dec2 = 2;

        // Проверка на ноль. Возвращает ноль
        if (number == 0) {
            return "ноль";
        }

        /**
         * Проверка на минус. Если значение отрицательное, тогда добавляет слово "минус" в начале строки
         */
        if (number < 0) {
            result.append("минус ");
            psum = -psum;
        }

        // разгоняем делитель до максимально разряда
        for (int i = 0; i < DG_POWER; i++) {
            divisor *= 1000;
        }

        // проходим циклом число и собираем результат
        for (int i= DG_POWER - 1; i >= 0; i--) {
            divisor /= 1000;
            mny = (int) (psum / divisor);
            psum %= divisor;
            if (mny == 0) {
                if(i > 0)
                    continue;
                    result.append(a_power[i][one]);
            } else {
                // получаем название числа в зависимости от разряда и добавлем в виде слова в строку
                if (mny >= 100) {
                    result.append(digit[mny / 100][hun]);
                    mny %= 100;
                }
                if (mny >= 20) {
                    result.append(digit[mny / 10][dec]);
                    mny %= 10;
                }
                if (mny >= 10) {
                    result.append(digit[mny - 10][dec2]);
                } else {
                    if(mny >= 1) {
                        // определяем склонение для слова в случае тысяч
                        result.append(digit[mny]["0".equals(a_power[i][0]) ? 0 : 1]);
                    }
                }
                // определяем название разряда. с учетом склонения
                switch(mny) {
                    case 1:
                        result.append(a_power[i][one]);
                        break;
                    case 2:
                    case 3:
                    case 4:
                        result.append(a_power[i][four]);
                        break;
                    default:
                        result.append(a_power[i][many]);
                        break;
                }
            }
        }

        // делаем первую букву результата заглавной. Остальные строчные
        String output = Character.toUpperCase(result.toString().charAt(0)) + result.substring(1);

        return output;
    }

    public String toString(double number) {
        // инициализируем StringBuilder с начальным пустым значением
        StringBuilder result = new StringBuilder("");

        // добавляем левую часть числа (до запятой)
        result.append(toString((int) number) + "целых ");

        // добавляем правую часть числа (после запятой)
        int hundredths = (int) (number * 100 - (int) number * 100);
        // переводим в строку и убираем заглавную букву
        result.append(toString(hundredths).toLowerCase() + "сотых");

        return result.toString();
    }

    public String toWeek(int day) {
        // проверка на интервал
        if (day < 0 || day >= 999999999) {
            System.out.println("Введенное количество дней не входит в диапазон!");
            return "";
        }

        // массив склонения "недели"
        String[] a_week = new String[]
                {" неделя", " недели", " недель"};

        // переменная количества недель
        int quantityWeek = day / 7;

        // инициализируем StringBuilder с начальным пустым значением
        StringBuilder result = new StringBuilder("");

        // добавляем количество недель (число) в строку
        result.append(quantityWeek);

        // переменные для выбора колонки массива разряда для склонения
        // результат деления равен 1
        int one = 0;
        // результат деления от 2 до 4
        int two = 1;
        // результат деления 0, либо от 5 до 19
        int five = 2;

        if (quantityWeek >= 5 && quantityWeek <= 19) {
            result.append(a_week[five]);
        } else {
            // если больше 19, то уменьшаем до 1 знака
            if (quantityWeek > 19) {
                quantityWeek %= 10;
            }

            // добавляем интервал
            switch (quantityWeek) {
                case 1:
                    result.append(a_week[one]);
                    break;
                case 2:
                case 3:
                case 4:
                    result.append(a_week[two]);
                    break;
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    result.append(a_week[five]);
                    break;
            }
        }
        return result.toString();
    }

    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat) {
        // проверка на интервал
        if (millisecond < 0 || millisecond >= 999999999) {
            System.out.println("Введенное количество милисекунд не входит в диапазон!");
            return "";
        }

        // константа количества форматов
        final int DG_FORMAT = 4;

        // массив названия и склонения разрядов
        String[][] a_time = new String[][]{
                {" час "          , " часа "        ," часов "      },  // 1
                {" минута "       , " минуты "      ," минут "      },  // 2
                {" секунда "      , " секунды "     ," секунд "     },  // 3
                {" миллисекунда " , " миллисекунды "," миллисекунд "},  // 4
        };

        // инициализируем StringBuilder с начальным пустым значением
        StringBuilder result = new StringBuilder("");

        // переменные для выбора колонки массива разряда для склонения
        // результат деления равен 1
        int one = 0;
        // результат деления от 2 до 4
        int two = 1;
        // результат деления 0, либо от 5 до 19
        int five = 2;

        // паттерны форматов
        // общий формат
        String patternShortFormat = "HH:mm:ss.SSS";
        // массив для частных форматов
        String[] arrPatternShortFormat = new String[DG_FORMAT];
        arrPatternShortFormat[0] = "HH";
        arrPatternShortFormat[1] = "mm";
        arrPatternShortFormat[2] = "ss";
        arrPatternShortFormat[3] = "SSS";

        if (shortFormat) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternShortFormat);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            result.append(simpleDateFormat.format(millisecond));
            return result.toString();
        } else {
            for (int i = 0; i < DG_FORMAT; i++) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(arrPatternShortFormat[i]);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                // числовой результат. убираем лидирующие нули
                int value = Integer.parseInt(simpleDateFormat.format(millisecond));
                result.append(value);

                if (value >= 5 && value <= 19) {
                    result.append(a_time[i][five]);
                } else {
                    // если больше 19, то уменьшаем до 1 знака
                    if (value > 19) {
                        value %= 10;
                    }

                    // добавляем интервал
                    switch (value) {
                        case 1:
                            result.append(a_time[i][one]);
                            break;
                        case 2:
                        case 3:
                        case 4:
                            result.append(a_time[i][two]);
                            break;
                        case 0:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            result.append(a_time[i][five]);
                            break;
                    }
                }
            }
            return result.toString();
        }
    }
}
