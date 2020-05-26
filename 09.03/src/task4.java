
// program ktory symuje cyfry pojedynczo w podanym tekscie
import java.util.Scanner;


public class task4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ciąg znaków: ");
        String str = new String (scan.nextLine());

        Integer temp = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                temp += Integer.valueOf(String.valueOf(str.charAt(i)));
            }

        }
        System.out.println(temp);
    }
}
