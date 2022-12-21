import java.util.Arrays;
import java.util.List;

public class Lesson1Main {

    public static void main(String arg[]){
        int[] DiffArray = compareArrays(new int[]{10,2,3}, new int[]{10,2});
        compareNames(null, "Name");
        removeFromList(Arrays.asList("A", "B", "C"), "A");

    }

    public static int[] compareArrays(int[] arrayA, int[] arrayB){
        int[] diffArray;
        if(arrayA.length!=arrayB.length){
            throw new RuntimeException(String.format("Длины массивов не совпадают!" +
                    " Длинна первого массива %s, длинна второго массива %s", arrayA.length, arrayB.length));
        } else {
            diffArray = new int[arrayA.length];
            for (int i = 0; i<arrayA.length; i++) {
                diffArray[i] = arrayA[i] > arrayB[i] ? arrayA[i] - arrayB[i] : arrayB[i] - arrayA[i];
            }
        }
        return diffArray;
    }

    public static boolean compareNames(String nameA, String nameB){
        try{
            return nameA.equals(nameB);
        } catch (NullPointerException e){
            throw new RuntimeException("Один из параметров null");
        }
    }

    public static void removeFromList(List<String> list, String deleteString){
        try {
            list.remove(deleteString);
        }catch (UnsupportedOperationException e){
            throw new RuntimeException("Приведите список к типу ArrayList");
        }
    }
}
