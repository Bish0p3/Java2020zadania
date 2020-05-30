import java.util.Scanner;

public class uczenklasy extends uczenszkoly{
	int klasa;
	public void Ustaw_klase()
	{
		System.out.println("Podaj klase: ");
		Scanner in = new Scanner(System.in);
		klasa = in.nextInt();
	}
	public int getKlasa() {
		return klasa;
	}
	public void setKlasa(int klasa) {
		this.klasa = klasa;
	}
}