
public class kamera {

	public static void main(String[] args) {
		prostokat zdjecie = new prostokat();
		zdjecie.ustawX(0);
		zdjecie.ustawY(0); 
		zdjecie.ustawSzer(500);
		zdjecie.ustawWys(600);
		
		prostokat wkamera = new prostokat();
		wkamera.ustawX(0);
		wkamera.ustawY(0);
		wkamera.ustawSzer(40);
		wkamera.ustawWys(40);
		
		int liczbaZdj = 0; 
		boolean mozna = true;
		
		if(wkamera.wezY() + wkamera.wezWys() <= zdjecie.wezWys() && wkamera.wezX() + wkamera.wezSzer() <= zdjecie.wezSzer())
		{	
			while(wkamera.wezY() < zdjecie.wezWys())
			{
				if(mozna)
				{
					while(wkamera.wezX() < zdjecie.wezSzer())
					{
						liczbaZdj++;
						wkamera.ustawX(wkamera.wezX() + wkamera.wezSzer());
						
						if(wkamera.wezX() + wkamera.wezSzer() > zdjecie.wezSzer() && wkamera.wezX() < zdjecie.wezSzer())
						{
							wkamera.ustawX(zdjecie.wezSzer() - wkamera.wezSzer());
						}
					}
					mozna = false;
				}
				else
				{
					while(wkamera.wezX() > zdjecie.wezX())
					{
						liczbaZdj++;
						wkamera.ustawX(wkamera.wezX() - wkamera.wezSzer());
						
						if(wkamera.wezX() - wkamera.wezSzer() < zdjecie.wezX() && wkamera.wezX() > zdjecie.wezX())
						{
							wkamera.ustawX(zdjecie.wezX());
							liczbaZdj++;
						}
					}
				mozna = true;
                }
                




				wkamera.ustawY(wkamera.wezY() + wkamera.wezWys());
				if(wkamera.wezY() + wkamera.wezWys() > zdjecie.wezWys() && wkamera.wezY() < zdjecie.wezWys()) 
				{
					wkamera.ustawY(zdjecie.wezWys() - wkamera.wezWys());	
				}
			}
        }
        

		System.out.println("Ilosc zdjec: " + liczbaZdj);
	}
}