
// 500x 600mm
// kamera robi zdjecia 40x40mm i przesuwa sie w bok

public class zadanie {
    public static void main(String[] args) {
        int pozx=0; int pozxmax=500;
        int pozy=0; int pozymax=600;
        int zdjcount =0;
        
        do{
            do {
                System.out.println("*Zdjecie*");
                System.out.println("Pozycja - X: " + pozx + "Y: " + pozy);
                pozx += 40;
                zdjcount++;
             }while(pozx <= pozxmax);
            pozx=0;
            pozy+=40;
        }
        while(pozy <= pozymax);
        System.out.println("ILOSC WYKONANYCH ZDJEC: " + zdjcount);
    }
}