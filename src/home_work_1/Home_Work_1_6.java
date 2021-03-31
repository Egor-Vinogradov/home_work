package home_work_1;


import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.Arrays;

public class Home_Work_1_6 {
    public static void main(String[] args) throws ParseException {
        int[] number = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(number));
    }

    public static String createPhoneNumber(int[] number) throws ParseException {
        String phoneMask= "(###)-###-####";
        String intArrayInt = Arrays.toString(number).replaceAll("\\[|\\]|,|\\s", "");

        MaskFormatter maskFormatter= new MaskFormatter(phoneMask);
        maskFormatter.setValueContainsLiteralCharacters(false);

        String result = maskFormatter.valueToString(intArrayInt);

        return result;
    }
}
