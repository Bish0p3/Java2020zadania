
public class dziedziczenie {

	public static void main(String[] args) {
        uczenklasy stud = new uczenklasy();
        
		stud.setImie("Jan");
		stud.setNazwisko("Januszewicz");
		stud.setPesel(123456789);
		stud.setNazwa_szkoly("Szkola Srednia 10");
		stud.setKlasa(3);
		
		System.out.println("\n" + stud.Nazwisko);
		System.out.println(stud.Nazwisko);
		System.out.println(stud.Pesel);
		System.out.println(stud.Nazwa_szkoly);
		System.out.println(stud.klasa);
	}

}