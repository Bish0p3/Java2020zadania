public class JakasKlasa {

    static int si, sj;
    int i, j;

    JakasKlasa(int i) {
        System.out.println("Klasa(int i)");
        this.i = i;
    }
    JakasKlasa(int i, int j) {
        this(i);
        System.out.println("Klasa(int i, int j)");
        this.j = j;
    }


    static {
        System.out.println("static {}");
        si = sj = 1;
    }

}

public class cwiczeniestatyczne {
    public static void main(String[] args) {
        
    JakasKlasa jakasKlasa = new JakasKlasa(2, 3);

    }
}
        