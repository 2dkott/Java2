import java.io.FileNotFoundException;

public class Lesson2Task3 {

    public static void main(String arg[]){
        try {
            printDivision(2, 0);
            printSum(null, 234);
            setElementOfArray(new int[]{ 1, 2 }, 2, 3);
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static void setElementOfArray(int[] array, int index, int value){
        try{
            array[index] = value;
        } catch (IndexOutOfBoundsException e){
            throw new RuntimeException("Массив выходит за пределы своего размера!");
        }
    }

    public static void printDivision(int a, int b){
        try{
            double result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e){
            throw new RuntimeException("Произашло деление на 0!");
        }
    }
    public static void printSum(Integer a, Integer b){
        try{
            System.out.println(a + b);
        } catch (NullPointerException e){
            throw new RuntimeException("Указатель не может указывать на null!");
        }
    }

}
