import java.util.Random;

public class GraWKosci {
    private int liczbaKostek;
    private int[] wyniki;

    public GraWKosci(int liczbaKostek){
        this.liczbaKostek = liczbaKostek;
        this.wyniki = new int[liczbaKostek];
    }

    public void rzutKostkami() {
        Random random = new Random();

        for (int i = 0; i < liczbaKostek; i++) {
            wyniki[i] = random.nextInt(6) + 1;
        }

    }

    public void wyswietlWyniki(){
        for (int i =0; i< wyniki.length; i++){
            System.out.println("Kostka " + (i +1) + ": " + wyniki[i]);
        }
    }

    public  int liczPunkty(){
        int[] licznik = new int[7];

        for(int wynik : wyniki){
            licznik[wynik]++;
        }
        int suma = 0;
        for (int i =1; i<= 6; i++){
            if(licznik[i] >=2){
                suma+= i * licznik[i];
            }
        }
        return suma;
    }

}
