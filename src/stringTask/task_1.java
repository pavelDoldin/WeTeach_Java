package stringTask;

import java.util.Arrays;

public class task_1 {

    public static void main(String[] args) {

        ex1("я люблю Java", "я люблю Python");

    }

    public static void ex1(String str1, String str2) {

        // Заменить второе слово в строке str1 есле оно есть в str2. И вернуть резултат.
        // если второе слово ровно str2, то вернуть замена бесполезна.

        String[] str1Split = str1.split(" ");
        String[] str2Split = str2.split(" ");

        if (!str1Split[1].equals(str2Split[1])) {
            str1Split[1] = str2Split[1];
            str1.concat(Arrays.toString(str1Split));
            System.out.println(str1);
        }
        else {
            System.out.println("Замена бесполезна");
        }

    }

    public static void ex0(){
        // Удалить пробелы в начале и конце, перевести в нижний регистор, вернуть результат
        // Надо учить Java и наглийский //

        System.out.println(" Надо учить Java и английский ");
        String str = " Надо учить Java и английский ";
        System.out.println(str.trim().toLowerCase());
    }

}
