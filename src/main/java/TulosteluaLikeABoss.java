
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int laskuri = 0;
        while (laskuri < maara) {
            System.out.print("*");
            laskuri++;
        }
        System.out.println("");

    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        int laskuri = 0;
        while (laskuri < korkeus) {
            tulostaTahtia(leveys);
            laskuri++;
        }
    }

    public static void tulostaTyhjaa(int maara) {
        int laskuri = 0;
        while (laskuri < maara) {
            System.out.print(" ");
            laskuri++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int laskuri = 0;
        int tyhjalle = koko;
        int tahdelle = 0;
        while (laskuri < koko) {
            tyhjalle = tyhjalle - 1;
            tulostaTyhjaa(tyhjalle);
            tahdelle++;
            tulostaTahtia(tahdelle);
            laskuri++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        int laskuri = 0;
        int tahdelle = 1;
        int tyhjalle = korkeus - 1;
        int jalustanLeveys = 3;
        int jalustanKorkeus = 2;
        while (laskuri < korkeus) {
            tulostaTyhjaa(tyhjalle);
            tulostaTahtia(tahdelle);

            tyhjalle = tyhjalle - 1;
            tahdelle = tahdelle + 2;
            laskuri++;
        }
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(jalustanLeveys);
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(jalustanLeveys);

    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

//        tulostaKolmio(5);
        //      System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }

}
