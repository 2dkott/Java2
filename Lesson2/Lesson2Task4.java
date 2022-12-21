import java.util.Scanner;

public class Lesson2Task4 {

    public static void main(String arg[]){
        while(true) {
            try {
                prompt("Введите имя:");
            } catch (Throwable e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message + "\n");
        String input = in.nextLine();
        if(input.replace(" ", "").isBlank()){
            throw new RuntimeException("Была ввдена пустая строка!");
        }
        return input;
    }

}
