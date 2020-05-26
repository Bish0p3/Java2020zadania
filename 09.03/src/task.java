
// napisać program ktory wczytuje ciag znakow
// ile razy powtarza sie ostatni znak

//String nazwisko = new String("nowak");
//String nazwisko2 = "nowak";


import java.util.Scanner; // data in keyboard

public class task {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // data in keyboard
        System.out.println("Podaj ciąg znaków: ");
        String stringIn = new String (scan.nextLine());
        char lastChar = stringIn.charAt(stringIn.length() -1);
        int howMany = 0;
        for(int i = 0; i <= stringIn.length() -1; i++){

            if(lastChar == stringIn.charAt(i)){
                howMany++;
            }
        }
        System.out.println("Literka powtarza sie:" + howMany);


    }
}
