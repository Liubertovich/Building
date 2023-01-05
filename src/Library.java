public class Library extends Building {
    int polki;
    int knigi;

    public int getPolki() {
        return polki;
    }

    public void setPolki(int polki) {
        this.polki = polki;
    }

    public int getKnigi() {
        return knigi;
    }

    public void setKnigi(int knigi) {
        this.knigi = knigi;
    }


    public Library() {
        super();
    }

    public void CountOfPolki() {
        if (polki >= 2500) {
            System.out.println("Eto krupnaya biblioteka!");
        } else {
            System.out.println("Eto melkaya biblioteka!");
        }
    }


    public void Pamyatnik() {
        if (isCulture()) {
            System.out.println("Biblioteka yavlyaetsa istoricheskim zdaniem!");
        } else {
            System.out.println("Biblioteka NE yavlyaetsa istoricheskim zdaniem!");
        }
    }

    public String toString() {
        return this.name + " \n" + this.year + " \n" + this.adres + " \n" + this.avtor + " \n" + polki + " \n" + knigi + "\n\n\n";
    }

}
