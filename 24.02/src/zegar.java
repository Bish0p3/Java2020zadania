/*
    maksymalna godzina zegaru 23:59

    wpisywane dane: 4 cyfry
    uloz z nich maksymalna godzine mozliwa

 1234


 */


public class zegar {
    public static void main(String[] args){

        String godzinaIn = "1234";
        String zegarsort;
            if(godzinaIn.contains("2")){
                zegarsort = "2";
                for(int i = 0; i < 3; i++){
                    if (godzinaIn.contains(Integer.toString(i) )) {
                        System.out.print();
                        StringBuffer sb = new StringBuffer(godzinaIn);
                        sb.delete(0,2);
                    }
                }
                for(int i = 0; i < 5; i++){
                    if (godzinaIn.contains(Integer.toString(i))) {
                        zegarsort = zegarsort + i;
                        StringBuffer sb = new StringBuffer(zegarsort);
                        sb.delete(3,3);
                    }
                }
                for(int i = 0; i < 9; i++){
                    if (godzinaIn.contains(Integer.toString(i))) {
                        zegarsort =zegarsort + i;
                    }
                    StringBuffer sb = new StringBuffer(zegarsort);
                    sb.delete(4,4);
                }
            }

            System.out.println(zegarsort);
    }

}
