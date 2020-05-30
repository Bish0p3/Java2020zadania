
public class wyjatek {

	public static void main(String[] args) throws Exception {
		String text = null;

		try {
			Metoda(text);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
	}
	public static void Metoda(String napis)
	{
		System.out.println("Dlugosc napisu: " + napis.length());
	}
}