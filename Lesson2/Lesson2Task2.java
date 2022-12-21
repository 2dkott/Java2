import java.util.Arrays;
import java.util.Scanner;

public class Lesson2Task2 {

    public static void main(String arg[]){
        test(null, 2, 0);
        test(new int[]{10,2,3}, 5, 0);
        test(new int[]{10,2,3}, 0, 0);
    }

    public static void test(int[] intArray, int index, int divider){
        try {
            double catchedRes1 = intArray[index] / divider;
            System.out.println("Результат деления = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Произашло деление на 0!");
        } catch (IndexOutOfBoundsException e){
            System.out.printf("\nИндекс %s превысил границы массива(Длина массива: %s)", index, intArray.length);
        } catch (NullPointerException e){
            System.out.println("Массив равен null");
        }

    }
}
