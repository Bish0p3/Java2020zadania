import java.util.Scanner;

public class uczen {
	static String Imie;
	static String Nazwisko;
	static int Pesel;
	public static char[] klasa;
		
	
	public void Ustaw_imie()
	{	
		System.out.println("Podaj imie: ");
		Scanner in = new Scanner(System.in);
		Imie = in.nextLine();
	}
	public void Ustaw_nazwisko()
	{
		System.out.println("Podaj nazwisko: ");
		Scanner in = new Scanner(System.in);
		Nazwisko = in.nextLine();
	}
	public void Ustaw_pesel()
	{
		System.out.println("Podaj pesel: ");
		Scanner in = new Scanner(System.in);
		Pesel = in.nextInt();
	}
	public String getImie() {
		return Imie;
	}
	public void setImie(String imie) {
		Imie = imie;
	}
	public String getNazwisko() {
		return Nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}
	public int getPesel() {
		return Pesel;
	}
	public void setPesel(int pesel) {
		Pesel = pesel;
	}
}