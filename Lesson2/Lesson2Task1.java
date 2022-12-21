import java.util.Scanner;

public class Lesson2Task1 {

    public static void main(String arg[]){
        prompt("Введите дробное число: ");
    }

    private static Float prompt(String message) {
        while(true) {
            try {
                Scanner in = new Scanner(System.in);
                System.out.print(message + "\n");
                System.out.println(Float.parseFloat(in.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели число в неправильном формате\n");
            }
        }
    }

}
