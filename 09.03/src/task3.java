//napiac program kotry wczytuje od uzytkownika ciag
//znakow a nastepnie sprawdza czy podany ciag jest palindromem


import java.util.Scanner; // data in keyboard

public class task3 {

    static boolean czyPalindrom(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // data in keyboard
        System.out.println("Podaj ciąg znaków: ");
        String str = new String (scan.nextLine());

        if (czyPalindrom(str))
            System.out.print("Jest palindromem");
        else
            System.out.print("Nie jest palindromem");
    }
} 