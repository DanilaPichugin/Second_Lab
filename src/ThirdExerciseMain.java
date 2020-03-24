import java.io.UnsupportedEncodingException;
import java.io.PrintStream;

public class ThirdExerciseMain {
    public static void main(String[] args) throws  UnsupportedEncodingException{
        String line = "Конфеты 'Маска';45;120";
        String[] item_fld = line.split(";");
        PrintStream printStream = new PrintStream(System.out, true, "cp866");
        printStream.println("String massive : " + java.util.Arrays.toString(item_fld));
        //parseFloat и parseShort возвращает значение в заданных форматах, представленных строкой
        FoodItem foodItemArr = new FoodItem(item_fld[0], Float.parseFloat(item_fld[1]), Short.parseShort(item_fld[2]));
        foodItemArr.printAll();
    }
}
