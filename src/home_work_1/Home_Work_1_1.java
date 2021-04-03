package home_work_1;

public class Home_Work_1_1 {

    public static byte a = 42;
    public static byte b = 15;
    public static byte c = -42;
    public static byte d = -15;

    public static int i = 1;

    public static void main(String[] args) {
        // 42.5 не работает, т.к. побитовые операторы применяются к целочисленным типам long, int, short, char, byte

        // & and
        andResult();

        // | or
        orResult();

        // ^ XOR
        xorResult();

        // ~ NOT
        notResult();

        // << left shift
        leftShiftResult();

        // >> right shift
        rightShiftResult();


    }

    public static void rightShiftResult() {
        // << right shift
        // двигиет на i нолей вправо
        System.out.println(a>>i);
        /*
        00101010  42
        --------------
        00010101  21*/
        System.out.println(b>>i);
        /*
        00001111  15
        --------------
        00000111  7*/
        System.out.println(c>>i);
        /*
        11010110  -42
        --------------
        01101011  -21*/
        System.out.println(d>>i);
        /*
        11110001  -15
        --------------
        01111000  -8*/
    }

    public static void leftShiftResult() {
        // << left shift
        // двигиет на i нолей влево
        System.out.println(a<<i);
        /*
        00101010  42
        --------------
        01010100  84*/
        System.out.println(b<<i);
        /*
        00001111  15
        --------------
        00011110  30*/
        System.out.println(c<<i);
        /*
        11010110  -42
        --------------
        10101100  -84*/
        System.out.println(d<<i);
        /*
        11110001  -15
        --------------
        11100010  -30*/
    }

    public static void andResult() {
        // & and
        System.out.println(a & b);
        /*
        00101010  42
        00001111  15
        --------------
        00001010  10*/
        System.out.println(c & d);
        /*
        11010110  -42
        11110001  -15
        --------------
        11010000  -48*/
    }

    public static void orResult() {
        // | or
        System.out.println(a | b);
        /*
        00101010  42
        00001111  15
        --------------
        00101111  47*/
        System.out.println(c | d);
        /*
        11010110  -42
        11110001  -15
        --------------
        11110111  -9*/
    }

    public static void xorResult() {
        // ^ XOR
        System.out.println(a ^ b);
        /*
        00101010  42
        00001111  15
        --------------
        00100101  37*/
        System.out.println(c ^ d);
        /*
        11010110  -42
        11110001  -15
        --------------
        00100111  39*/
    }

    public static void notResult() {
        // ~ NOT
        System.out.println(~a);
        /*
        00101010  42
        --------------
        11010101  -43*/
        System.out.println(~b);
        /*
        00001111  15
        --------------
        11110000  -16*/
        System.out.println(~c);
        /*
        11010110  -42
        --------------
        00101001  41*/
        System.out.println(~d);
        /*
        11110001  -15
        --------------
        00001110  14*/
    }
}

