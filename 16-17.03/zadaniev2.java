
class Punkt{
    int pozx; //max 500
    int pozy; //max 600
}
class Prostokat{
    int x=520;
    int y=600;
}

public class zadaniev2 {
    public static void main(String[] args){
        Punkt pkt = new Punkt();
        Prostokat prst = new Prostokat();

        int zdjcount = 0;
        do {
            do 
            {
                System.out.println("*Zdjecie*");
                System.out.println("Pozycja - X: " + pkt.pozx + " | Y: " + pkt.pozy);
                pkt.pozx +=40;
                zdjcount++;
            }
            while(pkt.pozx <= prst.x);

            if (pkt.pozx - prst.x != 0)
            {
                int roznica = pkt.pozx - prst.x;
                System.out.println("*Zdjecie*");
                pkt.pozx -=roznica;
                System.out.println("Pozycja - X: " + pkt.pozx + " | Y: " + pkt.pozy);
            }
            
            do{

            }
            while(pkt.pozx > 0);
        }
        while(pkt);
    }
}