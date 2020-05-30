import java.util.Scanner;

public class uczenszkoly extends uczen{
	String Nazwa_szkoly;
	
	public void Ustaw_szkole()
	{
		System.out.println("Podaj nazwe szkoly: ");
		Scanner in = new Scanner(System.in);
		Nazwa_szkoly = in.nextLine();
	}

	public String getNazwa_szkoly() {
		return Nazwa_szkoly;
	}

	public void setNazwa_szkoly(String nazwa_szkoly) {
		Nazwa_szkoly = nazwa_szkoly;
	}
}