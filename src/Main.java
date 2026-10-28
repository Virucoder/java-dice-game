import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanne = new Scanner(System.in);
        int liczbaKostek;

        do{
            System.out.println("Ile kostek chcesz rzucić? (3-10)");
            liczbaKostek = scanne.nextInt();
        }while ((liczbaKostek <3 || liczbaKostek >10));

        char decyzja;
        do{
            GraWKosci gra = new GraWKosci(liczbaKostek);

            gra.rzutKostkami();
            gra.wyswietlWyniki();

            int punkty = gra.liczPunkty();
            System.out.println("Liczba uzyskanych punktów: " + punkty);

            System.out.println("Jeszcze raz? (t/n)");
            decyzja = scanne.next().charAt(0);

        }while (decyzja == 't');
        System.out.println("Koniec gry.");
        scanne.close();

    }
}
